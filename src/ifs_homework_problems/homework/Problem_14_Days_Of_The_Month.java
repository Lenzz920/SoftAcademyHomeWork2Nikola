package ifs_homework_problems.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_14_Days_Of_The_Month {

    public static void main(String[] args) {

        System.out.println("Please provide name of month, in format 'January'");
        Scanner sc = new Scanner(System.in);
        String month = sc.next();

        Map<String, Integer> daysOfMonth = new HashMap<>();
        daysOfMonth.put("January", 31);
        daysOfMonth.put("February", 28);
        daysOfMonth.put("March", 31);
        daysOfMonth.put("April", 30);
        daysOfMonth.put("May", 31);
        daysOfMonth.put("June", 31);
        daysOfMonth.put("July", 31);
        daysOfMonth.put("August", 31);
        daysOfMonth.put("September", 30);
        daysOfMonth.put("October", 31);
        daysOfMonth.put("November", 30);
        daysOfMonth.put("December", 31);

        System.out.println("This month has " + daysOfMonth.get(month) + " days.");
        System.out.println("\nProgram terminated");
        sc.close();
    }

}
