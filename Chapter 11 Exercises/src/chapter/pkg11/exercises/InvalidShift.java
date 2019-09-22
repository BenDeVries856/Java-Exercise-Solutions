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
public class InvalidShift extends Exception {
    
    public InvalidShift(int shift){
        System.out.println("Shift must be either 1 or 2, not " + shift);
    }
    
}
