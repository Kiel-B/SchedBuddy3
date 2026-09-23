package com.example.schedbuddy.quarter2.MiniPeta3;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class LogInFeature {


    // Login Feature
    public void login(String username, String password) {

        System.out.println("\n===== SCHEDBUDDY LOGIN =====");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        saveAccount(username, password);
    }


    // Save Account
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
