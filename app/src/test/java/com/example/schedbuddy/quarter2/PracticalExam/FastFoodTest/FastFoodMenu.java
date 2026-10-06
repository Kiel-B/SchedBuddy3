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
        // Next commit will fill this out...
    }

    public void orderFries() {
        // Next commit will fill this out...
    }
}