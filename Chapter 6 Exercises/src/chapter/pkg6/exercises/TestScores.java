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
public class TestScores {
    
    private int score1;
    private int score2;
    private int score3;
    
    public TestScores(int score1, int score2, int score3){
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    
    public double getAverage(){
        return ((double) score1 + score2 + score3) / 3;
    }
    
    // getters
    public int getScore1(){ return score1; }
    public int getScore2(){ return score2; }
    public int getScore3(){ return score3; }
    
    // setters
    public void setScore1(int num){ this.score1 = num; }
    public void setScore2(int num){ this.score2 = num; }
    public void setScore3(int num){ this.score3 = num; }
    
}
