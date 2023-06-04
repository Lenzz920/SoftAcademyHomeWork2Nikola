package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_3_School_Graduation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double grade = sc.nextDouble();

        if(between(grade, 5.5, 6)) {
            System.out.println("A");
        } else if (between(grade, 4.5, 5.5)) {
            System.out.println("B");
        } else if (between(grade, 3.5, 4.5)) {
            System.out.println("C");
        } else if (between(grade, 3, 3.5)) {
            System.out.println("E");
        } else if (between(grade, 2, 3)) {
            System.out.println("F");
        } else
            System.out.println("Invalid grade");

        System.out.println("Program terminated");
        sc.close();

    }

    public static boolean between(double grade, double from, double to) {
        return grade >= from && grade <= to;
    }

}
