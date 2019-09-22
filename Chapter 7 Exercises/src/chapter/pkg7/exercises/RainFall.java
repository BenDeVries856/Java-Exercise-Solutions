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
public class RainFall {
    
    private double[] rainfall;
    
    public RainFall(double[] rainfall){
        this.rainfall = new double[12];
        for(int i = 0; i < this.rainfall.length; i++){
            this.rainfall[i] = rainfall[i];
        }
    }
    
    public double totalRainfall(){
        double total = 0;
        for(int i = 0; i < rainfall.length; i++){
            total += rainfall[i];
        }
        return total;
    }
    
    public double averageRainfall(){
        int total = 0;
        for(int i = 0; i < rainfall.length; i++){
            total += rainfall[i];
        }
        return total / 12;
    }
    
    public String leastRainfall(){
        double least = rainfall[0];
        int month = 0;
        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] < least){
                month = i;
            }
        }
        return getMonth(month);
    }
    
    public String greatestRainfall(){
        double greatest = rainfall[0];
        int month = 0;
        for(int i = 0; i < rainfall.length; i++){
            if(rainfall[i] > greatest){
                month = i;
            }
        }
        return getMonth(month);
    }
    
    private String getMonth(int num){
        switch(num){
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "Error!";
        }
    }
    
}
