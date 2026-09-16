package com.example.schedbuddy.MiniPeta3;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class LogInFeature {

    // Save username and password
    public void saveAccount(String username, String password) {

        try {

            FileWriter writer = new FileWriter("users.txt");

            writer.write(username + "," + password);

            writer.close();

            System.out.println("\n===== ACCOUNT INFORMATION =====");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Account successfully saved!");

        } catch (IOException e) {

            System.out.println("Error saving account.");
        }
    }


    // Login / Account Input
    public void login() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SCHEDBUDDY LOGIN =====");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate input
        if (username.isEmpty() && password.isEmpty()) {

            System.out.println("Username and password cannot be empty.");

        } else if (username.isEmpty()) {

            System.out.println("Username cannot be empty.");

        } else if (password.isEmpty()) {

            System.out.println("Password cannot be empty.");

        } else {

            saveAccount(username, password);
        }

        scanner.close();
    }


    // JUnit Test
    @Test
    public void testSaveAccount() {

        String username = "Kico";
        String password = "admin1234";

        saveAccount(username, password);

        File file = new File("users.txt");

        assertTrue(
                "Account should be saved successfully.",
                file.exists()
        );
    }
}