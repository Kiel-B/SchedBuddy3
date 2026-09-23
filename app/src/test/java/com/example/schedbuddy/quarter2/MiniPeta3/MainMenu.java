package com.example.schedbuddy.quarter2.MiniPeta3;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables are declared in MainMenu
        String username = "Kiel";
        String password = "1234";


        int choice;

        do {

            System.out.println("\n===== SCHEDBUDDY =====");
            System.out.println("1. Login Feature");
            System.out.println("2. Exit");

            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();

                System.out.print("Choose an option: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    LogInFeature loginFeature = new LogInFeature();

                    // Pass the variables from MainMenu
                    loginFeature.login(username, password);

                    break;

                case 2:

                    System.out.println("\nExiting SchedBuddy...");

                    break;

                default:

                    System.out.println("\nInvalid option.");

            }

        } while (choice != 2);

        scanner.close();
    }
}
