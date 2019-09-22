/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

/**
 *
 * @author ben_d
 */
public class Player {
    
    private Dice dice;
    private int points;
    
    public Player(Dice dice){
        this.dice = new Dice(dice);
        this.points = 50;
    }
    
    // the method returns true if the roll results in a win
    public boolean roll(){
        int roll = dice.roll();
        if(roll == points-1){
            points = points - roll;
            return true;
        } else if(roll >= points){
            points = ((points - roll) * -1) + 1;
            return false;
        } else {
            points -= roll;
            return false;
        }
    }
    
    public int getScore(){
        return this.points;
    }
    
}
