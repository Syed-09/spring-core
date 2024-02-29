package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Data
//@Getter //need to have setter also
//@AllArgsConstructor //must need no args constructor for spring
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //@Autowired // to use this, remove AutoWire attribute in xml file
    //private Car mycar;

    private Car myCar;


    public Person(String firstName,String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getPersonDetails(){
        return this.firstName+" "+ this.myCar.getCarDetails();
    }

}
