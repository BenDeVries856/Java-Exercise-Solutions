/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10.exercises;

/**
 *
 * @author ben_d
 */
public class Customer extends Person{
    
    private int customerno;
    private boolean mailingList;
    
    public Customer(String name, int customerno){
        super(name);
        this.customerno = customerno;
    }
    
    public Customer(String name, String address, String phone, int customerno){
        super(name, address, phone);
        this.customerno = customerno;
    }
    
    //getters and setters
    public int getCustomerNumber(){return customerno;}
    public boolean isOnMailingList(){return mailingList;}
    
    public void setCustomerNumber(int no){this.customerno = no;}
    public void addToMailingList(){this.mailingList = true;}
    public void removeFromMailingList(){this.mailingList = false;}
    
}
