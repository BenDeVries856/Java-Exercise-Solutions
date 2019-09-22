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
import java.util.ArrayList;

/**
 *
 * @author ben_d
 */
public class FileEncryptor {
    
    public static void EncryptFile(String file1, String file2) throws FileNotFoundException {
        FileInputStream istream = new FileInputStream(file1);
        DataInputStream input = new DataInputStream(istream);
        ArrayList<Character> chars = new ArrayList<Character>();
        boolean end = false;
        while(!end){
            try{
                chars.add(input.readChar());
            }catch(EOFException e){
                end = true;
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        for(int i = 0; i < chars.size(); i++){
            char c = chars.get(i);
            c += 10;
            chars.set(i, c);
        }
        FileOutputStream ostream = new FileOutputStream(file2);
        DataOutputStream output = new DataOutputStream(ostream);
        try{
            for(int i = 0; i < chars.size(); i++){
                char c = chars.get(i);
                c += 10;
                output.writeChar(c);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void DecryptFile(String filename) throws IOException {
        FileInputStream file = new FileInputStream(filename);
        DataInputStream input = new DataInputStream(file);
        ArrayList<Character> chars = new ArrayList<Character>();
        boolean end = false;
        while(!end){
            try{
                chars.add(input.readChar());
            }catch(EOFException e){
                end = true;
            }
        }
        System.out.println("Encrypted:");
        System.out.println(charsToString(chars));
        for(int i = 0; i < chars.size(); i++){
            char c = chars.get(i);
            c -= 20;
            chars.set(i, c);
        }
        System.out.println("Decrypted:");
        System.out.println(charsToString(chars));
    }
    
    private static String charsToString(ArrayList<Character> chars){
        String result = "";
        for(int i = 0; i < chars.size(); i++){
            result += chars.get(i).toString();
        }
        return result;
    }
    
}
