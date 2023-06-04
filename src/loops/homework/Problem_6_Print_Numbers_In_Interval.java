package loops.homework;

import java.util.Scanner;

public class Problem_6_Print_Numbers_In_Interval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n < m) {
            for(int i = n; i <= m; i++) {
                System.out.println(i);
            }
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }
}
