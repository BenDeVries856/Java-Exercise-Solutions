/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

/**
 *
 * @author ben_d
 */
public class PhoneBookEntry {
    
    private String name;
    private String phoneNumber;
    
    public PhoneBookEntry(){
       this.name = "Default";
       this.phoneNumber = "(555)-555-5555";
    }
    
    public PhoneBookEntry(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    // setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    // getters
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
}
