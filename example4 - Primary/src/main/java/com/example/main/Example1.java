package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println(" Vehicle from Spring Context is ::::"+vehicle1.getName());



    }
}
