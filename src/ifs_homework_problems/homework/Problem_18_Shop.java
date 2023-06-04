package ifs_homework_problems.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_18_Shop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide your budget");
        double budget = sc.nextDouble();

        System.out.println("Please provide the cost of 3 different products");
        double productA = sc.nextDouble();
        double productB = sc.nextDouble();
        double productC = sc.nextDouble();

        double totalPrice = productA + productB + productC;
        double checkOut = budget - totalPrice;

        DecimalFormat df = new DecimalFormat("#.00");

        if (budget >= totalPrice) {
            System.out.println("You have enough money to buy these products! You have " + df.format(checkOut) + " leva left");
        } else
            System.out.println("Unfortunately, you do not have enough money. You are " + df.format(-checkOut) + " leva short");

        System.out.println("\nProgram terminated");
        sc.close();
    }
}
