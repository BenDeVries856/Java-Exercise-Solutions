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
public class Essay extends GradedActivity {
    
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    
    public Essay(){
        this.grammar = 0;
        this.spelling = 0;
        this.length = 0;
        this.content = 0;
        determineGrade();
    }
    
    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        determineGrade();
    }
    
    public Essay(Essay essay){
        this.grammar = essay.grammar;
        this.spelling = essay.spelling;
        this.length = essay.length;
        this.content = essay.content;
        determineGrade();
    }
    
    private void determineGrade(){
        super.setScore(grammar + spelling + length + content);
    }
    
    @Override
    public char getGrade(){
        determineGrade();
        return super.getGrade();
    }
    
    // getters and setter
    public int getGrammar(){return grammar;}
    public int getSpelling(){return spelling;}
    public int getLength(){return length;}
    public int getContent(){return content;}
    
    public void setGrammar(int grammar){this.grammar = grammar;}
    public void setSpelling(int spelling){this.spelling = spelling;}
    public void setLength(int length){this.length = length;}
    public void setContent(int content){this.content = content;}
    
}
