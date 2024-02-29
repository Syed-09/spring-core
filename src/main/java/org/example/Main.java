package org.example;

import org.example.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ////Use this while using XML file
        //ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //use this while using .java file
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

//        //use same id as of in xml (person)
//        Person p1 = (Person) context.getBean("person"); //in case of xml only
        Person p1 = (Person) context.getBean(Person.class);

        System.out.println("First Name: "+p1.getFirstName());
        System.out.println("Last Name: "+p1.getLastName());
        System.out.println(p1.getPersonDetails());

    }
}