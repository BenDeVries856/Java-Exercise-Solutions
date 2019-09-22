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
public class BankAccount {
    
    private double balance;
    private int deposits;
    private int withdrawals;
    private double interest;
    private double charge;
    
    public BankAccount(double balance, double interest){
        this.balance = balance;
        this.interest = interest;
    }
    
    public void deposit(double amount){
        balance += amount;
        deposits++;
    }
    
    public void withdraw(double amount){
        balance -= amount;
        withdrawals++;
    }
    
    public void calcInterest(){
        double rate = interest / 12.0;
        double earned = interest * balance;
        balance += earned;
    }
    
    public void monthlyProcess(){
        balance -= charge;
        calcInterest();
        deposits = 0;
        withdrawals = 0;
    }
    
    public void withdrawRemaining(){
        balance = 0;
    }
    
    // getters and setters
    public double getBalance(){return balance;}
    public int getDeposits(){return deposits;}
    public int getWithdrawals(){return withdrawals;}
    public double getInterestRate(){return interest;}
    public double getMonthlyCharge(){return charge;}
    
    public void setMonthlyCharge(double charge){this.charge = charge;}
    
}
