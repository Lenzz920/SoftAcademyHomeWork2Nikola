package loops.homework;

import java.util.Scanner;

public class Problem_12_Print_Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }
}
