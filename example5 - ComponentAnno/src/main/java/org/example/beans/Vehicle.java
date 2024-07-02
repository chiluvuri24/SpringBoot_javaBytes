package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name="Toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String printHello(){
        return " Printing Hello from Component Bean";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
