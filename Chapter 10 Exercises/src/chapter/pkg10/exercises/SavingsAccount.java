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
public class SavingsAccount extends BankAccount{
    
    private boolean active;
    
    public SavingsAccount(double balance, double interest){
        super(balance, interest);
        active = isActive();
    }
    
    public boolean isActive(){
        if(super.getBalance() < 25){
            active = false;
            return false;
        } else {
            active = true;
            return true;
        }
    }
    
    @Override
    public void withdraw(double amount){
        if(isActive()){
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds, accoun inactive");
        }
    }
    
    @Override 
    public void withdrawRemaining(){
        if(isActive()){
            super.withdrawRemaining();
        } else {
            System.out.println("Insufficient funds, accoun inactive");
        }
    }
    
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        if(super.getBalance() >= 25){
            active = true;
        }
    }
    
    @Override
    public void monthlyProcess(){
        if(super.getWithdrawals() > 4){
            super.setMonthlyCharge(super.getMonthlyCharge()+1);
        }
        super.monthlyProcess();
        super.setMonthlyCharge(super.getMonthlyCharge()-1);
        if(!isActive()){
            active = false;
        }
    }
    
}
