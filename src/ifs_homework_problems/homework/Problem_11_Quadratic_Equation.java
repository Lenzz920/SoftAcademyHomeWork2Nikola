package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_11_Quadratic_Equation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 3 numbers, the first one can't be 0");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = Math.pow(b, 2) - (4 * a * c);

        if(a == 0) {
            System.out.println("Invalid value for a");
        } else if (D > 0) {
            double xOne = (-b + Math.sqrt(D)) / 2 * a;
            double xTwo = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("X1 = " + xOne);
            System.out.println("X2 = " + xTwo);
        } else if (D == 0) {
            double xBoth = -b / (2 * a);
            System.out.println("X1 = X2 = " + xBoth);
        } else
            System.out.println("No real roots");

        System.out.println("\nProgram terminated");

        sc.close();
    }

}
