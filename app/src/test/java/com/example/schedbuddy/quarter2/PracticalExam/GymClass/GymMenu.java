package com.example.schedbuddy.quarter2.PracticalExam.GymClass;
import java.util.Scanner;

public class GymMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        System.out.println("========== GYM =============");
        System.out.println("WOULD YOU LIKE TO ENTER?");
        System.out.println("1. YES");
        System.out.println("2. NO\n");

        while (running && scanner.hasNextLine()){
            String input = scanner.nextLine().trim();

            switch(input){
                case"1":
                    System.out.println("User has entered the gym.....\n");
                    break;
                case"2":
                    System.out.println("DOES USER WANT TO HIRE A TRAINER?");
                    System.out.println("1. Yes");
                    System.out.println("2. No\n");

                    if (scanner.hasNextLine()){
                        String tierInput = scanner.nextLine().trim();

                        if(tierInput.equals("1")){
                            System.out.println("User Profile");
                            System.out.println("NAME: ########");
                            System.out.println("EMAIL: ############");
                            System.out.println("MEMBERSHIP: REGULAR \n" );
                            System.out.println("INVALID TRAINER!!! NEED MEMBERSHIP UPGRADE\n");

                            System.out.println("==========================");
                            System.out.println("       3.EXIT");
                            System.out.println("==========================\n");

                        }else if(tierInput.equals("2")){
                            System.out.println("User Profile");
                            System.out.println("NAME: ########");
                            System.out.println("EMAIL: ############");
                            System.out.println("MEMBERSHIP: VIP \n" );
                            System.out.println("USER HAS SUCCESFULLY HIRED A TRAINER!\n");
                            System.out.println("==========================");
                            System.out.println("       3.EXIT");
                            System.out.println("==========================\n");
                        }
                    }
                    break;

                case "3":
                    System.out.println("USER HAS SUCCESFULLY EXITED THE APP\n");
                    running = false;
                    break;
                default:
                    break;


            }
        }


    }
}

