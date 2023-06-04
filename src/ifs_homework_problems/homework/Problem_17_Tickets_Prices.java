package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_17_Tickets_Prices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide your age");
        int age = sc.nextInt();

        double ticketPrice = 50;

        if (age < 16 || age > 65) {
            ticketPrice = ticketPrice * 0.5;
            System.out.println("You are eligible to 50% discount");
        } else if (between(age, 16, 24)) {
            ticketPrice = ticketPrice * 0.65;
            System.out.println("You are eligible to 35% discount");
        }

        System.out.println("\nYour ticket price is: " + ticketPrice);
        System.out.println("\nProgram terminated");
        sc.close();
    }

    public static boolean between(double symbol, double from, double to) {
        return symbol >= from && symbol <= to;
    }
}
