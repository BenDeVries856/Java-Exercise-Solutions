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
public class InvalidPay extends Exception {
    
    public InvalidPay(double pay){
        System.out.println(pay + " is an invalid hourly pay rate");
    }
    
}
