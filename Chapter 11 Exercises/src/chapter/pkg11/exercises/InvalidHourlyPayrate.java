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
public class InvalidHourlyPayrate extends Exception {
    
    public InvalidHourlyPayrate(double pay){
        super("the invalid value " + pay + " was entered for the hourly pay rate");
    }
    
}
