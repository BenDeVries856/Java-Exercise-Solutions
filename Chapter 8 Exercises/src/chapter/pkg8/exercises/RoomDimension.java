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
public class RoomDimension {
    
    private double width;
    private double height;
    
    public RoomDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public RoomDimension(RoomDimension dimension){
        this.width = dimension.width;
        this.height = dimension.height;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public String toString(){
        return "width: " + width + ", height: " + height;
    }
    
}
