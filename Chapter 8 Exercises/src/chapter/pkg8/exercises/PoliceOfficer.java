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
public class PoliceOfficer {
    
    private String name;
    private int badgeno;
    private ParkedCar car;
    private ParkingMeter meter;
    
    public PoliceOfficer(String name, int badgeno, ParkedCar car, ParkingMeter meter){
        this.name = name;
        this.badgeno = badgeno;
        this.car = car;
        this.meter = meter;
    }
    
    public PoliceOfficer(PoliceOfficer police){
        this.name = police.name;
        this.badgeno = police.badgeno;
        this.car = police.car;
        this.meter = police.meter;
    }
    
    public boolean isExpired(){
        int parked = getCar().getMinutesParked();
        int allowed = getMeter().getMinutes();
        if(parked <= allowed){
            return true;
        } else {
            return false;
        }
    }
    
    public ParkingTicket generateTicket(){
        return new ParkingTicket(getCar(), getMeter(), this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBadgeno() {
        return badgeno;
    }
    public void setBadgeno(int badgeno) {
        this.badgeno = badgeno;
    }
    public ParkedCar getCar() {
        return car;
    }
    public void setCar(ParkedCar car) {
        this.car = car;
    }
    public ParkingMeter getMeter() {
        return meter;
    }
    public void setMeter(ParkingMeter meter) {
        this.meter = meter;
    }
    
}
