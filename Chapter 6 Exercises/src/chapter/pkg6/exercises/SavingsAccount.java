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
public class SavingsAccount {
    
    private double interestRate;
    private double balance;
    
    public SavingsAccount(double balance){
        this.balance = balance;
    }
    
    public void makeWithdrawal(double amount){
        balance -= amount;
    }
    
    public void makeDeposit(double amount){
        balance += amount;
    }
    
    public void addMonthlyInterest(){
        double monthly = interestRate / 12;
        double amount = monthly * balance;
        balance += amount;
    }
    
    // getters and setters
    public double getInterestRate(){return interestRate;}
    public double getBalance(){return balance;}
    
    public void setInterestRate(double interest){this.interestRate = interest;}
    public void setBalance(double balance){this.balance = balance;}
    
}
