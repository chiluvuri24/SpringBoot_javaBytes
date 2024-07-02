package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiringExample {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Vehicle vehicle = context.getBean( Vehicle.class);
        Person person =context.getBean( Person.class);

        System.out.println(" Person Name is :::"+person.getName());
        System.out.println(" Person Vehicle Name is :::"+person.getVehicle());

        //System.out.println(" Vehicle Name is ::::"+vehicle.getName());
        System.out.println(" ");

    }
}
