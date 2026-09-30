package com.example.schedbuddy.quarter2.PracticalExam.ArcadeCounterTest;

import java.util.Scanner;

public class ArcadeMenu {

    public void start(Scanner scanner) {

        // Keeps the arcade menu running
        boolean running = true;

        while (running) {

            // Display the available arcade options
            System.out.println("\n=== ARCADE MENU ===");
            System.out.println("1. Buy Tokens");
            System.out.println("2. Claim Prize");
            System.out.println("3. Exit");

            // Read the user's menu choice
            int choice = scanner.nextInt();

            // Process the selected option
            if (choice == 1) {

                System.out.println("Tokens purchased successfully!");

            } else if (choice == 2) {

                // Get the player's ticket count
                System.out.print("Enter number of tickets: ");
                int tickets = scanner.nextInt();

                // Check if the player can claim the prize
                if (tickets >= 500) {
                    System.out.println("Teddy Bear Won!");
                } else {
                    System.out.println("Keep Playing!");
                }

            } else if (choice == 3) {

                // End the arcade program
                System.out.println("Thank you for playing!");
                running = false;

            } else {

                // Handle choices outside the menu
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
