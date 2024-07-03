package com.wipro.demo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String bootstrapServers="127.0.0.1:9092";
    	Properties properties=new Properties();
    	properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    	properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    	KafkaProducer first_producer = new KafkaProducer<>(properties);
    	ProducerRecord<String, String> record=new ProducerRecord<String, String>("my_first", "This is my fifth message");
        System.out.println( "Hello World!");
        
        first_producer.send(record);
        first_producer.flush();
        first_producer.close();
    }
}
