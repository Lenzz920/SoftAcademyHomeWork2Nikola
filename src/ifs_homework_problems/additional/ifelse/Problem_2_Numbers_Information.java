package ifs_homework_problems.additional.ifelse;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_2_Numbers_Information {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double [] numbers = {a, b, c};
        Arrays.sort(numbers);

        System.out.println("The smallest number is: " + a);
        System.out.println("The biggest number is: " + c);
        System.out.println("The sum of your number is: " + (a + b + c));
        System.out.println("The multiplication of number is: " + (a * b * c));

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
