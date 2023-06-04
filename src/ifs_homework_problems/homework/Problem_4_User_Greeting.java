package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_4_User_Greeting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.next();

        System.out.println("Please enter your gender");
        String gender = sc.next();

        if(gender.equals("Male")) {
            System.out.println("Hello, Mr. " + name + "!");
        } else
            System.out.println("Hello, Mrs. " + name + "!");

        System.out.println("Program terminated");
        sc.close();
    }

}
