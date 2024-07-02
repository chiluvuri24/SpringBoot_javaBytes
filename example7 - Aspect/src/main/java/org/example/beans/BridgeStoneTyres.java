package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres{

    @Override
    public String rotate() {
        return " Vehicle is moving with BridgeStone Tyres";
    }

    @Override
    public String stop() {
        return "Driver applied Brake! vehicle stopped";
    }
}
