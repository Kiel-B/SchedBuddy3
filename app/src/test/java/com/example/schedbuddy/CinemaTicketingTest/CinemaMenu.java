package com.example.schedbuddy.CinemaTicketingTest;

import java.util.Scanner;

public class CinemaMenu {

    public void start(Scanner scanner) {

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n===== CINEMA TICKETING SYSTEM =====");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            System.out.println("You selected: " + choice);
        }

        System.out.println("Thank you for using the Cinema Ticketing System!");
    }

}

    public void buyTicket(Scanner scanner) {
        // Will be implemented later
    }

    public void buySnacks() {
        // Will be implemented later
    }
}