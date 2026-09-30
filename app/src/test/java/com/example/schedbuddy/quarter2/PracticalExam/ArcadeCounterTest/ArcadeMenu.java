
package com.example.schedbuddy.quarter2.PracticalExam.ArcadeCounterTest;

import java.
        util.Scanner;

public class ArcadeMenu {

    public void start(Scanner scanner) {

        // Keeps the menu running until the user chooses Exit
        boolean running = true;

        while (running) {

            // Display the arcade menu
            System.out.println("1. Buy Tokens");
            System.out.println("2. Claim Prize");
            System.out.println("3. Exit");

            // Get the user's menu choice
            int choice = scanner.nextInt();

            // Route the choice to the correct option
            if (choice == 1) {
                System.out.println("Buy Tokens Selected");

            } else if (choice == 2) {
                System.out.println("Claim Prize Selected");

            } else if (choice == 3) {
                System.out.println("Exit Selected");

                // Stop the menu loop
                running = false;

            } else {
                // Handle an invalid menu choice
                System.out.println("Invalid Choice");
            }
        }
    }
}
