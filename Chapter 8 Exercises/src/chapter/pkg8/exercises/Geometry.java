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
public class Geometry {
    
    public static double getCircleArea(double radius){
        if(isValid(radius)){
            return Math.PI * Math.pow(radius, 2);
        } else {
            System.out.println("Cannot have negative values!");
            return 0.0;
        }
    }
    
    public static double getRectangleArea(double length, double width){
        if(isValid(length, width)){
            return length * width;
        } else {
            System.out.println("Cannot have negative values!");
            return 0.0;
        }
    }
    
    public static double getTriangleArea(double base, double height){
        if(isValid(base, height)){
            return base * height * 0.5;
        } else {
            System.out.println("Cannot have negative values!");
            return 0.0;
        }
    }
    
    private static boolean isValid(double num){
        if(num < 0){
            return false;
        } else {
            return true;
        }
    }
    
    private static boolean isValid(double fnum, double snum){
        if(fnum < 0 || snum < 0){
            return false;
        } else {
            return true;
        }
    }
    
}
