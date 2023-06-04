package ifelse;

import java.util.*;

public class Problem_7_Product_Price_Calculation {

    public static void main(String[] args) {

        /*
        Знам как да го направя, с хардкодване + nested ifs, но правилното решение ще включва
        nested map, обаче все още нямам достатъчно опит.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide name of a product");
        String productName = sc.next();

        System.out.println("Please provide name of a city");
        String city = sc.next();
        double price1 = 0.0d;

        if (productName.equals("Coffee") && city.equals("Sofia")) {
            price1 = 0.80d;
        } else if (productName.equals("Coffee") && city.equals("Plovdiv")) {
            price1 = 0.70d;
        } else if (productName.equals("Coffee") && city.equals("Varna")) {
            price1 = 0.70d;
        } else if (productName.equals("Coffee") && city.equals("Varna")) {
            price1 = 0.70d;
        }

        System.out.println(price1);

        //Решение на ChatGPT :D, което не се справя с несъответстващ input

        Map<String, Map<String, Double>> priceList = new HashMap<>();

        // Add prices to the price list
        addPrice(priceList, "Coffee", "Sofia", 0.80d);
        addPrice(priceList, "Coffee", "Varna", 0.60);
        addPrice(priceList, "Beer", "Sofia", 2.20);
        addPrice(priceList, "Beer", "Varna", 3.00);


        double price = searchPrice(priceList, productName, city);

        // Print the price
        System.out.println("The price of " + productName + " in " + city + " is " + price + "$");
    }

    private static void addPrice(Map<String, Map<String, Double>> priceList, String productName, String city, double price) {
        // Create a map for the product if it doesn't exist
        priceList.putIfAbsent(productName, new HashMap<>());

        // Add the price for the city
        priceList.get(productName).put(city, price);
    }

    private static double searchPrice(Map<String, Map<String, Double>> priceList, String productName, String city) {
        // Retrieve the map for the product
        Map<String, Double> cityPriceMap = priceList.get(productName);

        // Check if the product exists in the price list
        if (cityPriceMap != null) {
            // Retrieve the price for the city
            Double price = cityPriceMap.get(city);

            // Check if the city exists in the map
            if (price != null) {
                return price;
            }
        }

        // Return -1 to indicate that the price was not found
        return -1;
    }
}

