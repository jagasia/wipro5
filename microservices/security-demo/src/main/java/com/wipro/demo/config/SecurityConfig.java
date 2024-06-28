package com.wipro.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig { 
  
    // User Creation 
    @Bean
    public UserDetailsService	 userDetailsService(PasswordEncoder encoder) { 
  
        // InMemoryUserDetailsManager 
        UserDetails admin = User.withUsername("sai") 
                .password(encoder.encode("123")) 
                .roles("ADMIN", "USER") 
                .build(); 
  
        UserDetails user = User.withUsername("krishna") 
                .password(encoder.encode("123")) 
                .roles("USER") 
                .build(); 
  
        return new InMemoryUserDetailsManager(admin, user); 
    } 
  
    // Configuring HttpSecurity 
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
        return http.csrf().disable() 
                .authorizeHttpRequests() 
                .requestMatchers("/login").permitAll() 
                .and() 
                .authorizeHttpRequests().requestMatchers("/api/v2/**").authenticated() 
//                .and() 
//                .authorizeHttpRequests().requestMatchers("/auth/admin/**").authenticated() 
                .and().formLogin() 
                .and().build(); 
    } 
  
    // Password Encoding 
    @Bean
    public PasswordEncoder passwordEncoder() { 
        return new BCryptPasswordEncoder(); 
    } 
  
} 