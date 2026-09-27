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

        if (age < 18) {

            System.out.println("Access Denied.");
            System.out.println("You must be 18 or older to purchase a ticket.");

        } else {

            double ticketPrice = 250.00;
            double tax = ticketPrice * 0.12;
            double total = ticketPrice + tax;

            System.out.println("\n===== TICKET =====");
            System.out.println("Age: " + age);
            System.out.println("Ticket Price: ₱" + ticketPrice);
            System.out.println("Tax: ₱" + tax);
            System.out.println("Total: ₱" + total);
            System.out.println("Ticket Printed Successfully!");
        }
    }

    public void buySnacks() {
        double snackPrice = 150.00;
        double tax = snackPrice * 0.12;
        double total = snackPrice + tax;

        System.out.println("\n===== SNACK PURCHASE =====");
        System.out.println("Snack Price: ₱" + snackPrice);
        System.out.println("Tax: ₱" + tax);
        System.out.println("Total: ₱" + total);
        System.out.println("Snack Purchase Successful!");
    }
}