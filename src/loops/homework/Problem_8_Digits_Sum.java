package loops.homework;

import java.util.Scanner;

public class Problem_8_Digits_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitSum = 0;

        while (n > 0) {
            digitSum = digitSum + n % 10;
            n = n / 10;
        }

        System.out.println(digitSum);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
