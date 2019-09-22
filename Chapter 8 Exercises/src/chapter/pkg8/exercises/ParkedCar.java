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
public class ParkedCar {
    
    private String make;
    private String model;
    private String color;
    private String license;
    private int minutesParked;
    
    public ParkedCar(String make, String model, String color, String license, int minutesParked){
        this.make = make;
        this.model = model;
        this.color = color;
        this.license = license;
        this.minutesParked = minutesParked;
    }
    
    public ParkedCar(ParkedCar car){
        this.make = car.make;
        this.model = car.model;
        this.color = car.color;
        this.license = car.license;
        this.minutesParked = car.minutesParked;
    }
    
    // getters and setters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public int getMinutesParked() {
        return minutesParked;
    }
    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }
    
}
