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
public class CargoShip extends Ship{
    
    private int capacity;
    
    public CargoShip(String name, String year, int capacity){
        super(name, year);
        this.capacity = capacity;
    }
    
    @Override
    public String toString(){
        return "Name: " + super.getName() + ", Capacity: " + capacity;
    }
    
    // getters and setters
    public int getCapacity(){return capacity;}
    public void setCapacity(int capacity){this.capacity = capacity;}
    
}
