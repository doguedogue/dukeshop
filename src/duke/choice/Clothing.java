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
public class Clothing implements Comparable<Clothing>{

    private String description;
    private double price;
    private String size = "M";

    public final static double TAX_RATE = 0.2;
    public final static double MIN_PRICE = 10.0;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public Clothing() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1+TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price < MIN_PRICE) ? MIN_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return getDescription() + "," + getPrice() + "," + getSize();
    }

    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.getDescription());
    }
}
