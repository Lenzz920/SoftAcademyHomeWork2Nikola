package loops.homework;

public class Problem_2_Print_Even_Numbers {

    public static void main(String[] args) {

        int from = 1;
        int to = 100;

        for(int i = from; i <= to; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nProgram terminated");

    }

}
