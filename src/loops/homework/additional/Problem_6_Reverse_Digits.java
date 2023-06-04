package loops.homework.additional;

import java.util.Scanner;

public class Problem_6_Reverse_Digits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String reverseNumber = "";
        int digit;

        while (n != 0) {
            digit = n % 10;
            reverseNumber += digit;
            n = n / 10;
        }

        System.out.println(reverseNumber);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
