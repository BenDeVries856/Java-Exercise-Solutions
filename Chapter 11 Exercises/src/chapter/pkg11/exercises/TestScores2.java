/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

/**
 *
 * @author ben_d
 */
public class TestScores2 {
    
    public int[] scores;
    
    public TestScores2(int[] scores){
        this.scores = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            this.scores[i] = scores[i];
        }
    }
    
    public double getAverage() throws InvalidTestScore {
        double total = 0;
        boolean negative = false;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < 0 || scores[i] > 100)
                negative = true;
            total += scores[i];
        }
        if(negative)
            throw new InvalidTestScore();
        return total / scores.length;
    }
    
}
