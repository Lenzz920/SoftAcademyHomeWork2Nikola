package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_1_Age_Checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 18) {
            System.out.println("Your age is below 18");
        } else {
            System.out.println("Your age is equal or above 18");
        }

        System.out.println("Program terminated");
        sc.close();

    }
}
