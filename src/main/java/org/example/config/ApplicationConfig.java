package org.example.config;

import org.example.Car;
import org.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Person person(){
        Person p1 = new Person();
        p1.setFirstName("Mike");
        p1.setLastName("Trevor");
        p1.setAge(25);
        p1.setMyCar(car());
        return p1;
    }

    @Bean
    public Car car(){
        //use same car() method while referring
        Car c1 = new Car();
        c1.setMake("Honda");
        c1.setModel("City");
        c1.setYear(2023);
        return c1;
    }
}
