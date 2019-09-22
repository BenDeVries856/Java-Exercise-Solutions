/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

import java.util.ArrayList;

/**
 *
 * @author ben_d
 */
public class GradeBook {
    
    private ArrayList<String> names;
    private char[] letters;
    private double[][] grades;
    
    public GradeBook(ArrayList<String> names, double[][] grades){
        this.names = names;
        this.letters = new char[5];
        this.grades = grades;
    }
    
    private void calculateGrades(){
        for(int i = 0; i < grades.length; i++){
            double total = 0;
            for(int j = 0; j < grades[i].length; j++){
                total += grades[i][j];
            }
            double average = total / 4;
            letters[i] = getLetterGrade(average);
        }
    }
    
    private char getLetterGrade(double grade){
        if(grade < 60){
            return 'F';
        } else if(grade < 70){
            return 'D';
        } else if(grade < 80){
            return 'C';
        } else if(grade < 90){
            return 'B';
        } else {
            return 'A';
        }
    }
    
    public void getGrades(int student){
        calculateGrades();
        System.out.println("        Name: " + names.get(student));
        double total = 0;
        for(int i = 0; i < grades[student].length; i++){
            total += grades[student][i];
        }
        double average = total / 4;
        System.out.println("     Average: " + average);
        System.out.println("Letter Grade: " + letters[student]);
    }
    
}
