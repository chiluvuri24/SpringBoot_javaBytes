package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.BoseSpeakers;
import org.example.beans.Person;
import org.example.beans.Speakers;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeExample {

    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);

        BoseSpeakers speakers1 = context.getBean(BoseSpeakers.class);
        BoseSpeakers speakers2 = context.getBean("boseSpeakers",BoseSpeakers.class);

        System.out.println(" Hashcode of Speakers1 :::"+speakers1.hashCode());
        System.out.println(" Hashcode of Speakers2 :::"+speakers2.hashCode());

        if(speakers1==speakers2){
            System.out.println(" BoseSpeakers bean is Singleton");

        }


    }
}
