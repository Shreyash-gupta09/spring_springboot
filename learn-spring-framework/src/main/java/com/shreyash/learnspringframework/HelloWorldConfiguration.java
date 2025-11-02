package com.shreyash.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){};
record Address(String firstline,String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name()
    {
        return "Shreyash";
    }
    @Bean
    public int age()
    {
        return 15;
    }
    @Bean
    public Person person()
    {
        return new Person("Priyanka",18);
    }
    @Bean
    public Address address()
    {
        return new Address("IIT A","Prayagraj");
    }
}
