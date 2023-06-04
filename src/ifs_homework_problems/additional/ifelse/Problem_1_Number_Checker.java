package ifelse;

import java.util.Scanner;

public class Problem_1_Number_Checker {

    // напишете програма, която записва въведено число в променлива от тип доубле
    // програмата трябва да проверява дали въведената стойност е реално число или цяло число

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        double num = sc.nextDouble();

        if (num == (int) num) {
            System.out.println("Your number is an integer");
        } else {
            System.out.println("Your number is a double");
        }

        System.out.println("\nProgram terminated");
        sc.close();
    }
}
