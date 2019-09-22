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
public class FreezeAndBoilPoints {
    
    private double temperature;
    
    public FreezeAndBoilPoints(double temp){
        this.temperature = temp;
    }
    
    public boolean isEthylFreezing(){
        if(temperature <= -173){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEthylBoiling(){
        if(temperature >= 172){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isOxygenFreezing(){
        if(temperature <= -362){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isOxygenBoiling(){
        if(temperature >= -306){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isWaterFreezing(){
        if(temperature <= 32){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isWaterBoiling(){
        if(temperature >= 212){
            return true;
        } else {
            return false;
        }
    }
    
}
