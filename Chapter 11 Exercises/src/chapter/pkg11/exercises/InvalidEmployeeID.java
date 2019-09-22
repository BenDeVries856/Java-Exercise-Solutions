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
public class InvalidEmployeeID extends Exception{
    
    public InvalidEmployeeID(int id){
        System.out.println("The invalid id " + id + "was entered for the employee id");
    }
    
}
