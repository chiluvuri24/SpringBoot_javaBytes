package com.example.configuration;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="audiVehicle")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Primary
    @Bean(value="nexonVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Nexon EV");
        return veh;
    }

    @Bean("hectorVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("MG Hector");
        return veh;
    }


    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }


}
