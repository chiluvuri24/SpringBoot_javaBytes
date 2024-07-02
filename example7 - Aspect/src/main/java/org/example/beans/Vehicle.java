package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name="Toyota";


    @Autowired
    private Speakers speakers;

    private Tyres tyres;


    public void playMusic(){
        System.out.println(speakers.playMusic());
    }

    public void moveVehicle(){
        tyres.rotate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String printHello(){
        return " Printing Hello from Component Bean";
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speakers=" + speakers +
                ", tyres=" + tyres +
                '}';
    }
}
