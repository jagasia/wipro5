package com.wipro.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.wipro.demo")
public class MyConfiguration {

	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dms=new DriverManagerDataSource();
//		dms.setDriverClassName("com.mysql.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/wipro5");
		dms.setUsername("root");
		dms.setPassword("");
		return dms;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sfb=new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource());
		sfb.setPackagesToScan("com.wipro.demo");
		sfb.setHibernateProperties(hibernateProperties());
		sfb.setAnnotatedClasses(Employee.class);
		return sfb;
	}
	
	@Bean
	public HibernateTemplate ht()
	{
		HibernateTemplate ht=new HibernateTemplate();
		ht.setSessionFactory(sessionFactory().getObject());
	    ht.setCheckWriteOperations(false);

		return ht;
	}
	
	private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(
          "hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty(
                "hibernate.show_sql", "true");
        hibernateProperties.setProperty(
          "hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        return hibernateProperties;
    }
//	 @Bean
//	    public PlatformTransactionManager hibernateTransactionManager() {
//	        HibernateTransactionManager transactionManager
//	          = new HibernateTransactionManager();
//	        transactionManager.setSessionFactory(sessionFactory().getObject());
//	        return transactionManager;
//	    }
	
	@Bean
	public HibernateTransactionManager transactionManager() {
	           HibernateTransactionManager txManager = new HibernateTransactionManager();
	           txManager.setSessionFactory(sessionFactory().getObject());

	return txManager;

	  }
}
