package com.example.schedbuddy.quarter2.PracticalExam.CinemaTicketingTest;

import java.util.Scanner;

public class CinemaMenu {

    public void start(Scanner scanner) {

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("   CINEMA TICKETING SYSTEM");
            System.out.println("==============================");
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
                    System.out.println("\nThank you for using the Cinema Ticketing System!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 3);
    }

    public void buyTicket(Scanner scanner) {

        System.out.println("\n===== BUY TICKET =====");
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        if (age < 18) {

            System.out.println("Access Denied.");
            System.out.println("You must be 18 or older.");

        } else {

            double ticketPrice = 250.00;
            double taxRate = 0.12;
            double tax = ticketPrice * taxRate;
            double total = ticketPrice + tax;

            System.out.println("\n===== TICKET PRINTED =====");
            System.out.println("Age: " + age);
            System.out.printf("Ticket Price: ₱%.2f%n", ticketPrice);
            System.out.printf("Tax: ₱%.2f%n", tax);
            System.out.printf("Total: ₱%.2f%n", total);
            System.out.println("Enjoy the movie!");
        }
    }

    public void buySnacks() {

        double snackPrice = 150.00;
        double taxRate = 0.12;
        double tax = snackPrice * taxRate;
        double total = snackPrice + tax;

        System.out.println("\n===== SNACK PURCHASE =====");
        System.out.printf("Snack Price: ₱%.2f%n", snackPrice);
        System.out.printf("Tax: ₱%.2f%n", tax);
        System.out.printf("Total: ₱%.2f%n", total);
        System.out.println("Snack purchase successful!");
    }
}