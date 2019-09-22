/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

/**
 *
 * @author ben_d
 */
public class Circle {
    
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(){
        this.radius = 0;
    }
    
    public double getArea(){
        return PI * radius * radius;
    }
    
    public double getDiameter(){
        return radius * 2;
    }
    
    public double getCircumference(){
        return 2 * PI * radius;
    }
    
    // getters and setters
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
}
