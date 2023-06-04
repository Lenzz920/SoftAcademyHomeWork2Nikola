package loops.homework;

import java.util.Scanner;

public class Problem_4_Print_Numbers_To_N {

    public static void main(String[] args) {

        int from = 1;

        Scanner sc = new Scanner(System.in);
        int to = sc.nextInt();

        for(int i = from; i <= to; i++) {
            System.out.println(i);
        }

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
