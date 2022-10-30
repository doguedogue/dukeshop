/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

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

        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        Clothing item1 = new Clothing("Blue Jacket", 10.5, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 5.0, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        c1.addItems(items);
        
        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
        }

        System.out.println("Total = " + c1.getTotalClothingCost());
    }

}
