package com.example.schedbuddy.quarter2.practicalexamsubpackage;

import java.util.Scanner;

public class FastFoodMenu {

    public void start(Scanner scanner) {
        int choice = 0;

        // Keep looping until the exit option is selected
        while (choice != 3) {
            showMainMenu();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    processBurgerOrder(scanner);
                    break;
                case 2:
                    processFriesOrder();
                    break;
                case 3:
                    System.out.println("System exiting. Thank you!\n");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.\n");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("=== FAST FOOD SYSTEM ===");
        System.out.println("[1] Order Burger");
        System.out.println("[2] Order Fries");
        System.out.println("[3] Exit");
        System.out.print("Select an option: ");
    }

    private void processBurgerOrder(Scanner scanner) {
        System.out.println("\n--- Burger Menu ---");
        System.out.println("[1] Combo");
        System.out.println("[2] Solo");
        System.out.print("Select burger type: ");

        if (scanner.hasNextInt()) {
            int burgerType = scanner.nextInt();
            if (burgerType == 1) {
                System.out.println("-> Success: Ordered Burger as Combo!\n");
            } else if (burgerType == 2) {
                System.out.println("-> Success: Ordered Burger as Solo!\n");
            } else {
                System.out.println("-> Invalid option.\n");
            }
        }
    }

    private void processFriesOrder() {
        System.out.println("\n-> Success: Ordered Fries!\n");
    }
}