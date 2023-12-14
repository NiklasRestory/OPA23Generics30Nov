package org.example.RepetitionInterfaces;

public class TurboEngine implements IEngine {
    int speed = 0;
    @Override
    public void start() {
        System.out.println("No need to start it, the TURBOENGINE is always on!");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Now driving in " + speed + " km/s!");
    }

    @Override
    public void brake() {
        speed -= 10;
        if (speed > 0) {
            System.out.println("Now driving in " + speed + " km/s!");
        }
        else if (speed < 0) {
            System.out.println("Now reversing in " + speed + " km/s!");
        }
    }

    @Override
    public void stop() {
        System.out.println("You cannot stop the TURBOENGINE!");
    }
}
