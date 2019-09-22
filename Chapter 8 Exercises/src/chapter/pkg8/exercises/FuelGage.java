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
public class FuelGage {
    
    private int fuel;
    
    public FuelGage(int fuel){
        this.fuel = fuel;
    }
    
    public FuelGage(FuelGage gage){
        this.fuel = gage.fuel;
    }
    
    public void addFuel(){
        this.fuel++;
    }
    
    public void burnFuel(){
        if(this.fuel > 0){
            this.fuel--;
        }
    }
    
    public int getFuel(){
        return this.fuel;
    }
    
}
