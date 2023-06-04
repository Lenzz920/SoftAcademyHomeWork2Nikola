package loops.homework.additional;

import java.util.Scanner;

public class Problem_4_Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
