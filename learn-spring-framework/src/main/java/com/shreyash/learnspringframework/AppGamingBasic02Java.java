package com.shreyash.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic02Java {
    public static void main(String[] args) {
        //1.Launch a Spring Context
        var context=
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2.Configure the things you want spring to mangae in the configuration class
        // HelloWorldConfiguration -@Configuration
        // name-@Bean

        //3. Retrieving beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address"));
    }
}
