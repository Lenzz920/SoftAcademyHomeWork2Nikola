package loops.homework;

import java.util.Scanner;

public class Problem_11_Multiply_Numbers_In_Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double mult = 1;

        if (n < m) {
            for(int i = n; i < m; i++) {
                mult *= i;
            }
        } else
            System.out.println("n should be < m");


        System.out.println(mult);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
