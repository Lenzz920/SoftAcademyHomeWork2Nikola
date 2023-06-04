package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_16_Simple_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide 2 numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Please provide a operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
              result = a + b;
              break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        if (operation == '/' && b == 0) {
            System.out.println("You can't divide by 0");
        } else if (operation == '+' || operation == '-' || operation == '*' || operation == '/' ) {
            System.out.println(a + " " + operation + " " + b + " = " + result);
        } else
            System.out.println("You did not provide a valid operation");

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
