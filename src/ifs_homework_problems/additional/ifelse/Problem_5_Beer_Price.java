package ifelse;

import java.util.*;

public class Problem_5_Beer_Price {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a budget from 1 to 5");
        double budget = sc.nextDouble();

        Map<String, Double> beers = new HashMap<>();
        beers.put("Zatecky Hus", 1.69);
        beers.put("Budweiser", 2.59);
        beers.put("Zagorka", 1.49);
        beers.put("Pirinsko", 2.19);
        beers.put("Staropramen", 2.11);
        beers.put("Hobgoblin", 4.59);

        if (budget < 1 && budget > 5) {
            System.out.println("Invalid input");
        } else {
            beers.entrySet().forEach(entry -> {
                if (budget >= entry.getValue()) {
                    System.out.println(entry.getKey());
                }
            });
        }

        System.out.println("\nProgram terminated");
        sc.close();
    }

}
