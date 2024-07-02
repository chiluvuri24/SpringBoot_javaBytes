package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean("nexonVehicle",Vehicle.class);
        System.out.println(" Vehicle from Spring Context is ::::"+vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hectorVehicle",Vehicle.class);
        System.out.println(" Vehicle from Spring Context is ::::"+vehicle2.getName());

        Vehicle vehicle3 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println(" Vehicle from Spring Context is ::::"+vehicle3.getName());


    }
}
