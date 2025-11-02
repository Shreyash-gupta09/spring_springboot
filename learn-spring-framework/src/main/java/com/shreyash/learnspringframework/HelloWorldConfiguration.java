package com.shreyash.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String firstline,String city){};
record Person(String name,int age,Address address) {};


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
        return new Person("Priyanka",18,new Address("Neeladari","Electronic"));
    }
    @Bean
    public Person person2MethodCall()
    {
        return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameters(String name,int age,Address address)
    {
        return new Person(name,age,address);
    }
    @Bean
    public Address address()
    {
        return new Address("IIT A","Prayagraj");
    }
}
