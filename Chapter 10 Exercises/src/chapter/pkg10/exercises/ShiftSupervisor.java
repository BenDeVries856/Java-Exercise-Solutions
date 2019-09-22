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
public class ShiftSupervisor extends Employee{
    
    private double salary;
    private double bonus;
    
    public ShiftSupervisor(String name, String empno, String hiredate, double salary, double bonus){
        super(name, empno, hiredate);
        this.salary = salary;
        this.bonus = bonus;
    }
    
    // getters and setters
    public double getSalary(){return salary;}
    public double getBonus(){return bonus;}
    
    public void setSalary(double salary){this.salary = salary;}
    public void setBonus(double bonus){this.bonus = bonus;}
    
}
