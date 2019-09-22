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
public class InvalidTestScore extends Exception {
    
    public InvalidTestScore(){
        super("An invalid test score was entered");
    }
    
}
