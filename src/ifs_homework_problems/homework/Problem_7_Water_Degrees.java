package ifs_homework_problems.homework;

import java.util.Scanner;

public class Problem_7_Water_Degrees {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, provide the degree of the water");
        int degrees = sc.nextInt();

        if(degrees == 0) {
            System.out.println("The state is ice");
        } else if (between(degrees, 1, 20)) {
            System.out.println("The state is cold water");
        } else if (between(degrees, 21, 30)) {
            System.out.println("The state is normal water");
        } else if (between(degrees, 31, 50)) {
            System.out.println("The state is hot water");
        } else if (between(degrees, 51, 99)) {
            System.out.println("The state is very hot water");
        } else if (degrees == 100) {
            System.out.println("The state is boiling water");
        } else
            System.out.println("Invalid degree");

        System.out.println("Program terminated");
        sc.close();
    }

    public static boolean between(int degrees, int from, int to) {
        return degrees >= from && degrees <= to;
    }

}
