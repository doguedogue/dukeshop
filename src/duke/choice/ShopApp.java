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
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("M");

        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

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

        //System.out.println("Item1" + "," + item1.description + "," + item1.price + "," + item1.size);
        //System.out.println("Item2" + "," + item2.description + "," + item2.price + "," + item2.size);
        //total = (item1.price + item2.price * 2 )*(1 + tax);
        //System.out.println("Total = "+total);
        int measurement = 3;
        c1.setSize(measurement);
        System.out.println("Measurement: " + measurement + " Size: " + c1.getSize());
        System.out.printf("Customer's Name: %s, Size: %s\n", c1.getName(), c1.getSize());

        for (Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                //total += item.getPrice() * (1 + tax);
                total += item.getPrice();
                System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("Total = " + total);
    }

}
