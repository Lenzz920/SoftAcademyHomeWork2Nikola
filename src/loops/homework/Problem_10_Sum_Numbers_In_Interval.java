package loops.homework;

import java.util.Scanner;

public class Problem_10_Sum_Numbers_In_Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;


        if (n < m) {
            for(int i = n; i <= m; i++) {
                sum += i;
            }
        } else
            System.out.println("n should be < m");

        System.out.println(sum);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
