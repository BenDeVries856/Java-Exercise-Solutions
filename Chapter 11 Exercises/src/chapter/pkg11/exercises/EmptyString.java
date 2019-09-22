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
public class EmptyString extends Exception{
    
    public EmptyString(){
        super("An empty string was given as the employee name");
    }
    
}
