/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

/**
 *
 * @author ben_d
 */
public class Payroll {
    
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;
    
    public Payroll(){
        employeeId = new int[7];
        hours = new int[7];
        payRate = new double[7];
        wages = new double[7];
    }
    
    public double getGrossPay(int id){
        int subscript = 0;
        for(int i = 0; i < employeeId.length; i++){
            if(employeeId[i] == id){
                subscript = i;
            }
        }
        return wages[subscript];
    }
    
    public void calculateGrossPay(){
        for(int i = 0; i < hours.length; i++){
            wages[i] = (double) hours[i] * payRate[i];
        }
    }
    
    public void displayGrossPay(){
        for(int i = 0; i < wages.length; i++){
            System.out.printf("%d + pay: $%,.2f \n", employeeId[i], wages[i]);
        }
    }
    
    // getters and setters
    public int[] getEmployeeId(){
        return employeeId;
    }
    
    public int[] getHours(){
        return hours;
    }
    
    public double[] getPayRate(){
        return payRate;
    }
    
    public double[] getWages(){
        return wages;
    }
    
    public void setEmployeeId(int[] ids){
        for(int i = 0; i < ids.length; i++){
            this.employeeId[i] = ids[i];
        }
    }
    
    public void setHours(int[] hours){
        for(int i = 0; i < hours.length; i++){
            this.hours[i] = hours[i];
        }
    }
    
    public void setPayRate(double[] pay){
        for(int i = 0; i < pay.length; i++){
            this.payRate[i] = pay[i];
        }
    }
    
    public void setWages(double[] wages){
        for(int i = 0; i < wages.length; i++){
            this.wages[i] = wages[i];
        }
    }
    
}
