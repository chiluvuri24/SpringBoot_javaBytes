package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres{

    @Override
    public void rotate() {
        System.out.println(" Vehicle is moving with Michelin Tyres");
    }
}
