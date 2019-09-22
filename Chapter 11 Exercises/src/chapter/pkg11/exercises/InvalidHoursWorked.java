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
public class InvalidHoursWorked extends Exception {
    
    public InvalidHoursWorked(int i){
        super("The invalid number " + i + " was entered for the number of hours worked");
    }
    
}
