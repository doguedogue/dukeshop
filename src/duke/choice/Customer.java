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
public class Customer {
    private String name;
    private String size;
    
    private Clothing[] items;
    
    public void addItems(Clothing[] someItem){
        items = someItem;
    }

    public Customer(String name) {
        this.name = name;
    }
    public Clothing [] getItems(){
        return items;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
    
    public double getTotalClothingCost(){
        double total = 0.0;
        for (Clothing item : items) {
            //if (c1.getSize().equals(item.getSize())) {
                //total += item.getPrice() * (1 + tax);
                total += item.getPrice();
                System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                if (total > 15) {
                    break;
                }
            //}
        }
        
        return total;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement) {
        switch (measurement) {
            //case 1,2,3: //Java 14
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
