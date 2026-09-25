package com.example.schedbuddy.quarter2.MiniPeta3;

import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleManagementFeature {

    private ArrayList<String> schedules = new ArrayList<>();

    public void scheduleManagement() {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== SCHEDULE MANAGEMENT =====");
            System.out.println("1. Add Schedule");
            System.out.println("2. View Schedule");
            System.out.println("3. Delete Schedule");
            System.out.println("4. Clear All Schedules");
            System.out.println("5. Back to Main Menu");

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

                    System.out.print("Enter schedule: ");
                    String schedule = scanner.nextLine();

                    schedules.add(schedule);

                    System.out.println("Schedule added successfully!");

                    break;

                case 2:

                    System.out.println("\n===== YOUR SCHEDULES =====");

                    if (schedules.isEmpty()) {

                        System.out.println("No schedules available.");

                    } else {

                        for (int i = 0; i < schedules.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". " + schedules.get(i)
                            );
                        }
                    }

                    break;

                case 3:

                    if (schedules.isEmpty()) {

                        System.out.println("No schedules to delete.");

                    } else {

                        System.out.println("\n===== YOUR SCHEDULES =====");

                        for (int i = 0; i < schedules.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". " + schedules.get(i)
                            );
                        }

                        System.out.print("Enter schedule number to delete: ");

                        int deleteNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (deleteNumber >= 1 &&
                                deleteNumber <= schedules.size()) {

                            schedules.remove(deleteNumber - 1);

                            System.out.println(
                                    "Schedule deleted successfully!"
                            );

                        } else {

                            System.out.println(
                                    "Invalid schedule number."
                            );
                        }
                    }

                    break;

                case 4:

                    schedules.clear();

                    System.out.println(
                            "All schedules have been cleared."
                    );

                    break;

                case 5:

                    System.out.println(
                            "Returning to Main Menu..."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid option. Please choose 1-5."
                    );
            }

        } while (choice != 5);
    }
}
