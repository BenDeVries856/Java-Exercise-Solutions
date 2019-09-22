/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

/**
 *
 * @author ben_d
 */
public class RetailItem {
    
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(String description, int unitsOnHand, double price) throws InvalidPrice, InvalidUnitsOnHand {
        if(price < 0){
            throw new InvalidPrice();
        }
        if(unitsOnHand < 0){
            throw new InvalidUnitsOnHand();
        }
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    public String getDescription(){ return description; }
    public int getUnitsOnHand(){ return unitsOnHand; }
    public double getPrice(){ return price; }
    
    public void setDescription(String description){ this.description = description; }
    public void setUnitsOnHand(int unitsOnHand){ this.unitsOnHand = unitsOnHand; }
    public void setPrice(double price){ this.price = price; }
    
}
