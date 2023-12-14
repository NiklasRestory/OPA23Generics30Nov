package org.example.RepetitionInterfaces;

import java.util.Scanner;

public class Vehicle {
    // A primary use of interfaces is creating more flexible classes.
    // I can entirely replace what this engine is.
    IEngine engine;

    public Vehicle() {
        engine = new Engine();
    }
    public Vehicle(IEngine engine) {
        this.engine = engine;
    }

    Scanner scanner = new Scanner(System.in);

    public void run() {

        while (true) {

            System.out.println("Choose an option");

            System.out.println("1. Start Engine");
            System.out.println("2. Accelerate");
            System.out.println("3. Brake");
            System.out.println("4. Stop Engine");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    engine.start();
                    break;
                case "2":
                    engine.accelerate();
                    break;
                case "3":
                    engine.brake();
                    break;
                case "4":
                    engine.stop();
                    break;
                default:
                    System.out.println("Not one of the options.");
                    break;
            }
        }

    }

}
