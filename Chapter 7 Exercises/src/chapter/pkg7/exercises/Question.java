/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

/**
 *
 * @author ben_d
 */
public class Question {
    
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private char correct;
    
    public Question(String question, String answerA, String answerB, String answerC, String answerD, char correct){
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correct = correct;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public char getCorrect(){
        return correct;
    }
    
    public void setCorrect(char correct){
        this.correct = correct;
    }
    
    public String getAnswer(char answer){
        switch(answer){
            case 'A':
            case 'a':
                return answerA;
            case 'B':
            case 'b':
                return answerB;
            case 'C':
            case 'c':
                return answerC;
            case 'D':
            case 'd':
                return answerD;
            default:
                return "Invalid answer passed to method";
        }
    }
    
    public void setAnswer(char answer, String value){
        switch(answer){
            case 'A':
            case 'a':
                answerA = value;
            case 'B':
            case 'b':
                answerB = value;
            case 'C':
            case 'c':
                answerC = value;
            case 'D':
            case 'd':
                answerD = value;
        }
    }
    
}
