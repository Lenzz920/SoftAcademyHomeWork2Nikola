package loops.homework;

import java.util.Scanner;

public class Program_9_Digits_Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mult = 1;

        while (n > 0) {
            mult = mult * n % 10;
            n = n / 10;
        }

        System.out.println(mult);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
