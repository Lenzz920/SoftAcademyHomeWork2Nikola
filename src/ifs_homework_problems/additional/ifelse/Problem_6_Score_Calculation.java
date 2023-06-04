package ifs_homework_problems.additional.ifelse;

import java.util.Scanner;

public class Problem_6_Score_Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide your number, ranging from 0 to 1000");
        double number = sc.nextDouble();
        double bonusPoint = 0.0d;

        if (between(number, 0, 1000)) {
            if (between(number, 10, 100)) {
                bonusPoint = number * 0.1;
            } else if (between(number, 101, 200)) {
                bonusPoint = 25;
            } else if (between(number, 201, 300)) {
                bonusPoint = number * 2;
            } else if (between(number, 301, 400)) {
                bonusPoint = number * 3;
            } else if (between(number, 401, 600)) {
                bonusPoint = number * 4.5d;
            } else if (between(number, 601, 1000)) {
                bonusPoint = number * 6;
            }
        } else {
            System.out.println("Invalid number");
        }

        System.out.println("Current bonus points " + bonusPoint);

        if(bonusPoint % 2 != 0) {
            bonusPoint += 5;
        }

        System.out.println("Your final bonus points are: " + bonusPoint);
    }

    public static boolean between (double a, int from, int to) {
        return a >= from && a <= to;
    }

}
