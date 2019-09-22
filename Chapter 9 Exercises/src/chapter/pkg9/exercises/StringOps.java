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
public class StringOps {
    
    public static int wordCount(String str){
        String[] words = str.split(" ");
        return words.length;
    }
    
    public static String arrayToString(char[] c){
        String s = "";
        for(int i = 0; i < c.length; i++){
            s += String.valueOf(c[i]);
        }
        return s;
    }
    
    public static char mostFrequent(String str){
        char freq = str.charAt(0);
        int occurences = getOccurences(str, freq);
        for(int i = 0; i < str.length(); i++){
            int o = getOccurences(str, str.charAt(i));
            if(o > occurences){
                occurences = o;
                freq = str.charAt(i);
            }
        }
        return freq;
    }
    
    public static String replaceSubstring(String s1, String s2, String s3){
        StringBuilder str = new StringBuilder(s1);
        for(int i = 0; i < str.length() - s2.length(); i++){
            String sub = str.substring(i, i+s2.length());
            if(sub.equals(s2)){
                str.replace(i, i+s2.length(), s3);
            }
        }
        return str.toString();
    }
    
    private static int getOccurences(String str, char c){
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c) num++;
        }
        return num;
    }
    
}
