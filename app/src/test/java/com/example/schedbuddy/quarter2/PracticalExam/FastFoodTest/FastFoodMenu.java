package com.example.schedbuddy.quarter2.PracticalExam.FastFoodTest;

import java.util.Scanner;

public class FastFoodMenu {

    public void start(Scanner scanner) {
        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("      FAST FOOD SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Order burger");
            System.out.println("2. Order fries");
            System.out.println("3. exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderBurger(scanner);
                    break;

                case 2:
                    orderFries();
                    break;

                case 3:
                    System.out.println("\nThank you for using the Fast Food System!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 3);
    }

    public void orderBurger(Scanner scanner) {
        System.out.println("\n===== BURGER OPTIONS =====");
        System.out.println("1. Combo (with Drink & Fries)");
        System.out.println("2. Solo");
        System.out.print("Enter burger option: ");

        int burgerOption = scanner.nextInt();

        if (burgerOption == 1) {
            double comboPrice = 180.00;
            double taxRate = 0.12;
            double tax = comboPrice * taxRate;
            double total = comboPrice + tax;

            System.out.println("\n===== ORDER SUMMARY (COMBO) =====");
            System.out.printf("Item Price: ₱%.2f%n", comboPrice);
            System.out.printf("Tax: ₱%.2f%n", tax);
            System.out.printf("Total: ₱%.2f%n", total);
            System.out.println("Success: Ordered Burger as COMBO!");

        } else if (burgerOption == 2) {
            double soloPrice = 120.00;
            double taxRate = 0.12;
            double tax = soloPrice * taxRate;
            double total = soloPrice + tax;

            System.out.println("\n===== ORDER SUMMARY (SOLO) =====");
            System.out.printf("Item Price: ₱%.2f%n", soloPrice);
            System.out.printf("Tax: ₱%.2f%n", tax);
            System.out.printf("Total: ₱%.2f%n", total);
            System.out.println("Success: Ordered Burger as SOLO!");

        } else {
            System.out.println("\nInvalid burger option. Please try again.");
        }
    }

    public void orderFries() {
        double friesPrice = 65.00;
        double taxRate = 0.12;
        double tax = friesPrice * taxRate;
        double total = friesPrice + tax;

        System.out.println("\n===== ORDER SUMMARY (FRIES) =====");
        System.out.printf("Item Price: ₱%.2f%n", friesPrice);
        System.out.printf("Tax: ₱%.2f%n", tax);
        System.out.printf("Total: ₱%.2f%n", total);
        System.out.println("Success: Ordered FRIES!");
    }
}