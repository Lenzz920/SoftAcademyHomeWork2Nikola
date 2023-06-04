package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_9_Number_In_Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        if (n < m) {
            System.out.println(between(x, n, m));
        } else
            System.out.println("n is not smaller than m");
        System.out.println("Program terminated");

        sc.close();
    }

    public static boolean between(double symbol, double from, double to) {
        return symbol >= from && symbol <= to;
    }

}
