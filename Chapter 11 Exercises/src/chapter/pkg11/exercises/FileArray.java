/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ben_d
 */
public class FileArray {
    
    public static void writeArray(String filename, int[] nums) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream(filename);
        DataOutputStream output = new DataOutputStream(file);
        for(int i = 0; i < nums.length; i++){
            output.writeInt(nums[i]);
        }
        output.close();
    }
    
    public static void readArray(String filename, int[] nums) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream(filename);
        DataInputStream input = new DataInputStream(file);
        boolean endOfFile = false;
        int i = 0;
        while(!endOfFile){
            try{
                nums[i] = input.readInt();
                i++;
            } catch(EOFException e){
                endOfFile = true;
            }
        }
        input.close();
    }
    
}
