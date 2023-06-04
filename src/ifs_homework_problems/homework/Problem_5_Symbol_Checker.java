package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_5_Symbol_Checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a character");
        char symbol = sc.next().charAt(0);

        if(between(symbol, 65, 90) || between(symbol, 97, 122)) {
            System.out.println(symbol + " is a letter");
        } else if (between(symbol, 48, 57)) {
            System.out.println(symbol + " is a digit");
        } else
            System.out.println(symbol + " is neither a letter, nor a digit");

        System.out.println("Program terminated");
        sc.close();

    }

    public static boolean between(double symbol, double from, double to) {
        return symbol >= from && symbol <= to;
    }

}
