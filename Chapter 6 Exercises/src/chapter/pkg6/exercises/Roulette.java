/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

import java.util.Random;

/**
 *
 * @author ben_d
 */
public class Roulette {
    
    private int num;
    private Random r = new Random();
    
    public Roulette(){
        this.num = newNumber();
    }
    
    public Roulette(int num){
        if(num >= 0 && num <= 36){
            this.num = num;
        } else {
            this.num = newNumber();
        }
    }
    
    private int newNumber(){
        return r.nextInt(37);
    }
    
    public String getPocketColor(){
        if(num == 0){
            return "Green";
        } else if((num > 0 && num <= 10) || (num > 18 && num <= 28)){
            if(num % 2 == 0){
                return "Black";
            } else {
                return "Red";
            }
        } else {
            if(num % 2 == 0){
                return "Red";
            } else {
                return "Black";
            }
        }
    }
    
    // getters and setters
    public int getPocketNumber(){return num;}
    public void setPocketNumber(int num){this.num = num;}
    
}
