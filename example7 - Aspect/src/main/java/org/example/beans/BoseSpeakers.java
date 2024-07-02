package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BoseSpeakers implements Speakers {


    @Autowired
    public BoseSpeakers(){
        System.out.println(" BoseSpeakers Constructor Executed");
    }

    @Override
    public String playMusic()
    {
        return  "Sound is playing from Bose Speakers";
    }
}
