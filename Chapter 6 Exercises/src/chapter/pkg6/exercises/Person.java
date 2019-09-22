/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

/**
 *
 * @author ben_d
 */
public class Person {
    
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public Person(String name, String address, int age, String phoneNumber){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public int getAge(){ return age; }
    public String getPhoneNumber(){ return phoneNumber; }
    
    public void setName(String name){ this.name = name; }
    public void setAddress(String address){ this.address = address; }
    public void setAge(int age){ this.age = age; }
    public void setPhoneNumber(String phoneNumber){ this.phoneNumber = phoneNumber; }
    
}
