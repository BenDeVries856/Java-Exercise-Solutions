/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter8Exercises {
    
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
            exerciseTwelve();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }
    
    public static void exerciseOne(){
        double circle = Area.getArea(5);
        double rectangle = Area.getArea(5, 7);
        double cylinder = Area.getArea(5.0, 7);
        System.out.printf("   Area of circle: %.2f \n", circle);
        System.out.printf("Area of rectangle: %.2f \n", rectangle);
        System.out.printf(" Area of cylinder: %.2f \n", cylinder);
    }
    
    public static void exerciseTwo(){
        BankAccount account1 = new BankAccount(2000);
        BankAccount account2 = new BankAccount(account1);
        account2.setBalance(3000);
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("They different");
    }
    
    public static void exerciseThree(){
        System.out.println("Enter the length and width of a room in feet:");
        double width = s.nextDouble();
        double height = s.nextDouble();
        RoomDimension dimension = new RoomDimension(width, height);
        System.out.println("Enter the price of the carpet per square foot:");
        double price = s.nextDouble();
        RoomCarpet carpet = new RoomCarpet(dimension, price);
        System.out.printf("The total cost of the carpet is $%,.2f \n", carpet.getTotalCost());
    }
    
    public static void exerciseFour(){
        int length, width;
        System.out.println("Enter the length and width for the first track of land");
        length = s.nextInt();
        width = s.nextInt();
        LandTract tract1 = new LandTract(length, width);
        System.out.println("Enter the length and width for the second track of land");
        length = s.nextInt();
        width = s.nextInt();
        LandTract tract2 = new LandTract(length, width);
        System.out.println("The area of the first tract is " + tract1.getArea());
        System.out.println("The area of the second tract is " + tract2.getArea());
        if(tract1.equals(tract2)){
            System.out.println("They are equal in area");
        } else {
            System.out.println("They are not equal in area");
        }
    }
    
    public static void exerciseFive(){
        Month m1 = new Month();
        Month m2 = new Month("November");
        m1.setMonth(4);
        boolean equalTo = m1.equals(m2);
        boolean greaterThan = m1.greaterThan(m2);
        boolean lessThan = m1.lessThan(m2);
        System.out.println(equalTo);
        System.out.println(greaterThan);
        System.out.println(lessThan);
        System.out.println(m1 + ", " + m2);
    }
    
    public static void exerciseSix(){
        System.out.println("What is the price of the item you are purchasing?");
        RetailItem item = new RetailItem("", 1, s.nextDouble());
        System.out.println("How many are you purchasing?");
        CashRegister register = new CashRegister(item, s.nextInt());
        System.out.printf("Subtotal: $%,.2f \n", register.getSubtotal());
        System.out.printf("     Tax: $%,.2f \n", register.getTax());
        System.out.printf("   Total: $%,.2f \n", register.getTotal());
    }
    
    public static void exerciseSeven() throws FileNotFoundException{
        System.out.println("What is the price of the item you are purchasing?");
        RetailItem item = new RetailItem("", 1, s.nextDouble());
        System.out.println("How many are you purchasing?");
        CashRegister register = new CashRegister(item, s.nextInt());
        PrintWriter output = new PrintWriter("receipt.txt");
        String[] r = register.generateReceipt();
        for(int i = 0; i < r.length; i++){
            output.println(r[i]);
        }
        output.close();
    }
    
    public static void exerciseEight(){
        ParkedCar car = new ParkedCar("Dodge", "Avenger", "Black", "CULDUD", 5 * 60);
        ParkingMeter meter = new ParkingMeter(3 * 60);
        PoliceOfficer officer = new PoliceOfficer("Ralph Smith", 123456, car, meter);
        ParkingTicket ticket = officer.generateTicket();
        System.out.println("Car:");
        System.out.println("\t" + ticket.reportCar());
        System.out.println("Fine:");
        System.out.println("\t" + ticket.reportFine());
        System.out.println("Officer:");
        System.out.println("\t" + ticket.reportOfficer());
    }
    
    public static void exerciseNine(){
        int input;
        do{
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            input = s.nextInt();
            if(input < 1 || input > 4){
                System.out.println("Thats not an option, pick again");
            } else if(input == 1){
                double radius;
                System.out.println("Enter the radius:");
                radius = s.nextDouble();
                double area = Geometry.getCircleArea(radius);
                System.out.println("Area: " + area);
            } else if(input == 2){
                double length, width;
                System.out.println("Enter the length and width:");
                length = s.nextDouble();
                width = s.nextDouble();
                double area = Geometry.getRectangleArea(length, width);
                System.out.println("Area: " + area);
            } else if(input == 3){
                double base, height;
                System.out.println("Enter the base and height:");
                base = s.nextDouble();
                height = s.nextDouble();
                double area = Geometry.getTriangleArea(base, height);
                System.out.println("Area: " + area);
            }
        } while(input != 4);
    }
    
    public static void exerciseTen(){
        FuelGage fgage = new FuelGage(0);
        Odometer ometer = new Odometer(50000, fgage);
        ometer.fillCar(40);
        while(ometer.getFuelGage().getFuel() > 0){
            System.out.println("Fuel: " + ometer.getFuelGage().getFuel() + " gallons, Mileage: " + ometer.getMileage() + " miles");
            ometer.driveMile();
        }
    }
    
    public static void exerciseEleven(){
        Dice dice = new Dice(6);
        Player player1 = new Player(dice);
        Player player2 = new Player(dice);
        int turn = 1;
        boolean player1Won = false;
        boolean player2Won = false;
        while(!player1Won || !player2Won){
            player1Won = player1.roll();
            player2Won = player2.roll();
            System.out.println("Turn " + turn + ": player one - " + player1.getScore() + ", player2 - " + player2.getScore());
            turn++;
        }
        System.out.println("Final Score: player one - " + player1.getScore() + ", player2 - " + player2.getScore());
        if(player1.getScore() == player2.getScore()){
            System.out.println("Both players tied!");
        } else if(player1.getScore() == 1){
            System.out.println("Player one won!");
        } else {
            System.out.println("Player two won!");
        }
    }
    
    public static void exerciseTwelve(){
        CoinPlayer p1 = new CoinPlayer();
        CoinPlayer p2 = new CoinPlayer();
        int score1 = 0;
        int score2 = 0;
        while(score1 != 5 && score2 != 5){
            System.out.println("Player 1, what is your guess? (heads/tails)");
            System.out.println(p1.flip(s.nextLine()));
            System.out.println("Player 2, what is your guess? (heads/tails)");
            System.out.println(p2.flip(s.nextLine()));
            score1 = p1.getPoints();
            score2 = p2.getPoints();
            System.out.println("## Scores - p1: " + score1 + ", p2: " + score2);
        }
        if(score1 == score2){
            System.out.println("You Tied!");
        } else if(score1 > score2){
            System.out.println("Player 1 triumphed!");
        } else {
            System.out.println("Player 2 triumphed!");
        }
    }
    
}
