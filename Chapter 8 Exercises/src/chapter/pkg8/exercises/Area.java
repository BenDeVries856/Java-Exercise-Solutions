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
public class Area {
    
    public static double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static int getArea(int width, int length){
        return width * length;
    }
    
    public static double getArea(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
}
