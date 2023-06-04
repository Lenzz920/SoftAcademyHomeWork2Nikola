package ifs_homework_problems.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_12_Greatest_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 3 numbers");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double [] numbers = {a, b, c};
        Arrays.sort(numbers);

        System.out.println("The largest number is: " + numbers[2]);

        System.out.println("\nProgram terminated");
        sc.close();
        }

    }


