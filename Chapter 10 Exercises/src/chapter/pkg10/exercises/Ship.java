/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10.exercises;

/**
 *
 * @author ben_d
 */
public class Ship {
    
    private String name;
    private String year;
    
    public Ship(String name, String year){
        this.name = name;
        this.year = year;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", Year: " + year;
    }
    
    // getters and setters
    public String getName(){return name;}
    public String getYear(){return year;}
    
    public void setName(String name){this.name = name;}
    public void setYear(String year){this.year = year;}
    
}
