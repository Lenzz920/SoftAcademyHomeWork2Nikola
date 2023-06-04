package loops.homework.additional;

import java.util.Scanner;

public class Problem_8_Aggregation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double sum = 0;
        double avg = 1;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int digit = sc.nextInt();
            sum += digit;

            if (digit < min) {
                min = digit;
            }

            if(digit > max) {
                max = digit;
            }
        }

        avg = sum / n;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
