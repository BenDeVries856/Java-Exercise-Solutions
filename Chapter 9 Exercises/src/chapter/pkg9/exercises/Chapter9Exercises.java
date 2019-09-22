/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg9.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ben_d
 */
public class Chapter9Exercises {
    
    private static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //exerciseOne();
            //exerciseTwo();
            //exerciseThree();
            //exerciseFour();
            //exerciseFive();
            //exerciseSix();
            //exerciseSeven();
            //exerciseEight();
            //exerciseNine();
            //exerciseTen();
            //exerciseEleven();
            //exerciseTwelve();
            //exerciseThirteen();
            //exerciseFourteen();
            //exerciseFifteen();
            exerciseSixteen();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static String reverseString(String str){
      String newStr = "";
      for(int i = str.length() - 1; i >= 0; i--){
          newStr += str.charAt(i);
      }
      return newStr;
    }
    //
    public static void exerciseOne(){
        String input = JOptionPane.showInputDialog("Enter a string you want reversed");
        input = reverseString(input);
        JOptionPane.showMessageDialog(null, input);
    }
    
    public static int getWordCount(String str){
        String[] words = str.split(" ");
        return words.length;
    }
    //
    public static void exerciseTwo(){
        String input = JOptionPane.showInputDialog("Enter a sentence to get the word count");
        JOptionPane.showMessageDialog(null, "Word count: " + getWordCount(input));
    }
    
    public static String capitalizeSentences(String str){
        String[] sentences = str.split("\\.");
        for(int i = 0; i < sentences.length; i++){
            StringBuilder sb = new StringBuilder(sentences[i].trim());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            sentences[i] = sb.toString();
        }
        String result = "";
        for(int i = 0; i < sentences.length; i++){
            result += sentences[i] + ". ";
        }
        return result;
    }
    //
    public static void exerciseThree(){
        String input = JOptionPane.showInputDialog("Enter a couple of sentences to be capitalized");
        JOptionPane.showMessageDialog(null, capitalizeSentences(input));
    }
    
    public static void exerciseFour(){
        String input;
        System.out.println("Enter a string to get the vowel and consonent counts or e to exit");
        input = s.nextLine();
        while(Character.toLowerCase(input.charAt(0)) != 'e'){
            ConsonentsAndVowels cv = new ConsonentsAndVowels(input);
            int vowels = cv.getVowelCount();
            int cons = cv.getConsonentCount();
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonents: " + cons);
            System.out.println("Vowels and Consonents: " + (vowels + cons));
            System.out.println("");
            System.out.println("Enter a string to get the vowel and consonent counts or e to exit");
            input = s.nextLine();
        }
    }
    
