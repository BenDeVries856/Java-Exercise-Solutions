/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

/**
 *
 * @author ben_d
 */
public class LandTract {
    
    private int length;
    private int width;
    
    public LandTract(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    public int getArea(){
        return this.length * this.width;
    }
    
    public boolean equals(LandTract tract){
        if(this.length == tract.length &&
                this.width == tract.width){
            return true;
        } else {
            return false;
        }
    }
    
    public String toString(){
        return "length: " + length + ", height: " + width;
    }
    
}
