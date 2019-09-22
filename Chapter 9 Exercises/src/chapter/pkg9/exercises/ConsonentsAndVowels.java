/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg9.exercises;

/**
 *
 * @author ben_d
 */
public class ConsonentsAndVowels {
    
    private String str;
    private static final char[] VOWELS = {'a','e','i','o','u'};
    
    public ConsonentsAndVowels(String str){
        this.str = str;
    }
    
    public int getVowelCount(){
        int vowels = 0;
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i)))
                vowels++;
        }
        return vowels;
    }
    
    public int getConsonentCount(){
        int consonents = 0;
        for(int i = 0; i < str.length(); i++){
            if(isConsonent(str.charAt(i)))
                consonents++;
        }
        return consonents;
    }
    
    private boolean isConsonent(char c){
        boolean cons = true;
        for(int i = 0; i < VOWELS.length; i++){
            if(Character.toUpperCase(VOWELS[i]) == Character.toUpperCase(c)){
                cons = false;
            }
        }
        return cons;
    }
    
    private boolean isVowel(char c){
        boolean vow = false;
        for(int i = 0; i < VOWELS.length; i++){
            if(Character.toUpperCase(VOWELS[i]) == Character.toUpperCase(c)){
                vow = true;
            }
        }
        return vow;
    }
    
}
