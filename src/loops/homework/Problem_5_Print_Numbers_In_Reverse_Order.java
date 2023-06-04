package loops.homework;

import java.util.Scanner;

public class Problem_5_Print_Numbers_In_Reverse_Order {

    public static void main(String[] args) {

        int to = 1;

        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();

        for(int i = from; i >= to; i--) {
            System.out.println(i);
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }
}
