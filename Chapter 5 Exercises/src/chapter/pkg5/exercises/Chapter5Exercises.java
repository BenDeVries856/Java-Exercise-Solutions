/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg5.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter5Exercises {
    
    public static Scanner s = new Scanner(System.in);
    public static Random r = new Random();

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
        //exerciseEight();
        //exerciseNine();
        //exerciseTen();
        //exerciseEleven();
        //exerciseTwelve();
        //exerciseThirteen();
        //exerciseFourteen();
        //exerciseFifteen();
        //exerciseSixteen();
        //exerciseSeventeen();
        exerciseEighteen();
    }
    
    public static void showChar(String s, int i){
        System.out.println(s.charAt(i));
    }
    //
    public static void exerciseOne(){
        showChar("New York", 2);
    }
    
    public static double calculateRetail(double cost, int markup){
        return cost + (cost * ((double) markup / 100));
    }
    //
    public static void exerciseTwo(){
        double cost, price;
        int markup;
        System.out.println("Enter the items wholesale price:");
        cost = s.nextDouble();
        System.out.println("Enter the items markup percent:");
        markup = s.nextInt();
        price = calculateRetail(cost, markup);
        System.out.printf("Total cost: $%,.2f \n", price);
    }
    
    public static double getLength(){
        System.out.println("Enter the rectangles length:");
        return s.nextDouble();
    }
    //
    public static double getWidth(){
        System.out.println("Enter the rectangles width:");
        return s.nextDouble();
    }
    //
    public static double getArea(double length, double width){
        return length * width;
    }
    //
    public static void displayData(double length, double width, double area){
        System.out.printf("Rectangle Length: %.2f \n", length);
        System.out.printf(" Rectangle Width: %.2f \n", width);
        System.out.printf("  Rectangle Area: %.2f \n", area);
    }
    //
    public static void exerciseThree(){
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
    }
    
    public static double getPaintGallons(int totalFeet){
        final int SPACE_PER_GALLON = 115;
        return (double) totalFeet / SPACE_PER_GALLON;
    }
    //
    public static double getHoursRequired(int totalFeet){
        final int HOURS_PER_GALLON = 8;
        return (double) totalFeet / HOURS_PER_GALLON;
    }
    //
    public static double getPaintCost(double gallons, double price){
        return gallons * price;
    }
    //
    public static double getLaborCharge(double hours){
        final double PRICE_PER_HOUR = 18.00;
        return hours * PRICE_PER_HOUR;
    }
    //
    public static double getTotalCost(double paint, double labor){
        return paint + labor;
    }
    //
    public static void exerciseFour(){
        int numRooms, totalFeet = 0;
        double gallonPrice;
        System.out.println("How many rooms need to be painted?");
        numRooms = s.nextInt();
        System.out.println("What is the price per gallon?");
        gallonPrice = s.nextDouble();
        System.out.println("Enter how many square feet each room is:");
        for(int i = 0; i < numRooms; i++){
            int feet = s.nextInt();
            totalFeet += feet;
        }
        double totalGallons = getPaintGallons(totalFeet);
        double totalHours = getHoursRequired(totalFeet);
        double paint = getPaintCost(totalGallons, gallonPrice);
        double labor = getLaborCharge(totalHours);
        double total = getTotalCost(paint, labor);
        System.out.printf("The total cost will be $%,.2f \n", total);
    }
    
    public static double fallingDistance(double time){
        return Math.pow(9.8 * time, 2) / 2;
    }
    //
    public static void exerciseFive(){
        double distance;
        for(int i = 1; i <= 10; i++){
            distance = fallingDistance(i);
            System.out.printf("The item fell %.2fm in %d seconds \n", distance, i);
        }
    }
    
    public static double celsius(double farenheit){
        return (5.0 / 9.0) * (farenheit - 32);
    }
    //
    public static void exerciseSix(){
        System.out.printf("%s %9s \n", "F", "C");
        System.out.println("--------------------");
        for(int i = 0; i < 20; i++){
            System.out.printf("%,d %,9.2f \n", i, celsius(i));
        }
    }
    
    public static double calcAverage(int score1, int score2, int score3, int score4, int score5){
        return (double) (score1 + score2 + score3 + score4 + score5) / 5.0;
    }
    //
    public static char determineGrade(int score){
        if(score < 60){
            return 'F';
        }else if(score < 70){
            return 'D';
        }else if(score < 80){
            return 'C';
        }else if(score < 90){
            return 'B';
        }else{
            return 'A';
        }
    }
    //
    public static void exerciseSeven(){
        int score1, score2, score3, score4, score5;
        System.out.println("Enter 5 test scores:");
        score1 = s.nextInt();
        System.out.println(determineGrade(score1));
        score2 = s.nextInt();
        System.out.println(determineGrade(score2));
        score3 = s.nextInt();
        System.out.println(determineGrade(score3));
        score4 = s.nextInt();
        System.out.println(determineGrade(score4));
        score5 = s.nextInt();
        System.out.println(determineGrade(score5));
        System.out.printf("The average score is: %.2f", calcAverage(score1, score2, score3, score4, score5));
    }
    
    public static void showKilometers(double meters){
        double kilometers = meters * 0.001;
        System.out.println("Kilometers: " + kilometers);
    }
    //
    public static void showInches(double meters){
        double inches = meters * 39.37;
        System.out.println("Inches: " + inches);
    }
    //
    public static void showFeet(double meters){
        double feet = meters * 3.281;
        System.out.println("Feet: " + feet);
    }
    //
    public static void showMenu(){
        System.out.println("1: Convert to kilometers");
        System.out.println("2: Convert to inches");
        System.out.println("3: Convert to feet");
        System.out.println("4: Quit the program");
        System.out.println("");
    }
    //
    public static void exerciseEight(){
        double meters;
        int choice;
        System.out.println("Enter a distance in meters:");
        meters = s.nextDouble();
        do{
            showMenu();
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            if(choice == 1){
                showKilometers(meters);
            } else if(choice == 2){
                showInches(meters);
            }else if(choice == 3){
                showFeet(meters);
            }else if(choice < 1 || choice > 4){
                System.out.println(choice + " is not a valid choice");
            } else {
                System.out.println("Bye!");
            }
        } while(choice != 4);
    }
    
    public static double distance(int speed, int time){
        return (double) speed * time;
    }
    //
    public static void exerciseNine(){
        int hours, speed;
        do{
            System.out.println("How fast were you going?");
            speed = s.nextInt();   
        } while(speed < 0);
        do{
            System.out.println("How long in hours were you driving for?");
            hours = s.nextInt();
        } while(hours < 1);
        System.out.printf("%-10s %-10s", "Hours", "Distance Travelled \n");
        System.out.printf("---------------------- \n");
        for(int i = 1; i <= hours; i++){
            System.out.printf("%-10d %-10.2f \n", i, distance(speed, i));
        }
    }
    
    public static double stockProfit(int numShares, double buyPrice, double buyCommission, double sellPrice, double sellCommission){
        return ((numShares * sellPrice) - sellCommission) - ((numShares * buyPrice) - buyCommission);
    }
    //
    public static void exerciseTen(){
        int ns;
        double pp, pc, sp, sc;
        System.out.println("Enter the number of shares sold:");
        ns = s.nextInt();
        System.out.println("Enter the price per share:");
        pp = s.nextDouble();
        System.out.println("Enter the purchase commission price:");
        pc = s.nextDouble();
        System.out.println("Enter the sale price per share:");
        sp = s.nextDouble();
        System.out.println("Enter the sales commission price:");
        sc = s.nextDouble();
        System.out.println("Profit: " + stockProfit(ns, pp, pc, sp, sc));
    }
    
    //
    public static void exerciseEleven(){
        int ns, difShares;
        double pp, pc, sp, sc, totalProfit;
        totalProfit = 0;
        System.out.println("How many different company shares where dealt?");
        difShares = s.nextInt();
        for(int i = 0; i < difShares; i++){
            System.out.println("Enter the number of shares sold for company " + i + ":");
            ns = s.nextInt();
            System.out.println("Enter the price per share:");
            pp = s.nextDouble();
            System.out.println("Enter the purchase commission price:");
            pc = s.nextDouble();
            System.out.println("Enter the sale price per share:");
            sp = s.nextDouble();
            System.out.println("Enter the sales commission price:");
            sc = s.nextDouble();
            totalProfit += stockProfit(ns, pp, pc, sp, sc);
        }
        System.out.println("Total Profit: " + totalProfit);
    }
    
    public static double kineticEnergy(double mass, double velocity){
        return (1.0/2.0) * Math.pow(mass * velocity, 2);
    }
    //
    public static void exerciseTwelve(){
        double mass, velocity;
        System.out.println("Enter an objects mass in kg:");
        mass = s.nextDouble();
        System.out.println("Enter an objects velocity:");
        velocity = s.nextDouble();
        System.out.println("Kinetic Energy: " + kineticEnergy(mass, velocity));
    }
    
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    //
    public static void exerciseThirteen(){
        System.out.println("Is 4356 prime? " + isPrime(4356));
    }
    
    //
    public static void exerciseFourteen(){
        String list = "";
        for(int i = 1; i < 100; i++){
            if(isPrime(i)){
                list += i + "\n";
            }
        }
        System.out.println("All prime numbers between 1-100");
        System.out.println(list);
    }
    
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    //
    public static void exerciseFifteen(){
        int numOdd = 0, numEven = 0;
        for(int i = 0; i < 100; i++){
            int num = r.nextInt();
            if(isEven(num)){
                numEven++;
            } else {
                numOdd++;
            }
        }
        System.out.println("Out of 100 randomly picked numbers:");
        System.out.println(numEven + " where even");
        System.out.println(numOdd + " where odd");
    }
    
    public static double presentValue(double futureValue, double interestRate, int numYears){
        return futureValue / Math.pow(1.0 + interestRate, numYears);
    }
    //
    public static void exerciseSixteen(){
        double futureValue, interestRate, presentValue;
        int numYears;
        System.out.println("Enter the amount of money you would like to have:");
        futureValue = s.nextDouble();
        System.out.println("Enter the interest rate you can get:");
        interestRate = s.nextDouble();
        System.out.println("Enter the number of years you would like to have this money in:");
        numYears = s.nextInt();
        presentValue = presentValue(futureValue, interestRate, numYears);
        System.out.println("Invest $" + presentValue + " now to have $" + futureValue + " in " + numYears + " years");
    }
    
    public static String getRPSWord(){
        int num = r.nextInt(3) + 1;
        switch(num){
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                return "error";
        }
    }
    //
    public static void determineWinner(String computer, String user){
        if(computer.equals("rock") && user.equals("scissors")){
            System.out.println("You lose");
        } else if(computer.equals("scissors") && user.equals("rock")){
            System.out.println("You win!");
        } else if(computer.equals("scissors") && user.equals("paper")){
            System.out.println("You lose");
        } else if(computer.equals("paper") && user.equals("scissors")){
            System.out.println("You win!");
        } else if(computer.equals("paper") && user.equals("rock")){
            System.out.println("You lose");
        } else if(computer.equals("rock") && user.equals("paper")){
            System.out.println("You win!");
        } else {
            System.out.println("You tied");
        }
    }
    //
    public static void exerciseSeventeen(){
        String computer, user;
        computer = getRPSWord();
        System.out.println("Enter rock, paper, or scissors:");
        user = s.nextLine();
        System.out.println("The computer chose " + computer);
        determineWinner(computer, user);
    }
    
    public static String getESP(){
        int i = r.nextInt(5);
        switch(i){
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
            default:
                return "error";
        }
    }
    //
    public static String getUserGuess(){
        System.out.println("Guess what color the computer picked (Red, Blue, Green, Yellow or Orange):");
        return s.nextLine();
    }
    //
    public static void exerciseEighteen(){
        int right = 0, wrong = 0;
        for(int i = 0; i < 10; i++){
            String esp = getESP();   
            String guess = getUserGuess();
            System.out.println("The correct color was " + esp);
            if(esp.equals(guess)){
                right++;
            } else {
                wrong++;
            }
        }
        System.out.println("You guessed " + right + " right");
        System.out.println("You guessed " + wrong + " wrong");
    }   
    
}
