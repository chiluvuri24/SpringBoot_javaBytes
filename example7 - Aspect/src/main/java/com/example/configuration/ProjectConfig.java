package com.example.configuration;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"org.example.beans","com.example.services","com.example.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {



}
