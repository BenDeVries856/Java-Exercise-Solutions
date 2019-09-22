/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

import java.io.Serializable;

/**
 *
 * @author ben_d
 */
public class TestScores implements Serializable {
    
    public int[] scores;
    
    public TestScores(int[] scores){
        this.scores = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            this.scores[i] = scores[i];
        }
    }
    
    public double getAverage() throws IllegalArgumentException {
        double total = 0;
        boolean negative = false;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < 0 || scores[i] > 100)
                negative = true;
            total += scores[i];
        }
        if(negative)
            throw new IllegalArgumentException();
        return total / scores.length;
    }
    
}
