package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_2_Last_Digit_In_English {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        String stringConverter = "" + num;
        char lastNum = stringConverter.charAt(stringConverter.length() - 1);

        System.out.println(lastNum);

        String word = "";

        switch (lastNum) {
            case '1':
                word = "One";
                break;
            case '2':
                word = "Two";
                break;
            case '3':
                word = "Three";
                break;
            case '4':
                word = "Four";
                break;
            case '5':
                word = "Five";
                break;
            case '6':
                word = "Six";
                break;
            case '7':
                word = "Seven";
                break;
            case '8':
                word = "Eight";
                break;
            case '9':
                word = "Nine";
                break;
            case '0':
                word = "Zero";
                break;
            default:
                System.out.println("Something went wrong");

        }
        System.out.println("Your number is: " + word);
        System.out.println("Program terminated");

        sc.close();

    }

}
