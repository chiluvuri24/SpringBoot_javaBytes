package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        Vehicle veh =new Vehicle();
        veh.setName("XUV 3XO");

        System.out.println(" Vehicle from non Spring context ::::"+veh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean("vehicle2",Vehicle.class);
        System.out.println(" Vehicle from Spring Context is ::::"+vehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println(" String value from spring context is :::"+ hello);

        var num = context.getBean(Integer.class);
        System.out.println(" Number from Spring context is ::"+ num);


    }
}
