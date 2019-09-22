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
public class Odometer {
    
    private int mileage;
    private FuelGage fuel;
    int distanceToBurn;
    
    public Odometer(int mileage, FuelGage fuel){
        this.mileage = mileage;
        this.fuel = new FuelGage(fuel);
        this.distanceToBurn = 24;
    }
    
    public int getMileage(){
        return this.mileage;
    }
    
    public void driveMile(){
        this.mileage++;
        if(this.mileage >= 999999){
            this.mileage = 0;
        }
        this.distanceToBurn--;
        if(this.distanceToBurn <= 0){
            this.distanceToBurn = 24;
            fuel.burnFuel();
        }
    }
    
    public void fillCar(int gallons){
        for(int i = 0; i < gallons; i++){
            fuel.addFuel();
        }
    }
    
    public FuelGage getFuelGage(){
        return this.fuel;
    }
    
}
