package loops.homework;

import java.util.Scanner;

public class Problem_7_Digits_Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int numberOfDigits = 0;

        for(int i = 0; i <= n.length(); i++) {
            numberOfDigits = i;
        }
        System.out.println(numberOfDigits);

        System.out.println("\nProgram terminated");
        sc.close();

    }
}
