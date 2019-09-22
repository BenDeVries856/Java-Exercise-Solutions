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
public class MonthDays {
    
    private int month;
    private int year;
    private boolean leapYear;
    
    public MonthDays(int month, int year){
        this.month = month;
        this.year = year;
    }
    
    public int getMonthDays(){
        if(year % 100 == 0){
            if(year % 400 == 0){
                leapYear = true;
            }
        } else {
            if(year % 4 == 0){
                leapYear = true;
            }
        }
        switch(month){
            case 1:
                return 31;
            case 2:
                if(leapYear){
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
    
}
