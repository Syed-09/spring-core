package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Getter //need to have setter also
//@AllArgsConstructor //must need no args constructor for spring
//@NoArgsConstructor
public class Car {
    private String make;
    private String model;
    private int year;


    public String getCarDetails(){
        return this.make+":"+this.model+":"+this.year;
    }
}