package com.example.main;

import com.example.configuration.ProjectConfig;
import org.example.beans.BoseSpeakers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EagerLazyScopeExample {

    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(" Before Bean Creation");
        BoseSpeakers speakers1 = context.getBean(BoseSpeakers.class);
        System.out.println(" After Bean Creation");


    }
}
