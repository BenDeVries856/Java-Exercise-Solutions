/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

/**
 *
 * @author ben_d
 */
public class CashRegister {
    
    private RetailItem item;
    private int quantity;
    
    public CashRegister(RetailItem item, int quantity){
        this.item = new RetailItem(item);
        this.quantity = quantity;
    }
    
    public double getSubtotal(){
        return (double) this.quantity * this.item.getPrice();
    }
    
    public double getTax(){
        return getSubtotal() * 0.06;
    }
    
    public double getTotal(){
        return getSubtotal() + getTax();
    }
    
    public String[] generateReceipt(){
        String[] r = new String[6];
        r[0] = "SALES RECEIPT";
        r[1] = String.format("Unit Price: $%,.2f", item.getPrice()); 
        r[2] = String.format("Quantity: %d", quantity);
        r[3] = String.format("Subtotal: $%,.2f", getSubtotal());
        r[4] = String.format("Sales Tax: $%,.2f", getTax());
        r[5] = String.format("Total: $%,.2f", getTotal());
        return r;
    }
    
}
