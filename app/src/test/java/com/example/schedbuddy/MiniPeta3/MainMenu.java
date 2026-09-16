package com.example.schedbuddy.MiniPeta3;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== SCHEDBUDDY =====");
            System.out.println("1. Login Feature");
            System.out.println("2. Notification");
            System.out.println("3. Task Management");
            System.out.println("4. Schedule Management");
            System.out.println("5. Exit");

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
                    System.out.println("\nLogin Feature selected.");
                    break;

                case 2:
                    System.out.println("\nNotification selected.");
                    break;

                case 3:
                    System.out.println("\nTask Management selected.");
                    break;

                case 4:
                    System.out.println("\nSchedule Management selected.");
                    break;

                case 5:
                    System.out.println("\nExiting SchedBuddy...");
                    break;

                default:
                    System.out.println("\nInvalid option. Please choose 1-5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}