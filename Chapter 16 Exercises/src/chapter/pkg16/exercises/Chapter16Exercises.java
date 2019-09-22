/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg16.exercises;

import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter16Exercises {
    
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
            exerciseTen();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static int add(int a, int b){
        if(b == 1){
            return a;
        }else{
            return a + add(a, b - 1);
        }
    }
    //
    public static void exerciseOne(){
        System.out.println(add(7, 4));
        System.out.println(add(10, 2));
        System.out.println(add(25, 1));
    }
    
    public static boolean isMember(int[] a, int i, int value, int length){
        if(a[i] == value){
            return true;
        }else if(i == length - 1){
            return false;
        }else{
            return isMember(a, i+1, value, length);
        }
    }
    //
    public static void exerciseTwo(){
        int[] a = {1, 6, 3, 8, 5};
        int[] b = {3, 7, 9};
        int value = 9;
        System.out.println(isMember(a, 0, value, 5));
        System.out.println(isMember(b, 0, value, 3));
    }
    
    public static void printStringReverse(String s){
        if(s.length() <= 1){
            System.out.println(s.charAt(0));
        }else{
            System.out.print(s.charAt(s.length()-1));
            printStringReverse(s.substring(0,s.length()-1));
        }
    }
    //
    public static void exerciseThree(){
        printStringReverse("Reverse");
    }
    
    private static int maxMember(int[] a){
        return maxMember(a, 1, a[0]);
    }
    private static int maxMember(int[] a, int i, int max){
        if(a[i] > max){
            max = a[i];
        }
        if(i == a.length-1){
            return max;
        }else{
            return maxMember(a, i+1, max);
        }
    }
    //
    public static void exerciseFour(){
        int[] a = {1,3,45,2,12,65,7,56};
        System.out.println(maxMember(a));
    }
    
    private static boolean isPalindrome(String s, int i){
        if(i == s.length() / 2){
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt((s.length()-1)-i))){
                return true;
            }else{
                return false;
            }
        }else{
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt((s.length()-1)-i))){
                return isPalindrome(s, i+1);
            }else{
                return false;
            }
        }
    }
    //
    public static void exerciseFive(){
        System.out.println(isPalindrome("Able was I ere I saw Elba", 0));
        System.out.println(isPalindrome("kayak", 0));
        System.out.println(isPalindrome("Random string", 0));
    }
    
    private static int countChars(String s, char c, int i){
        int occurence = 0;
        if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)){
            occurence++;
        }
        if(i == s.length()-1){
            return occurence;
        }
        return occurence + countChars(s, c, i+1);
    }
    //
    public static void exerciseSix(){
        System.out.println(countChars("There are alot of eeeees in this string", 'e', 0));
    }
    
    private static int power(int i, int e){
      if(e == 1){
          return i;
      }else{
        return i * power(i, e-1);  
      }
    }
    //
    public static void exerciseSeven(){
        System.out.println(power(2,2));
        System.out.println(power(10,6));
        System.out.println(power(3,7));
    }
    
    private static int sumUpTo(int num){
        if(num == 1){
            return 1;
        }else{
            return num + sumUpTo(num-1);
        }
    }
    public static void exerciseEight(){
        System.out.println(sumUpTo(50));
        System.out.println(sumUpTo(3));
        System.out.println(sumUpTo(8));
    }
    
    private static int ackermann(int m, int n){
        if(m == 0){
            return n+1;
        }else if(n == 0){
            return ackermann(m - 1, 1);
        }else{
            return ackermann(m-1, ackermann(m, n-1));
        }
    }
    //
    public static void exerciseNine(){
        System.out.println(ackermann(0, 0));
        System.out.println(ackermann(0, 1));
        System.out.println(ackermann(1, 1));
        System.out.println(ackermann(1, 2));
        System.out.println(ackermann(1, 3));
        System.out.println(ackermann(2, 2));
        System.out.println(ackermann(3, 2));
    }
    
    private static double population1(int organisms, int days, double growth){
        if(days == 1){
            return organisms + (organisms * growth);
        }else{
            double sub = population1(organisms, days-1, growth);
            return sub + (sub * growth);
        }
    }
    //
    private static double population2(int organisms, int days, double growth){
        double total = organisms;
        for(int i = 0; i < days; i++){
            total += total * growth;
        }
        return total;
    }
    //
    public static void exerciseTen(){
        int organisms, days;
        double growth;
        do{
            System.out.println("What is the starting number of organisms?");
            organisms = s.nextInt();
        } while(organisms < 2);
        do{
            System.out.println("What percentage do they increase each day?");
            growth = s.nextDouble() / 100;
        } while(growth < 0);
        do{
            System.out.println("How many days are they multiplying for?");
            days = s.nextInt();
        } while(days < 1);
        System.out.println("After " + days + " days ther are now " + (int) (population1(organisms, days, growth)) + " organsims");
        System.out.println("After " + days + " days ther are now " + (int) (population2(organisms, days, growth)) + " organsims");
    }
    
    
}
