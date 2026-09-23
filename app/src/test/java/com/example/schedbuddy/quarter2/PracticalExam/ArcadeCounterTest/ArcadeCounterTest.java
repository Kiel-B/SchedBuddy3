package com.example.schedbuddy.quarter2.PracticalExam.ArcadeCounterTest;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ArcadeCounterTest {

    @Test
    public void testArcadeFlow() {

        String input = "1\n2\n200\n2\n600\n3\n";

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        Scanner scanner = new Scanner(inputStream);

        start(scanner);
    }

    public void start(Scanner scanner) {
        int choice = 0;

        while (choice != 3) {

            System.out.println("=== ARCADE MENU ===");
            System.out.println("1. Buy Tokens");
            System.out.println("2. Claim Prize");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Buy Tokens selected.");

            } else if (choice == 2) {
                System.out.println("Claim Prize selected.");

            } else if (choice == 3) {
                System.out.println("Exiting Arcade...");

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}