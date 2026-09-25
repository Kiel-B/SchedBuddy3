package com.example.schedbuddy.quarter2.MiniPeta3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskManagementFeature {

    // Store all tasks
    private final ArrayList<String> tasks = new ArrayList<>();


    // Task Management Menu
    public void taskManagement() {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== TASK MANAGEMENT =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Back to Main Menu");

            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print("Choose an option: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {

                case 1:
                    addTask(scanner);
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    completeTask(scanner);
                    break;

                case 4:
                    deleteTask(scanner);
                    break;

                case 5:
                    System.out.println(
                            "\nReturning to Main Menu..."
                    );
                    break;

                default:
                    System.out.println(
                            "\nInvalid option. Please choose 1-5."
                    );
            }

        } while (choice != 5);
    }


    // Add Task
    public void addTask(Scanner scanner) {

        System.out.println("\n===== ADD TASK =====");

        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter due date: ");
        String dueDate = scanner.nextLine();


        if (taskName.isEmpty()) {

            System.out.println(
                    "Task name cannot be empty."
            );

            return;
        }

        String task =
                taskName
                        + " | "
                        + description
                        + " | Due: "
                        + dueDate
                        + " | Status: Pending";

        tasks.add(task);

        System.out.println(
                "\nTask added successfully!"
        );
    }


    // View Tasks
    public void viewTasks() {

        System.out.println("\n===== YOUR TASKS =====");

        if (tasks.isEmpty()) {

            System.out.println(
                    "No tasks available."
            );

            return;
        }

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println(
                    (i + 1) + ". " + tasks.get(i)
            );
        }
    }


    // Mark Task as Completed
    public void completeTask(Scanner scanner) {

        if (tasks.isEmpty()) {

            System.out.println(
                    "\nNo tasks available."
            );

            return;
        }

        viewTasks();

        System.out.print(
                "\nEnter task number to complete: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                    "Invalid input. Please enter a task number."
            );

            scanner.next();

            System.out.print(
                    "Enter task number: "
            );
        }

        int taskNumber = scanner.nextInt();
        scanner.nextLine();


        if (taskNumber < 1 ||
                taskNumber > tasks.size()) {

            System.out.println(
                    "Invalid task number."
            );

            return;
        }


        String task = tasks.get(taskNumber - 1);

        String updatedTask = task.replace(
                "Status: Pending",
                "Status: Completed"
        );

        tasks.set(taskNumber - 1, updatedTask);

        System.out.println(
                "\nTask marked as completed!"
        );
    }


    // Delete Task
    public void deleteTask(Scanner scanner) {

        if (tasks.isEmpty()) {

            System.out.println(
                    "\nNo tasks available."
            );

            return;
        }

        viewTasks();

        System.out.print(
                "\nEnter task number to delete: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                    "Invalid input. Please enter a task number."
            );

            scanner.next();

            System.out.print(
                    "Enter task number: "
            );
        }

        int taskNumber = scanner.nextInt();
        scanner.nextLine();


        if (taskNumber < 1 ||
                taskNumber > tasks.size()) {

            System.out.println(
                    "Invalid task number."
            );

            return;
        }

        tasks.remove(taskNumber - 1);

        System.out.println(
                "\nTask deleted successfully!"
        );
    }


    // JUnit Test - Add Task
    @Test
    public void testAddTask() {

        tasks.clear();

        tasks.add(
                "Study Java | Review classes | Due: September 30, 2026 | Status: Pending"
        );

        assertFalse(
                "Task list should not be empty after adding a task.",
                tasks.isEmpty()
        );
        assertEquals(
                "Task count should be 1.",
                1,
                tasks.size()
        );
    }


    // JUnit Test - Complete Task
    @Test
    public void testCompleteTask() {

        tasks.clear();

        tasks.add(
                "Study Java | Review classes | Due: September 30, 2026 | Status: Pending"
        );

        String task = tasks.get(0);

        String updatedTask = task.replace(
                "Status: Pending",
                "Status: Completed"
        );

        tasks.set(0, updatedTask);

        assertTrue(
                "Task should be marked as completed.",
                tasks.get(0).contains("Status: Completed")
        );
    }


    // JUnit Test - Delete Task
    @Test
    public void testDeleteTask() {

        tasks.clear();

        tasks.add(
                "Study Java | Review classes | Due: September 30, 2026 | Status: Pending"
        );

        tasks.remove(0);

        assertTrue(
                "Task should be deleted successfully.",
                tasks.isEmpty()
        );
    }
}
