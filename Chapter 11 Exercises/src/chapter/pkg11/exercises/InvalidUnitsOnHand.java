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
public class InvalidUnitsOnHand extends Exception {
    
    public InvalidUnitsOnHand(){
        super("An Invalid unitsonhand Value was given");
    }
    
}
