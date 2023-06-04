package loops.homework.additional;

import java.util.Scanner;

public class Problem_5_Raise_To_Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double loopPower = 1;

        double power = Math.pow(n, m);
        System.out.println(power);

        for (int i = 1; i <= m; i++) {
            loopPower *= n;
        }

        System.out.println(loopPower);

        System.out.println("\nProgram terminated");
        sc.close();

    }

}
