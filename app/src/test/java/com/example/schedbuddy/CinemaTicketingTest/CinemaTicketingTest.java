package com.example.schedbuddy.CinemaTicketingTest;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CinemaTicketingTest {

    @Test
    public void testCinemaFlow() {

        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING CINEMA TEST DATA ---");

        automatedInput.append("1\n");
        automatedInput.append("15\n");

        automatedInput.append("1\n");
        automatedInput.append("20\n");

        automatedInput.append("2\n");

        automatedInput.append("3\n");

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(automatedInput.toString().getBytes());

        Scanner scanner = new Scanner(inputStream);

        CinemaMenu cinemaSystem = new CinemaMenu();
        cinemaSystem.start(scanner);
    }
}