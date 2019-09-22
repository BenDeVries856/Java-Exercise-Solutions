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
public class ProductionWorker extends Employee {
    
    private int shift;
    private double hourlyPay;
    
    public ProductionWorker(String name, String empno, String hiredate, int shift, double hourlyPay){
        super(name, empno, hiredate);
        if(isValidShift(shift)){
            this.shift = shift;
        } else {
            this.shift = 1;
        }
        this.hourlyPay = hourlyPay;
    }
    
    // 1 is the day shift and 2 is the night shift
    private boolean isValidShift(int shift){
        if(shift == 1 || shift == 2){
            return true;
        } else {
            return false;
        }
    }
    
    // getters and setters
    public int getShift(){return shift;}
    public double getHourlyPay(){return hourlyPay;}
    
    public void setShift(int shift){
        if(isValidShift(shift)){
            this.shift = shift;
        } else {
            this.shift = 1;
        }
    }
    public void setHourlyPay(double hourlyPay){this.hourlyPay = hourlyPay;}
    
}
