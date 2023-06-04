package ifs_homework_problems.additional.ifelse;

import java.util.Scanner;

public class Problem_3_Letter_Checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a letter");
        char symbol1 = sc.next().charAt(0);
        String letters = "aeiouAEIOU";

        if (symbol1 >= 65 && symbol1 <= 90 || symbol1 >= 97 && symbol1 <= 122) {
            if (letters.indexOf(symbol1) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
