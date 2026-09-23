package com.example.schedbuddy.quarter2.MiniPeta3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class NotificationFeature {
    public void notificationFeature() {
        notification();
    }

    // Store notifications
    ArrayList<String> notifications = new ArrayList<>();


    // Add notification
    public void addNotification(String notification) {

        notifications.add(notification);

        System.out.println("Notification added!");
    }


    // View notifications
    public void viewNotifications() {

        System.out.println("\n===== NOTIFICATIONS =====");

        if (notifications.isEmpty()) {

            System.out.println("No notifications.");

        } else {

            for (int i = 0; i < notifications.size(); i++) {

                System.out.println(
                        (i + 1) + ". " + notifications.get(i)
                );
            }
        }
    }


    // Clear notifications
    public void clearNotifications() {

        notifications.clear();

        System.out.println("\nAll notifications cleared.");
    }


    // Notification Menu
    public void notification() {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== NOTIFICATION =====");
            System.out.println("1. View Notifications");
            System.out.println("2. Add Notification");
            System.out.println("3. Clear Notifications");
            System.out.println("4. Back to Main Menu");

            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {

                System.out.println("Invalid input. Please enter a number.");
                scanner.next();

                System.out.print("Choose an option: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    viewNotifications();
                    break;

                case 2:

                    System.out.print("\nEnter notification: ");

                    String notification = scanner.nextLine();

                    addNotification(notification);

                    break;

                case 3:
                    clearNotifications();
                    break;

                case 4:
                    System.out.println("\nReturning to Main Menu...");
                    break;

                default:
                    System.out.println(
                            "\nInvalid option. Please choose 1-4."
                    );
            }

        } while (choice != 4);

        scanner.close();
    }


    // JUnit Test
    @Test
    public void testAddNotification() {

        String notification = "Submit Java Activity";

        addNotification(notification);

        assertEquals(
                "Notification should be added successfully.",
                1,
                notifications.size()
        );
    }

}
