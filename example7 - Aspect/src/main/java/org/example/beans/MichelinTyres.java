package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres{

    @Override
    public String rotate() {
        return " Vehicle is moving with Michelin Tyres";
    }

    @Override
    public String stop() {
        return "Driver applied Brake! vehicle stopped";
    }
}
