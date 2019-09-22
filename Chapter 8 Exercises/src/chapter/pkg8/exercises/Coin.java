/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

import java.util.Random;

/**
 *
 * @author ben_d
 */
public class Coin {
    
    public enum Face { HEADS, TAILS };
    
    private String faceup;
    private Random r;
    
    public Coin(){
        r = new Random();
    }
    
    public Face flipCoin(){
        int flip = r.nextInt(2);
        System.out.println("Roll: " + flip);
        if(flip == 0){
            return Face.HEADS;
        } else {
            return Face.TAILS;
        }
    }
    
}
