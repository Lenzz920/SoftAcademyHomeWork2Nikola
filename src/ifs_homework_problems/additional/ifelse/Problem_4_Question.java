package ifs_homework_problems.additional.ifelse;

import java.util.Scanner;

public class Problem_4_Question {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which is the right way to create a variable in Java?");
        System.out.println("A: int someRandomVariable = 5;");
        System.out.println("B: char symbol = \"$\";");
        System.out.println("C: float pi = 3.14;");
        System.out.println("D: int 1number = 5;");

        char answer = sc.next().charAt(0);

        switch (answer) {
            case 'A', 'B', 'D':
                System.out.println("Wrong answer, please try again");
                break;
            case 'C':
                System.out.println("Correct answer");
                break;
            default:
                System.out.println("You can only choose with A, B, C or D, but you have provided invalid answer." +
                                   "\n Please try again.");
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
