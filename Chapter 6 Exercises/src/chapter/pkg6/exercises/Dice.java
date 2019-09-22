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
public class Dice {
    
    private int numDice;
    private static Random r = new Random();
    
    public Dice(int numDice){
        this.numDice = numDice;
    }
    
    public int roll(){
        int num = 0;
        for(int i = 0; i < numDice; i++){
            num += r.nextInt(6) + 1;
        }
        return num;
    }
    
    // getters and setters
    public int getNumDice(){
        return numDice;
    }
    
    public void setNumDice(int num){
        this.numDice = num;
    }
    
}
