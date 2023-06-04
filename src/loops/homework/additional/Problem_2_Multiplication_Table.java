package loops.homework.additional;

import java.util.Scanner;

public class Problem_2_Multiplication_Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
