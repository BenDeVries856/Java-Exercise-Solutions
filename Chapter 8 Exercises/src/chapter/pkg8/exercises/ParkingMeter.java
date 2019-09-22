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
public class ParkingMeter {
    
    // the number of minutes purchased
    private int minutes;
    
    public ParkingMeter(int minutes){
        this.minutes = minutes;
    }
    
    public ParkingMeter(ParkingMeter meter){
        this.minutes = meter.minutes;
    }
    // getters and setters
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
}
