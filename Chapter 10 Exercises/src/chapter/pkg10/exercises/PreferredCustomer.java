/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10.exercises;

import java.util.ArrayList;

/**
 *
 * @author ben_d
 */
public class PreferredCustomer extends Customer {
    
    private static final double[] LEVELS = {0, 0.05, 0.06, 0.07, 0.1};
    private static final double[] TOTALS = {0, 500, 1000, 1500, 2000};
    
    private double total;
    private int discountLevel;
    ArrayList<String> purchases;
    
    public PreferredCustomer(String name, int custno){
        super(name, custno);
        total = 0;
        discountLevel = 0;
        purchases = new ArrayList<String>();
    }
    
    private void calculateDiscount(){
        if(total < TOTALS[1]){
            discountLevel = 0;
        } else if(total < TOTALS[2]){
            discountLevel = 1;
        } else if(total < TOTALS[3]){
            discountLevel = 2;
        } else if(total < TOTALS[4]){
            discountLevel = 3;
        } else {
            discountLevel = 4;
        }
    }
    
    // getters and setters
    public double getTotal(){return total;}
    public double getDiscount(){return LEVELS[discountLevel];}
    
    public void setTotal(double total){
        this.total = total;
        calculateDiscount();
    }
    
    public void makePurchase(String item, double purchase){
        purchases.add("Item Name: " + item + ", price: $" + purchase);
        this.total += purchase - (purchase * LEVELS[discountLevel]);
        calculateDiscount();
    }
    
}
