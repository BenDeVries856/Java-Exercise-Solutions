/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

import java.util.Random;

/**
 *
 * @author ben_d
 */
public class Lottery {
    
    private int[] lotteryNumbers;
    
    public Lottery(){
        lotteryNumbers = new int[5];
        generateNumbers();
    }
    
    private void generateNumbers(){
        Random r = new Random();
        for(int i = 0; i < lotteryNumbers.length; i++){
            lotteryNumbers[i] = r.nextInt(10);
        }
    }
    
    public int compareNumbers(int[] lotteryPicks){
        int matches = 0;
        for(int i = 0; i < lotteryNumbers.length; i++){
            if(lotteryNumbers[i] == lotteryPicks[i]){
                matches++;
            }
        }
        return matches;
    }
    
    public int[] getWinningNumbers(){
        return this.lotteryNumbers;
    }
    
}
