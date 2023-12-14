package org.example.RepetitionInterfaces;

import java.util.Scanner;

public class ImagineThisIsAGame {

    IFunctionalInterface functionalInterface;

    public void run() {
        functionalInterface = () -> {
            System.out.println("This is a function!");
        };
        functionalInterface = () -> System.out.println("This is a function!");

        gameLoop();
    }

    IFunctionalInterface gameState;

    public void gameLoop() {
        gameState = () -> running();

        while (true) {
            gameState.function();
        }
    }

    Scanner scanner = new Scanner(System.in);
    public void running() {
        System.out.println("Game is playing!");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("pause")) {
            gameState = () -> paused();
        }
    }

    public void paused() {
        System.out.println("Game is paused!");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("continue")) {
            gameState = () -> running();
        }
    }
}
