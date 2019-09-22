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
public class TeamLeader extends ProductionWorker{
    
    private double monthlyBonus;
    private int trainingRequired;
    private int trainingComplete;
    
    public TeamLeader(String name, String empno, String hiredate, int shift, double hourlyPay,
            double bonus, int training, int complete){
        super(name, empno, hiredate, shift, hourlyPay);
        this.monthlyBonus = bonus;
        this.trainingComplete = training;
        this.trainingComplete = complete;
    }
    
    // getters and setters
    public double getMonthlyBonus(){return monthlyBonus;}
    public int getTrainingRequired(){return trainingRequired;}
    public int getTrainingComplete(){return trainingComplete;}
    
    public void setMonthlyBonus(double bonus){this.monthlyBonus = bonus;}
    public void setTrainingRequired(int required){this.trainingRequired = required;}
    public void setTrainingComplete(int complete){this.trainingComplete = complete;}
    
}
