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
public class Temperature {
    
    private double ftemp;
    
    public Temperature(double farenheit){
        this.ftemp = farenheit;
    }
    
    public double getFarenheit(){
        return ftemp;
    }
    
    public double getCelsius(){
        return (5.0/9.0) * (ftemp - 32);
    }
    
    public double getKelvin(){
        return ((5.0/9.0) * (ftemp - 32) + 273);
    }
    
    public void setFarneheit(double farenheit){
        this.ftemp = farenheit;
    }
    
}
