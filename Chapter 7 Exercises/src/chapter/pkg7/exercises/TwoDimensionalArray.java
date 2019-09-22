/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

/**
 *
 * @author ben_d
 */
public class TwoDimensionalArray {
    
    public static int getTotal(int[][] a){
        int total = 0;
        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a[x].length; y++){
                total += a[x][y];
            }
        }
        return total;
    }
    
    public static double getAverage(int[][] a){
        double total = 0;
        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a[x].length; y++){
                total += a[x][y];
            }
        }
        return total / (double) (a.length * a[0].length);
    }
    
    public static int getRowTotal(int[][] a, int row){
        int total = 0;
        for(int i = 0; i < a[row].length; i++){
            total += a[row][i];
        }
        return total;
    }
    
    public static int getColumnTotal(int[][] a, int column){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i][column];
        }
        return total;
    }
    
    public static int getHighestInRow(int[][] a, int row){
        int highest = a[row][0];
        for(int i = 0; i < a[row].length; i++){
            if(a[row][i] > highest){
                highest = a[row][i];
            }
        }
        return highest;
    }
    
    public static int getLowestInRow(int[][] a, int row){
        int lowest = a[row][0];
        for(int i = 0; i < a[row].length; i++){
            if(a[row][i] < lowest){
                lowest = a[row][i];
            }
        }
        return lowest;
    }
    
}
