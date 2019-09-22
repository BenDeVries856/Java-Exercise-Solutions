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
public class ParkingTicket {
    
    private ParkedCar car;
    private ParkingMeter meter;
    private PoliceOfficer officer;
    
    public ParkingTicket(ParkedCar car, ParkingMeter meter, PoliceOfficer officer){
        this.car = new ParkedCar(car);
        this.meter = new ParkingMeter(meter);
        this.officer = new PoliceOfficer(officer);
    }
    
    public ParkingTicket(ParkingTicket ticket){
        this.car = ticket.car;
        this.meter = ticket.meter;
        this.officer = ticket.officer;
    }
    
    public ParkedCar getParkedCar(){
        return new ParkedCar(car);
    }
    
    public ParkingMeter getParkingMeter(){
        return new ParkingMeter(meter);
    }
    
    public double getFine(){
        double fine = 0;
        int parked = car.getMinutesParked();
        int allowed = meter.getMinutes();
        double diff = (parked - allowed) / 60.0;
        if(diff <= 1){
            fine += 25;
        } else {
            fine += 25;
            diff -= 1;
            fine += Math.floor(diff) * 10;
        }
        return fine;
    }
    
    public String reportCar(){
        return "Make: " + car.getMake() + ", Model: " + car.getModel() + ", Color: " + car.getColor() + ", License: " + car.getLicense();
    }
    
    public String reportFine(){
        return String.format("Fine: $%,.2f", getFine());
    }
    
    public String reportOfficer(){
        return "Name: " + officer.getName() + ", Badge Number: " + officer.getBadgeno();
    }
    
}
