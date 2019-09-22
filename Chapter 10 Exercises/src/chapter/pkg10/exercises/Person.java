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
public class Person {
    
    private String name;
    private String address;
    private String phone;
    
    public Person(String name){
        this.name = name;
        this.address = "";
        this.phone = "";
    }
    
    public Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public Person(Person person){
        this.name = person.name;
        this.address = person.address;
        this.phone = person.phone;
    }
    
    // getters and setters
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhone(){return phone;}
    
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setPhone(String phone){this.phone = phone;}
    
}
