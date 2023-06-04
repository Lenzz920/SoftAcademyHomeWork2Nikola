package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_6_Leap_Year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year");
        } else
            System.out.println("This is not a leap year");

        System.out.println("Program terminated");
        sc.close();
    }

}