    public static boolean isValidPassword(String str){
        if(str.length() < 6)
            return false;
        int upper = 0;
        int lower = 0;
        int digits = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                upper++;
            if(Character.isLowerCase(str.charAt(i)))
                lower++;
            if(Character.isDigit(str.charAt(i)))
                digits++;
        }
        if(upper < 1 || lower < 1 || digits < 1)
            return false;
        return true;
    }
    //
    public static void exerciseFive(){
        String input = "", retype;
        boolean valid = false;
        while(!valid){
            input = JOptionPane.showInputDialog("Create a password");
            retype = JOptionPane.showInputDialog("Re-enter password");
            if(!input.equals(retype)){
                JOptionPane.showMessageDialog(null, "Password do not match");
            } else {
                valid = true;
            }
        }
        if(isValidPassword(input))
            JOptionPane.showMessageDialog(null, "Password is valid");
        else
            JOptionPane.showMessageDialog(null, "Password is not valid");
    }
    
    public static void exerciseSix(){
        String[] names = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] phones = {"555-2234", "555-9098", "555-1785", "555-9224"};
        ArrayList<Integer> matches = new ArrayList<Integer>();
        String input = JOptionPane.showInputDialog("Enter a name to search");
        for(int i = 0; i < names.length; i++){
            String[] n = names[i].split(", ");
            String lname = n[0];
            String fname = n[1];
            if(input.equals(lname) || input.equals(lname)){
                matches.add(i);
            }
        }
        String output = "";
        for(int i = 0; i < matches.size(); i++){
            output += names[matches.get(i)] + ": " + phones[matches.get(i)] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static String getDigitWord(String s){
        int num = Integer.parseInt(s);
        if(num >= 90){
            return "ninety";
        } else if(num >= 80){
            return "eighty";
        } else if(num >= 70){
            return "seventy";
        } else if(num >= 60){
            return "sixty";
        } else if(num >= 50){
            return "fifty";
        } else if(num >= 40){
            return "forty";
        } else if(num >= 30){
            return "thirty";
        } else if(num >= 20){
            return "twenty";
        } else if(num >= 10){
          switch(num){
              case 10:
                  return "ten";
              case 11:
                  return "eleven";
              case 12:
                  return "twelve";
              case 13:
                  return "thirteen";
              case 14:
                  return "fourteen";
              case 15:
                  return "fifteen";
              case 16:
                  return "sixteen";
              case 17:
                  return "seventeen";
              case 18:
                  return "eighteen";
              case 19:
                  return "nineteen";
          }  
        } else {
            char c = s.charAt(0);
            switch(c){
                case '1':
                    return "one";
                case '2':
                    return "two";
                case '3':
                    return "three";
                case '4':
                    return "four";
                case '5':
                    return "five";
                case '6':
                    return "six";
                case '7':
                    return "seven";
                case '8':
                    return "eight";
                case '9':
                    return "nine";  
                default:
                    return "zero";
            }
        }
        return "zero";
    }
    //
    public static String spellOut(String str){
        StringBuilder output = new StringBuilder("");
        StringBuilder m = new StringBuilder(str);
        if(m.charAt(0) == '$')
            m.deleteCharAt(0);
        String[] decimalSides = m.toString().split("\\.");
        String left = decimalSides[0];
        String right = "";
        if(decimalSides.length > 1)
            right = decimalSides[1];
        for(int i = 0; i < left.length(); i++){
            int col = left.length() - i;
            switch(col){
                case 5:
                    output.append(getDigitWord(Character.toString(left.charAt(i))) + " million ");
                    break;
                case 4:
                    output.append(getDigitWord(Character.toString(left.charAt(i))) + " thousand ");
                    break;
                case 3:
                    output.append(getDigitWord(Character.toString(left.charAt(i))) + " hundred and ");
                    break;
                case 2:
                    output.append(getDigitWord(Character.toString(left.charAt(i)) + Character.toString(left.charAt(i+1))) + " ");
            }
        }
        if(decimalSides.length > 1)
            output.append("and " + right + " cents");
        output.setCharAt(0, Character.toUpperCase(output.charAt(0)));
        return output.toString();
    }
    //
    public static void exerciseSeven(){
        String date, name, amount, spelled;
        date = JOptionPane.showInputDialog("Enter the date");
        name = JOptionPane.showInputDialog("Enter your name");
        amount = JOptionPane.showInputDialog("Enter the amount");
        spelled = spellOut(amount);
        String output = String.format("\t\t\tDate:\t%s\n", date);
        output += String.format("\t\t\t\t$%s\n", amount);
        output += String.format("Pay to Order of: %s\n", name);
        output += spelled;
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }
    
    public static void exerciseEight(){
        String input = JOptionPane.showInputDialog("Enter a series of numbers seperated by commas");
        String[] s = input.split(",");
        int sum = 0;
        for(int i = 0; i < s.length; i++){
            sum += Integer.parseInt(s[i]);
        }
        JOptionPane.showMessageDialog(null, "sum: " + sum);
    }
    
    public static void exerciseNine(){
        String input = JOptionPane.showInputDialog("Enter a series of single digit numbers not seperated by anything");
        int total = 0;
        int highest = Integer.parseInt(input.substring(0, 1));
        int lowest = Integer.parseInt(input.substring(0, 1));
        for(int i = 0; i < input.length(); i++){
            int num = Integer.parseInt(input.substring(i, i+1));
            total += num;
            if(num > highest) highest = num;
            if(num < lowest) lowest = num;
        }
        JOptionPane.showMessageDialog(null, "Total: " + total + ", highest: " + highest + ", lowest: " + lowest);
    }
    
    public static void exerciseTen() throws FileNotFoundException{
        String path = JOptionPane.showInputDialog("Enter the name of a file");
        File file = new File(path);
        Scanner input = new Scanner(file);
        int words = 0;
        while(input.hasNext()){
            String line = input.nextLine();
            String[] w = line.split(" ");
            words += w.length;
        }
        input.close();
        JOptionPane.showMessageDialog(null, "Words: " + words);
    }
    
    public static void exerciseEleven() throws FileNotFoundException{
        String path = "SalesData.txt";
        File file = new File(path);
        Scanner input = new Scanner(file);
        ArrayList<Double> totals = new ArrayList<Double>();
        ArrayList<Double> averages = new ArrayList<Double>();
        double totalSales = 0;
        double totalAvg;
        while(input.hasNext()){
            String line = input.nextLine();
            String[] nums = line.split(",");
            double total = 0;
            for(int i = 0; i < nums.length; i++){
                total += Double.parseDouble(nums[i]);
            }
            totals.add(total);
            averages.add(total / (double) nums.length);
            totalSales += total;
        }
        totalAvg = totalSales / totals.size();
        input.close();
        int highestWeek = 0;
        double highest = totals.get(0);
        int lowestWeek = 0;
        double lowest = totals.get(0);
        for(int i = 0; i < totals.size(); i++){
            if(totals.get(i) > highest){
                highest = totals.get(i);
                highestWeek = i;
            }
            if(totals.get(i) < lowest){
                lowest = totals.get(i);
                lowestWeek = i;
            }
        }
        // displaying results
        System.out.println("WEEKLY TOTALS");
        for(int i = 0; i < totals.size(); i++){
            System.out.println("Week " + (i+1) + ": " + totals.get(i));
        }
        System.out.println("WEEKLY AVERAGES");
        for(int i = 0; i < averages.size(); i++){
            System.out.println("Week " + (i+1) + ": " + averages.get(i));
        }
        System.out.println("TOTAL SALES");
        System.out.println(totalSales);
        System.out.println("TOTAL AVERAGE");
        System.out.println(totalAvg);
        System.out.println("HIGHEST WEEK");
        System.out.println("Week " + (highestWeek+1));
        System.out.println("LOWEST WEEK");
        System.out.println("Week " + (lowestWeek+1));
    }
    
    public static void exerciseTwelve(){
        String s1 = "the dog jumped over the fence";
        String s2 = "the";
        String s3 = "that";
        char[] c = {'d','o','g',' ','b','o','i'};
        System.out.println(StringOps.wordCount(s1));
        System.out.println(StringOps.arrayToString(c));
        System.out.println(StringOps.mostFrequent(s1));
        System.out.println(StringOps.replaceSubstring(s1, s2, s3));
    }
    
    public static char convertToNum(char c){
        if(!Character.isLetter(c)){
            return c;
        } else {
            c = Character.toUpperCase(c);
            switch(c){
                case 'A':
                case 'B':
                case 'C':
                    return '2';
                case 'D':
                case 'E':
                case 'F':
                    return '3';
                case 'G':
                case 'H':
                case 'I':
                    return '4';
                case 'J':
                case 'K':
                case 'L':
                    return '5';
                case 'M':
                case 'N':
                case 'O':
                    return '6';
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    return '7';
                case 'T':
                case 'U':
                case 'V':
                    return '8';
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    return '9';
                default:
                    return '0';
            }
        }
    }
    //
    public static void exerciseThirteen(){
        StringBuilder phone = new StringBuilder(JOptionPane.showInputDialog("Enter an alphabetic phone number (xxx-xxx-xxxx)"));
        String original = phone.toString();
        for(int i = 0; i < phone.length(); i++){
            if(Character.isLetter(phone.charAt(i))){
                phone.setCharAt(i, convertToNum(phone.charAt(i)));
            }
        }
        System.out.println("Original: " + original);
        System.out.println("     New: " + phone);
    }
    
    public static void exerciseFourteen(){
        StringBuilder input = new StringBuilder(JOptionPane.showInputDialog("Enter a series of words not sperated (AaaBbCccc)"));
        ArrayList<String> words = new ArrayList<String>();
        int lastWord = 0;
        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                if(i != 0){
                    words.add(input.substring(lastWord, i));
                    lastWord = i;
                }
            } else if(i == input.length()-1){
                words.add(input.substring(lastWord, i+1));
            }
        }
        for(int i = 1; i < words.size(); i++){
            StringBuilder word = new StringBuilder(words.get(i));
            word.setCharAt(0, Character.toLowerCase(word.charAt(0)));
            words.set(i, word.toString());
        }
        String output = "";
        for(int i = 0; i < words.size(); i++){
            output += " " + words.get(i);
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static void exerciseFifteen(){
        String input = JOptionPane.showInputDialog("Enter a sentence to convert it to Pig Latin");
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++){
            StringBuilder word = new StringBuilder(words[i]);
            char c = word.charAt(0);
            word.deleteCharAt(0);
            word.append(c + "ay");
            words[i] =  word.toString();
        }
        String output = "";
        for(int i = 0; i < words.length; i++){
            output += words[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static String getMorseCode(char c){
        System.out.println(c);
        if(!Character.isLetter(c) && !Character.isDigit(c)){
            switch(c){
                case ' ':
                    return " ";
                case ',':
                    return "--..--";
                case '.':
                    return ".-.-.-";
                case '?':
                    return "..--..";
            }
        } else if(Character.isDigit(c)){
            int num = Character.getNumericValue(c);
            StringBuilder code;
            if(num < 6){
                code = new StringBuilder("-----");
                for(int i = 0; i < num; i++){
                    code.setCharAt(i, '.');
                }
            } else {
                code = new StringBuilder(".....");
                for(int i = 0; i < num-5; i++){
                    code.setCharAt(i, '-');
                }
            }
            return code.toString();
        }
        if(Character.isLetter(c)){
            c = Character.toUpperCase(c); 
            switch(c){
                case 'A':
                    return ".-";
                case 'B':
                    return "-...";
                case 'C':
                    return "-.-.";
                case 'D':
                    return "-..";
                case 'E':
                    return ".";
                case 'F':
                    return "..-.";
                case 'G':
                    return "--.";
                case 'H':
                    return "....";
                case 'I':
                    return "..";
                case 'J':
                    return ".---";
                case 'K':
                    return "-.-";
                case 'L':
                    return ".-..";
                case 'M':
                    return "--";
                case 'N':
                    return "-.";
                case 'O':
                    return "---";
                case 'P':
                    return ".--.";
                case 'Q':
                    return "--.-";
                case 'R':
                    return ".-.";
                case 'S':
                    return "...";
                case 'T':
                    return "-";
                case 'U':
                    return "..-";
                case 'V':
                    return "...-";
                case 'W':
                    return ".--";
                case 'X':
                    return "-..-";
                case 'Y':
                    return "-.--";
                case 'Z':
                    return "--..";
                default:
                    return "error!";
            }
        }
        return "error!";
    }
    //
    public static void exerciseSixteen(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                            'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println(getMorseCode(' '));
        System.out.println(getMorseCode(','));
        System.out.println(getMorseCode('.'));
        System.out.println(getMorseCode('?'));
        for(int i = 0; i < 10; i++){
            System.out.println(getMorseCode((char) (i+48)));
        }
        for(int i = 0; i < alphabet.length; i++){
            System.out.println(getMorseCode(alphabet[i]));
        }
        String input = JOptionPane.showInputDialog("Enter a sentence to convert it to morse code");
        String output = "";
        for(int i = 0; i < input.length(); i++){
            output += getMorseCode(input.charAt(i));
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
}
