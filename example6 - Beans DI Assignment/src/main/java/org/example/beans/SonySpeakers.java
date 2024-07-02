package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    @Override
    public void playMusic() {
        System.out.println(" Sound is playing from Sony Speakers");
    }
}
