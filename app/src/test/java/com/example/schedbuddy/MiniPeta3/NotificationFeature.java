package com.example.schedbuddy.MiniPeta3;

import org.junit.Test;

import java.util.Scanner;
import java.util.ArrayList;
public class NotificationFeature {
    public static void notificationfeature(String [] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> notifications = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n =====NOTIFICATIONS====");
            System.out.println("1. Add notifications");
            System.out.println("2. Add notifications");
            System.out.println("3. Clear notifications");
            System.out.println("4. Back to main menu");

            System.out.println("Choose an option: ");


        }
        while (!scanner.hasNextInt());
        System.out.println("Invalid input. Please put a number");
        scanner.next();
        System.out.println("Choose an option: ");

        choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {

            case 1:
                System.out.println("\n ====NOTIFICATIONS====");

                if (notifications.isEmpty()) {
                    System.out.println("No notifcations");

                    else{
                        int i;
                        for (i = 0; i < notifications.size(); i++); {
                            System.out.println((i + 1) + ". " + notifications.get(i));

                            break;

                        }


                    }
                }



        }
    }

}
