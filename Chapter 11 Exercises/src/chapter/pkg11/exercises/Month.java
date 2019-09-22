/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

/**
 *
 * @author ben_d
 */
public class Month {
    
    private int monthNumber;
    
    public Month(){
        this.monthNumber = 1;
    }
    
    public Month(int monthNumber) throws InvalidMonthNumber{
        if(monthNumber < 1 || monthNumber > 12){
            this.monthNumber = 1;
        } else {
            throw new InvalidMonthNumber(monthNumber);
        }
    }
    
    public Month(String month) throws InvalidMonth {
        this.monthNumber = getMonthNumber(month);
    }
    
    private int getMonthNumber(String month) throws InvalidMonth {
        switch(month){
            case "January":
            case "january":
            case "jan":
                return 1;
            case "February":
            case "february":
            case "feb":
                return 2;
            case "March":
            case "march":
            case "mar":
                return 3;
            case "April":
            case "april":
            case "apr":
                return 4;
            case "May":
            case "may":
                return 5;
            case "Junr":
            case "junr":
            case "jun":
                return 6;
            case "July":
            case "july":
            case "jul":
                return 7;
            case "August":
            case "august":
            case "aug":
                return 8;
            case "September":
            case "september":
            case "sep":
                return 9;
            case "October":
            case "october":
            case "oct":
                return 10;
            case "November":
            case "november":
            case "nov":
                return 11;
            case "December":
            case "december":
            case "dec":
                return 12;
            default:
                throw new InvalidMonth(month);
        }
    }
    
    private String getMonth(int num) throws InvalidMonthNumber{
        if(num < 0 || num > 12)
            throw new InvalidMonthNumber(num);
        switch(num){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Error!";
        }
    }
    
    // getters and setters
    public void setMonth(int num) throws InvalidMonthNumber{
        if(num < 1 || num > 12){
            this.monthNumber = 1;
        } else {
            throw new InvalidMonthNumber(num);
        }
    }
    
    public int getMonthNumber(){
        return this.monthNumber;
    }
    
    public String getMonthName() throws InvalidMonthNumber{
        return getMonth(this.monthNumber);
    }
    
    public String toString(){
        try{
            return getMonth(this.monthNumber);
        } catch(InvalidMonthNumber e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    public boolean equals(Month month){
        if(this.monthNumber == month.monthNumber){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean greaterThan(Month month){
        if(this.monthNumber > month.monthNumber){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean lessThan(Month month){
        if(this.monthNumber < month.monthNumber){
            return true;
        } else {
            return false;
        }
    }
    
}
