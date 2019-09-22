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
public class DriversTest {
    
    private char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A',
                            'D', 'C', 'C', 'B', 'D', 'A'};
    private char[] student;
    private int correct = 0;
    private int incorrect = 0;
    
    public DriversTest(char[] studentAnswers){
        student = new char[20];
        for(int i = 0; i < student.length; i++){
            student[i] = studentAnswers[i];
        }
    }
    
    private void compare(){
        correct = 0;
        incorrect = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == student[i]){
                correct++;
            }else{
                incorrect++;
            }
        }
    }
    
    public boolean passed(){
        compare();
        if(correct >= 15){
            return true;
        } else {
            return false;
        }
    }
    
    public int totalCorrect(){
        compare();
        return correct;
    }
    
    public int totalIncorrect(){
        compare();
        return incorrect;
    }
    
    public int[] questionsMissed(){
        compare();
        int[] missed = new int[incorrect];
        int index = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] != student[i]){
                missed[index] = i + 1;
                index++;
            }
        }
        return missed;
    }
    
}
