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
public class InvalidMonthNumber extends Exception {
    
    public InvalidMonthNumber(int num){
        super("Month must be between 1 and 12: " + num + " was entered");
    }
    
}
