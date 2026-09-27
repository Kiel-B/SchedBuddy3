package com.example.schedbuddy.CinemaTicketingTest;

import java.util.Scanner;

public class CinemaMenu {

    public void start(Scanner scanner) {

        int choice;

        while (true) {

            System.out.println("\n===== CINEMA TICKETING SYSTEM =====");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    buyTicket(scanner);
                    break;

                case 2:
                    buySnacks();
                    break;

                case 3:
                    System.out.println("Thank you for using the Cinema Ticketing System!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void buyTicket(Scanner scanner) {
        System.out.println("\n===== BUY TICKET =====");
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        System.out.println("Age entered: " + age);
    }

    public void buySnacks() {
        System.out.println("\n===== BUY SNACKS =====");
        System.out.println("Snack menu will be added later.");
    }
}