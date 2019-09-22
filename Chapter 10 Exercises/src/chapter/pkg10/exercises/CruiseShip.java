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
public class CruiseShip extends Ship{
    
    private int maxpassengers;
    
    public CruiseShip(String name, String year, int maxpassengers){
        super(name, year);
        this.maxpassengers = maxpassengers;
    }
    
    @Override
    public String toString(){
        return "Name: " + super.getName() + ", Max Passengers: " + maxpassengers;
    }
    
    // getters and setters
    public int getMaxPassengers(){return maxpassengers;}
    public void setMaxPassengers(int max){this.maxpassengers = max;}
    
}
