/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg2.exercises;

import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter2Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //exerciseOne();
        //exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        //exerciseFive();
        //exerciseSix();
        //exerciseSeven();
        exerciseEight();
        //exerciseNine();
        //exerciseTen();
        //exerciseEleven();
        //exerciseTwelve();
        //exerciseThirteen();
        //exerciseFourteen();
        //exerciseFifteen();
        //exerciseSixteen();
        //exerciseSeventeen();
        //exerciseEighteen();
        //exerciseNineteen();
    }
    
    public static void exerciseOne() {
        String name;
        int age;
        double annualPay;
        
        name = "Ben";
        age = 19;
        annualPay = 25000;
        
        System.out.println("My name is " + name + ", my age is " + age + " and");
        System.out.println("I hope to earn $" + annualPay + " this year.");
    }
    
    public static void exerciseTwo() {
        String firstName, middleName, lastName;
        firstName = "Ben";
        middleName = "John";
        lastName = "DeVries";
        char firstInitial, middleInitial, lastInitial;
        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);
        System.out.println(firstInitial + "." + middleInitial + "." + lastInitial);
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
    
    public static void exerciseThree() {
        String name, address; //city state and zip
        String telNum, major;
        name = "Ben DeVries";
        address = "167 Queen Street Sarnia, zip unkown";
        telNum = "(519)-280-0867";
        major = "Pencil Case Craftsman";
        System.out.println(name + "\n" + address + "\n" + telNum + "\n" + major);
    }
    
    public static void exerciseFour() {
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
        System.out.println(" ***** ");
        System.out.println("  ***  ");
        System.out.println("   *   ");
    }
    
    public static void exerciseFive() {
        double totalProfits = 4600000;
        double percent = 0.62;
        double eastCoast = totalProfits * percent;
        System.out.println("The East Coast sales division made $" + eastCoast + " of the $4.6 million total sales");
    }
    
    public static void exerciseSix() {
        final int ACRE = 43560;
        int land = 389767;
        float totalAcres = ((float) land) / ((float) ACRE);
        System.out.println("Total acres: " + totalAcres);
    }
    
    public static void exerciseSeven() {
        Scanner s = new Scanner(System.in);
        double purchase;
        double SALES_TAX = 0.04, COUNTY_TAX = 0.02;
        System.out.println("Enter the purchase price");
        purchase = s.nextDouble();
        System.out.println("  Sales Tax: " + (purchase * SALES_TAX));
        System.out.println(" County Tax: " + (purchase * COUNTY_TAX));
        System.out.println("  Total Tax: " + (purchase * SALES_TAX + purchase * COUNTY_TAX));
        System.out.println("Total Price: " + (purchase * SALES_TAX + purchase * COUNTY_TAX + purchase));
    }
    
    public static void exerciseEight() {
        Scanner scanner = new Scanner(System.in);
        int cookiesAte;
        int cookies = 40;
        int servings = 10;
        int calories = 300;
        System.out.println("How many cookies have you eaten?");
        cookiesAte = scanner.nextInt();
        double bagsAte = cookiesAte / (double) cookies;
        double servingsAte = bagsAte * (cookies / servings);
        double totalCals = servingsAte * calories;
        System.out.println("You have consumed " + totalCals + " calories");
    }
    
    public static void exerciseNine() {
        
    }
    
    public static void exerciseTen() {
        
    }
    
    public static void exerciseEleven() {
        
    }
    
    public static void exerciseTwelve() {
        
    }
    
    public static void exerciseThirteen() {
        
    }
    
    public static void exerciseFourteen() {
        
    }
    
    public static void exerciseFifteen() {
        
    }
    
    public static void exerciseSixteen() {
        
    }
    
    public static void exerciseSeventeen() {
        
    }
    
    public static void exerciseEighteen() {
        
    }
    
    public static void exerciseNineteen() {
        
    }
    
    
}
