/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author rvilches
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Minimum Price: " + Clothing.MIN_PRICE);

        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        Clothing item1 = new Clothing("Blue Jacket", 10.5, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 5.0, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        c1.addItems(items);

        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        int average = 0;
        int count = 0;
        System.out.println("*************************");
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
            System.out.println("Item output " + item);
        }

        System.out.println("*************************");
        try {
            average = average / count;
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero | " + e.getMessage() + " | " + e.getCause());
        }

        System.out.println("Total = " + c1.getTotalClothingCost());

        Clothing[] clothingArray = new Clothing[2];
        clothingArray[0] = new Tailored();
        clothingArray[1] = new Standard();

        for (Clothing clothing : clothingArray) {
            System.out.println("Clase: " + clothing.getClass() + ", Price: " + clothing.getPrice());
        }

        Arrays.sort(c1.getItems());
        System.out.println("*************************");
        System.out.println("Sorted Array:");
        for (Clothing item : c1.getItems()) {
            System.out.println("Item " + item);
        }

    }

}
