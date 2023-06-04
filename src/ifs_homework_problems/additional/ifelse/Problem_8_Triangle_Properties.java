package ifelse;

import java.util.Scanner;

public class Problem_8_Triangle_Properties {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide side A");
        double sideA = sc.nextDouble();

        System.out.println("Please provide side B");
        double sideB = sc.nextDouble();

        System.out.println("Please provide side C");
        double sideC = sc.nextDouble();

        if (sideA == sideB && sideA == sideC) {
            System.out.println("All sides are equal");
        } else if (sideA != sideB && sideB != sideC && sideC != sideA) {
            System.out.println("All sides are different");
        } else {
            System.out.println("Isosceles triangle");
        }

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
