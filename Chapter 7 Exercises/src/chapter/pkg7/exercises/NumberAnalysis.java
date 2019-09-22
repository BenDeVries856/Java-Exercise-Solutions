/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class NumberAnalysis {
    
    private String filename;
    private ArrayList<Integer> numbers;
    
    public NumberAnalysis(String file){
        this.filename = file;
        this.numbers = new ArrayList<Integer>();
        try{
            readFromFile();
        } catch(FileNotFoundException e){
            System.out.println("Error reading from the file");
        }
    }
    
    private void readFromFile() throws FileNotFoundException{
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            numbers.add(input.nextInt());
        }
    }
    
    public int getTotal(){
        int total = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
        }
        return total;
    }
    
    public double getAverage(){
        double total = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
        }
        return total / (double) numbers.size();
    }
  
    public int getHighest(){
        int highest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > highest){
                highest = numbers.get(i);
            }
        }
        return highest;
    }
    
    public int getLowest(){
        int lowest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < lowest){
                lowest = numbers.get(i);
            }
        }
        return lowest;
    }
    
}
