package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Volkswagen");

        Supplier<Vehicle> volksSupplier = ()-> vehicle;

        Supplier<Vehicle> audiSupplier = ()->{
          Vehicle vehicle1 = new Vehicle();
          vehicle1.setName("Audi");
          return vehicle1;
        };

        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(" Random Number :::"+number);

        if(number%2==0){
           context.registerBean("volkswagen",Vehicle.class,volksSupplier);
        }else{
            context.registerBean("audi", Vehicle.class,audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle =  context.getBean("volkswagen", Vehicle.class);
            //System.out.println(volksVehicle.getName());
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Failed to create volks Bean");
        }

        try{

            audiVehicle =  context.getBean("audi", Vehicle.class);

        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println(" Failed to create audi bean");
        }

       if(volksVehicle != null){
           System.out.println(volksVehicle.getName());
       }else{
            System.out.println(audiVehicle.getName());
        }
    }
}
