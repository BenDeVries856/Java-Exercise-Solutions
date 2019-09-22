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
public class Car {
    
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    public void accelerate(){
        speed += 5;
    }
    
    public void brake(){
        speed -= 5;
    }
    
    public int getYearModel(){ return yearModel; }
    public String getMake(){ return make; }
    public int getSpeed(){ return speed; }
    
}
