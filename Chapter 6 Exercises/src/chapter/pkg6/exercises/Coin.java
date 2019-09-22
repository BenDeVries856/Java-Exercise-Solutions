/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

import java.util.Random;

/**
 *
 * @author ben_d
 */
public class Coin {
    
    private String sideUp;
    
    public Coin(){
        toss();
    }
    
    public void toss(){
        Random r = new Random();
        if(r.nextInt(2) == 0){
            this.sideUp = "heads";
        } else {
            this.sideUp = "tails";
        }
    }
    
    public String getSideUp(){return sideUp;}
    public void setSideUp(String sideUp){this.sideUp = sideUp;}
    
}
