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
public class Tailored extends Clothing{
    private double fee = 5.5;
    
    @Override
    public double getPrice (){
        return super.getPrice() + fee;
    }
    
}
