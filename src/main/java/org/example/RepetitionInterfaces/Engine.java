package org.example.RepetitionInterfaces;

public class Engine implements IEngine {
    private boolean running;
    private int speed;

    public void start() {
        if (!running) {
            System.out.println("Engine has started.");
        }
        else {
            System.out.println("Engine was already on.");
        }
        running = true;
    }

    public void accelerate() {
        if (running) {
            speed++;
            System.out.println("Now driving in " + speed + " km/h");
        }
        else {
            System.out.println("Can't accelerate if the engine is off!");
        }
    }

    public void brake() {
        speed--;
        if (speed > 0) {
            System.out.println("Now driving in " + speed + " km/h");
        }
        else {
            speed = 0;
            System.out.println("We are not moving.");
        }
    }

    public void stop() {
        if (!running) {
            System.out.println("Engine was already off.");
        }
        else {
            System.out.println("Engine is turned off.");
        }
        running = false;
    }
}
