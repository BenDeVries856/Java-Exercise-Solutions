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
public class PayRoll {
    
    private String employeeName;
    private int id;
    private double hourlyPayrate;
    private int numHours;
    
    /**public PayRoll(){
        this.employeeName = "";
        this.id = 0;
        this.hourlyPayrate = 0.0;
        this.numHours = 0;
    }**/
    
    public PayRoll(String employeeName, int id) throws EmptyString, InvalidEmployeeID {
        if(employeeName.isEmpty())
            throw new EmptyString();
        if(id < 1)
            throw new InvalidEmployeeID(id);
        this.employeeName = employeeName;
        this.id = id;
        this.hourlyPayrate = 0.0;
        this.numHours = 0;
    }
    
    public double getGrossPay(){
        return numHours * hourlyPayrate;
    }
    
    // getters
    public String getEmployeeName(){ return employeeName; }
    public int getIdNumber(){ return id; }
    public double getHourlyPayRate(){ return hourlyPayrate; }
    public int getHoursWorked(){ return numHours; }
    
    // setters
    public void setEmployeeName(String employeeName) throws EmptyString { 
        if(employeeName.isEmpty())
            throw new EmptyString();
        this.employeeName = employeeName;
    }
    public void setIdNumber(int id) throws InvalidEmployeeID { 
        if(id < 1)
            throw new InvalidEmployeeID(id);
        this.id = id;
    }
    public void setHourlyPayRate(double hourlyPayrate) throws InvalidHourlyPayrate {
        if(hourlyPayrate < 0 || hourlyPayrate > 25)
            throw new InvalidHourlyPayrate(hourlyPayrate);
        this.hourlyPayrate = hourlyPayrate;
    }
    public void setHoursWorked(int numHours) throws InvalidHoursWorked {
        if(numHours < 0 || numHours > 84)
            throw new InvalidHoursWorked(numHours);
        this.numHours = numHours;
    }
    
}
