/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg6.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter6Exercises {
    
    public static Scanner s = new Scanner(System.in);

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
            //exerciseSixteen();
            //exerciseSeventeen();
            exerciseEighteen();
        } catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public static void exerciseOne(){
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Enginner");
        //
        System.out.println(susan.getName());
        System.out.println(susan.getIdNumber());
        System.out.println(susan.getDepartment());
        System.out.println(susan.getPosition());
        //
        System.out.println(mark.getName());
        System.out.println(mark.getIdNumber());
        System.out.println(mark.getDepartment());
        System.out.println(mark.getPosition());
        System.out.println(joy.getName());
        //
        System.out.println(joy.getIdNumber());
        System.out.println(joy.getDepartment());
        System.out.println(joy.getPosition());
    }
    
    public static void exerciseTwo(){
        Car avenger = new Car(2008, "Dodge Avenger");
        avenger.accelerate();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.accelerate();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.accelerate();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.accelerate();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.accelerate();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.brake();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.brake();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.brake();
        System.out.println("Speed: " + avenger.getSpeed());
        avenger.brake();
        System.out.println("Speed: " + avenger.getSpeed());avenger.brake();
        System.out.println("Speed: " + avenger.getSpeed());
        
    }
    
    public static void exerciseThree(){
        Person turtle = new Person("Ben", "sarnia", 19, "519-280-0867");
        Person squid = new Person("Quintin", "Garys", 20, "Fuck if i know");
        Person homo = new Person("Jo", "Toronto", 20, "Fuck if i know");
    }
    
    public static void exerciseFour(){
        RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
        RetailItem jeans = new RetailItem("Designer Jeans", 40, 24.95);
        RetailItem shirt = new RetailItem("Shirt", 20, 24.95);
    }
    
    public static void exerciseFive(){
        PayRoll pr = new PayRoll();
        double grossPay;
        System.out.println("Enter the employees name:");
        pr.setEmployeeName(s.nextLine());
        System.out.println("Enter the employees id:");
        pr.setIdNumber(s.nextInt());
        System.out.println("Enter the employees hourly pay rate:");
        pr.setHourlyPayRate(s.nextDouble());
        System.out.println("Enter the number of hours the employee worked:");
        pr.setHoursWorked(s.nextInt());
        grossPay = pr.getGrossPay();
        System.out.printf("The employees gross pay is $%,.2f \n", grossPay);
    }
    
    public static void exerciseSix(){
        TestScores scores = new TestScores(0, 0, 0);
        System.out.println("Enter the first test score: ");
        scores.setScore1(s.nextInt());
        System.out.println("Enter the first second score: ");
        scores.setScore2(s.nextInt());
        System.out.println("Enter the first third score: ");
        scores.setScore3(s.nextInt());
        System.out.println("The average is " + scores.getAverage());
    }
    
    public static void exerciseSeven(){
        Circle circle = new Circle();
        System.out.println("Enter the radius of a circle:");
        circle.setRadius(s.nextDouble());
        System.out.println("         Area: " + circle.getArea());
        System.out.println("     Diameter: " + circle.getDiameter());
        System.out.println("Circumference: " + circle.getCircumference());
    }
    
    public static void exerciseEight(){
        System.out.println("Enter a temperature in farenheit:");
        Temperature temp = new Temperature(s.nextDouble());
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println(" Kelvin: " + temp.getKelvin());
    }
    
    public static void exerciseNine(){
        int month, year;
        System.out.println("Enter the year: ");
        year = s.nextInt();
        System.out.println("Enter the month: ");
        month = s.nextInt();
        MonthDays md = new MonthDays(month, year);
        System.out.println("Number of days: " + md.getMonthDays());
    }
    
    public static void exerciseTen(){
        int total = 0, comTotal = 0;
        boolean keepPlaying = true;
        Dice dice = new Dice(2);
        while(keepPlaying){  
            if(total < 21){
                comTotal += dice.roll();
                System.out.println("Your total is " + total);
                System.out.println("Would you like to roll? (Y or N)");
                char input = s.nextLine().charAt(0);
                if((input != 'y' && input != 'Y') || total >= 21){
                    keepPlaying = false;
                } else {
                    int roll = dice.roll();
                    System.out.println("You rolled a " + roll);
                    total += roll;
                }
            } else {
                keepPlaying = false;
            }
        }
        System.out.println("Your total is " + total);
        System.out.println("The computers total is " + comTotal);
        if(total == comTotal || (total > 21 && comTotal > 21)){
            System.out.println("You have tied");
        } else if(total > 21 && comTotal <= 21){
            System.out.println("You lose :(");
        } else if(total > comTotal || comTotal > 21){
            System.out.println("You win!");
        } else {
            System.out.println("You lose :(");
        }
    }
    
    public static void exerciseEleven(){
        double temp;
        System.out.println("Enter a temperature in farenheit:");
        temp = s.nextDouble();
        FreezeAndBoilPoints fb = new FreezeAndBoilPoints(temp);
        if(fb.isEthylBoiling()){
            System.out.println("Ethyl Alcohol boils at this temperature");
        }
        if(fb.isEthylFreezing()){
            System.out.println("Ethyl Aloohol freezes at this temperature");
        }
        if(fb.isOxygenBoiling()){
            System.out.println("Oxygen boils at this temperature");
        }
        if(fb.isOxygenFreezing()){
            System.out.println("Oxygen freezes at this temperature");
        }
        if(fb.isWaterBoiling()){
            System.out.println("Water boils at this temperature");
        }
        if(fb.isWaterFreezing()){
            System.out.println("Water freezes at this temperature");
        }
    }
    
    public static void exerciseTwelve(){
        double annualInterest, balance;
        int months;
        System.out.println("Enter the annual interest:");
        annualInterest = s.nextDouble();
        System.out.println("Enter the starting balance:");
        balance = s.nextDouble();
        System.out.println("Enter the months that have passed:");
        months = s.nextInt();
        SavingsAccount account = new SavingsAccount(balance);
        account.setInterestRate(annualInterest);
        for(int i = 1; i <= months; i++){
            System.out.println("How much was deposited during month " + i);
            account.makeDeposit(s.nextDouble());
            System.out.println("How much was withdrawn during month " + i);
            account.makeWithdrawal(s.nextDouble());
            account.addMonthlyInterest();
        }
        System.out.printf("after %d months, $%,.2f is left in the savings account \n", months, account.getBalance());
    }
    
    public static void exerciseThirteen() throws FileNotFoundException{
        SavingsAccount account = new SavingsAccount(500.0);
        account.setInterestRate(0.04);
        File deposits = new File("Deposits.txt");
        File withdrawals = new File("Withdrawals.txt");
        Scanner input = new Scanner(deposits);
        while(input.hasNext()){
            double num = input.nextDouble();
            account.makeDeposit(num);
        }
        input = new Scanner(withdrawals);
        while(input.hasNext()){
            double num = input.nextDouble();
            account.makeWithdrawal(num);
        }
        account.addMonthlyInterest();
        System.out.printf("balance: $%,.2f \n", account.getBalance());
    }
    
    public static void exerciseFourteen(){
        int pwins = 0, cwins = 0;
        Dice playerDice = new Dice(6);
        Dice computerDice = new Dice(6);
        for(int i = 0; i < 10; i++){
            int player = playerDice.roll();
            int computer = computerDice.roll();
            if(player == computer){
                System.out.println("You tied");
            } else if(computer > player){
                System.out.println("You lose :(");
                cwins++;
            } else {
                System.out.println("You win!");
                pwins++;
            }
        }
        System.out.println("The Grand Winner is:");
        if(cwins == pwins){
            System.out.println("You and the computer I guess");
        } else if(cwins > pwins){
            System.out.println("The Computer");
        } else {
            System.out.println("You!!!");
        }
    }
    
    public static void exerciseFifteen(){
        int pocket;
        do{
            System.out.println("Enter a Roulette number (0 - 36)");
            pocket = s.nextInt();
        } while(pocket < 0 || pocket > 36);
        Roulette table = new Roulette(pocket);
        System.out.println("The pocket color is " + table.getPocketColor());
    }
    
    public static void exerciseSixteen(){
        int heads = 0, tails = 0;
        String side;
        Coin coin = new Coin();
        System.out.println("A coin will be tossed 20 times");
        System.out.println("Initial side up:");
        side = coin.getSideUp();
        System.out.println(side);
        for(int i = 0; i < 20; i++){
            coin.toss();
            side = coin.getSideUp();
            System.out.println(side);
            if(side.equals("heads")){
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads was tossed " + heads + " times");
        System.out.println("Tails was tossed " + tails + " times");
    }
    
    public static void exerciseSeventeen(){
        double balance = 0;
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();
        while(balance < 1.0){
            quarter.toss();
            dime.toss();
            nickel.toss();
            if(quarter.getSideUp().equals("heads")){
                balance += 0.25;
            }
            if(dime.getSideUp().equals("heads")){
                balance += 0.10;
            }
            if(nickel.getSideUp().equals("heads")){
                balance += 0.05;
            }
        }
        System.out.println("Your ending balance is $" + balance);
        if(balance == 1.0){
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose :)");
        }
    }
    
    public static void exerciseEighteen(){
        // 1 - pike 4 points, 2 - bass 3 points, 3 - muskie 5 points, 4 - perch 2 points, 5 - old boot 1 point, 6 - sunfish 2 points
        Dice fish = new Dice(1);
        char ans;
        int total = 0, rolls = 0;
        do{
            int roll = fish.roll();
            rolls++;
            switch(roll){
                case 1:
                    System.out.println("You caught a Pike!");
                    total += 4;
                    break;
                case 2:
                    System.out.println("You caught a Bass!");
                    total += 3;
                    break;
                case 3:
                    System.out.println("You caught a Musky!!!");
                    total += 5;
                    break;
                case 4:
                    System.out.println("You caught a perch");
                    total += 2;
                    break;
                case 5:
                    System.out.println("You caught an Old Boot");
                    total += 1;
                    break;
                case 6:
                    System.out.println("You caught a Sunfish");
                    total += 2;
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            System.out.println("Do yo want to fish again?");
            ans = s.nextLine().charAt(0);
        } while(ans == 'y' || ans == 'Y');
        System.out.println("You scored " + total);
        double avg = (double) total / rolls;
        if(avg < 2){
            System.out.println("You suck at fishing");
        } else if(avg < 4){
            System.out.println("Your aight");
        } else {
            System.out.println("Youre pretty damn good at fishing");
        }
    }
    
}
