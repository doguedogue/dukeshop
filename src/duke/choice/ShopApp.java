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
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("M");

        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        c1.addItems(items);
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setSize("S");
        items[2].setPrice(5.0);

        items[3].setDescription("Blue T-Shirt");
        items[3].setSize("S");
        items[3].setPrice(10.5);

        int measurement = 3;
        c1.setSize(measurement);
        System.out.println("Measurement: " + measurement + " Size: " + c1.getSize());
        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
        }

        System.out.println("Total = " + c1.getTotalClothingCost());
    }

}
