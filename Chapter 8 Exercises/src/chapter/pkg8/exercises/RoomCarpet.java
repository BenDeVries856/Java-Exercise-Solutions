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
public class RoomCarpet {
    
    private RoomDimension dimension;
    private double cost;
    
    public RoomCarpet(RoomDimension dimension, double cost){
        this.dimension = new RoomDimension(dimension);
        this.cost = cost;
    }
    
    public double getTotalCost(){
        return dimension.getArea() * cost;
    }
    
    public String toString(){
        return "area: " + dimension.getArea() + ", cost: " + cost;
    }
    
}
