package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres{

    @Override
    public void rotate() {
        System.out.println(" Vehicle is moving with BridgeStone Tyres");
    }
}
