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

            choice = 3;

        } while (choice != 3);
    }
}