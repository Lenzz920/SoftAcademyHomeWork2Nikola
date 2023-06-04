package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_13_Day_Of_Week {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String day = "";

        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "You have provided a wrong value";
        }

        System.out.println(day);

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
