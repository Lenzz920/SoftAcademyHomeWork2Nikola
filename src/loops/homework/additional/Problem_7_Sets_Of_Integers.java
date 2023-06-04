package loops.homework.additional;

import java.util.Scanner;

public class Problem_7_Sets_Of_Integers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 1;

        for(int i = 1; i <= n; i++) {
            int newNumber = sc.nextInt();

            if (newNumber % 2 == 0) {
                countEven += newNumber;
            } else countOdd *= newNumber;

        }

        System.out.println("Even numbers sum: " + countEven);
        System.out.println("Odd numbers sum: " + countOdd);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
