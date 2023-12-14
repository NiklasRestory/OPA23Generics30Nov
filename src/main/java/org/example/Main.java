package org.example;

import org.example.RepetitionInterfaces.Engine;
import org.example.RepetitionInterfaces.ImagineThisIsAGame;
import org.example.RepetitionInterfaces.TurboEngine;
import org.example.RepetitionInterfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(new Engine());
        //Vehicle vehicle = new Vehicle(new TurboEngine());
        //vehicle.run();

        ImagineThisIsAGame game = new ImagineThisIsAGame();
        //game.run();

        GenericDemonstration genericDemonstration = new GenericDemonstration();
        genericDemonstration.run();
    }
}