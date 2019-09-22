/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

import java.util.Random;

/**
 *
 * @author ben_d
 */
public class Dice {
    
    private int sides;
    private Random r;
    
    public Dice(int sides){
        this.sides = sides;
        this.r = new Random();
    }
    
    public Dice(Dice dice){
        this.sides = dice.sides;
        this.r = new Random();
    }
    
    public int roll(){
        return r.nextInt(sides) + 1;
    }
    
    public int getSides(){
        return this.sides;
    }
    
    public void setSides(int sides){
        this.sides = sides;
    }
    
}
