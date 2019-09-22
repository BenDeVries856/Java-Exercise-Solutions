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
public class GradeBookModified {
    
    private ArrayList<String> names;
    private char[] letters;
    private double[][] grades;
    private double[] averages;
    
    public GradeBookModified(ArrayList<String> names, double[][] grades){
        this.names = names;
        this.letters = new char[5];
        this.grades = grades;
        this.averages = new double[5];
    }
    
    private void calculateGrades(){
        for(int i = 0; i < grades.length; i++){
            double total = 0;
            double lowest = grades[i][0];
            for(int j = 0; j < grades[i].length; j++){
                if(grades[i][j] < lowest){
                    lowest = grades[i][j];
                }
                total += grades[i][j];
            }
            System.out.println(lowest);
            total -= lowest;
            double average = total / 3;
            averages[i] = average;
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
        System.out.println("     Average: " + averages[student]);
        System.out.println("Letter Grade: " + letters[student]);
    }
    
}
