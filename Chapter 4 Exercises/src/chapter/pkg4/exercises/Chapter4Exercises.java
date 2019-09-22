/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg4.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter4Exercises {
    
    public static Scanner s = new Scanner(System.in);
    public static Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // exerciseOne();
            // exerciseTwo();
            // exerciseThree();
            // exerciseFour();
            // exerciseFive();
            // exerciseSix();
            // exerciseSeven();
            // exerciseEight();
            // exerciseNine();
            // exerciseTen();
            // exerciseEleven();
            // exerciseTwelve();
            // exerciseThirteen();
            // exerciseFourteen();
            // exerciseFifteen();
            // exerciseSixteen();
            // exerciseSeventeen();
            // exerciseEighteen();
            // exerciseNineteen();
            // exerciseTwenty();
            // exerciseTwentyOne();
             exerciseTwentyTwo();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void exerciseOne(){
        System.out.println("Enter a positive integer:");
        int num = s.nextInt();
        int total = 0;
        for(int i = 0; i < num; i++){
            total += (i + 1);
        }
        System.out.println(total);
    }
    
    public static void exerciseTwo(){
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
            System.out.printf("%-10d %-10d \n", i, i * speed);
        }
    }
    
    public static void exerciseThree() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("ExerciseThree.txt");
        int hours, speed;
        do{
            System.out.println("How fast were you going?");
            speed = s.nextInt();   
        } while(speed < 0);
        do{
            System.out.println("How long in hours were you driving for?");
            hours = s.nextInt();
        } while(hours < 1);
        pw.printf("%-10s %-10s", "Hours", "Distance Travelled ");
        pw.println("");
        pw.printf("---------------------- ");
        pw.println("");
        for(int i = 1; i <= hours; i++){
            pw.printf("%-10d %-10d \n", i, i * speed);
            pw.println("");
        }
        pw.close();
    }
    
    public static void exerciseFour(){
        int days;
        double pay = 0.01;
        System.out.println("How many days worked for 1 cent a day doubled eacch day?");
        days = s.nextInt();
        System.out.printf("%s %10s \n", "Day", "Amount");
        for(int i = 1; i <= days; i++){
            String output = String.format("$%,.2f", pay);
            System.out.printf("%d %10s \n", i, output);
            pay = pay * 2;
        }
    }
    
    public static void exerciseFive(){
        String sentence;
        char letter;
        System.out.println("Enter a sentence:");
        sentence = s.nextLine();
        System.out.println("Enter a letter:");
        letter = s.nextLine().charAt(0);
        int total = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == letter){
                total++;
            }
        }
        System.out.printf("The letter %c appears in the sentence %d times \n", letter, total);
    }
    
    public static void exerciseSix() throws FileNotFoundException{
        File file;
        char letter;
        System.out.println("Enter the name of a file:");
        file = new File(s.nextLine());
        Scanner input = new Scanner(file);
        System.out.println("Enter a letter you want to search for:");
        letter = s.nextLine().charAt(0);
        int total = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == letter)
                    total++;
            }
        }
        System.out.printf("The letter %c appears in the file %d times \n", letter, total);
        input.close();
    }
    
    public static void exerciseSeven(){
        int floors;
        int rooms = 0;
        int occupied = 0;
        do{
            System.out.println("How many floors are in the hotel?");
            floors = s.nextInt();
        } while (floors < 1);
        for(int i = 1; i <= floors; i++){
            int num;
            do{
                System.out.println("How many rooms are on floor " + i);
                num = s.nextInt();
            } while(num < 10);
            rooms += num;
            System.out.println("How many of the rooms are occupied");
            occupied += s.nextInt();
        }
        double ocRate = (double) occupied / rooms;
        System.out.println("There are " + rooms + " in the hotel");
        System.out.println(occupied + " of the rooms are occupied");
        System.out.println((rooms - occupied) + " of the rooms are vacant");
        System.out.println("The occupancy rate of the hotel is " + ocRate);
    }
    
    public static void exerciseEight(){
        int years;
        do{
            System.out.println("How many years?");
            years = s.nextInt();
        } while(years < 1);
        double total = 0;
        for(int i = 0; i < years; i++){
            double monthly;
            for(int j = 1; j <= 12; j++){
                do{
                    System.out.println("Enter the rainfall in inches for month " + j + " of year " + (i + 1));
                    monthly = s.nextDouble();
                } while(monthly < 1);
                total += monthly;
            }
        }
        System.out.println("Total months accounted for: " + (years * 12));
        System.out.println("Total rainfall: " + total + "\"");
        System.out.println("Average rainfall per month: " + (total / (years * 12)) + "\"");
    }
    
    public static void exerciseNine(){
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
        for(int i = 0; i < days; i++){
            organisms += organisms * growth;
        }
        System.out.println("After " + days + " days ther are now " + organisms + " organsims");
    }
    
    public static void exerciseTen(){
        int sent = -99;
        int largest, smallest;
        int input;
        System.out.println("Enter a number or -99 to finish");
        input = s.nextInt();
        largest = input;
        smallest = input;
        while(input != -99){
            System.out.println("Enter a number or -99 to finish");
            input = s.nextInt();
            if(input > largest && input != -99) largest = input;
            if(input < smallest && input != -99) smallest = input;
        }
        System.out.println("Smallest number entered: " + smallest);
        System.out.println(" Largest number entered: " + largest);
    }
    
    public static void exerciseEleven(){
        double celsius, farenheit;
        System.out.printf("%s %10s \n", "C", "F");
        System.out.println("---------------");
        for(int i = 1; i <= 20; i++){
            celsius = i;
            farenheit = ((double) 9 / 5) * i + 32;
            System.out.printf("%.2f %10.2f \n", celsius, farenheit);
        }
    }
    
    public static void exerciseTwelve(){
        int stores = 5;
        double store1, store2, store3, store4, store5;
        System.out.println("What were the sales for store 1?");
        store1 = s.nextDouble();
        System.out.println("What were the sales for store 2?");
        store2 = s.nextDouble();
        System.out.println("What were the sales for store 3?");
        store3 = s.nextDouble();
        System.out.println("What were the sales for store 4?");
        store4 = s.nextDouble();
        System.out.println("What were the sales for store 5?");
        store5 = s.nextDouble();
        
        System.out.println("SALES BAR CHART");
        System.out.print("Store 1: ");
        for(int i = 0; i < store1; i += 100){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Store 2: ");
        for(int i = 0; i < store2; i += 100){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Store 3: ");
        for(int i = 0; i < store3; i += 100){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Store 4: ");
        for(int i = 0; i < store4; i += 100){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Store 5: ");
        for(int i = 0; i < store5; i += 100){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void exerciseThirteen() throws FileNotFoundException{
        String path;
        System.out.println("Enter a file name:");
        path = s.nextLine();
        File file = new File(path);
        Scanner input = new Scanner(file);
        int line = 0;
        while(input.hasNextLine() && line < 5){
            System.out.println(input.nextLine());
            line++;
        }
        input.close();
    }
    
    public static void exerciseFourteen() throws FileNotFoundException{
        String path;
        System.out.println("Enter a file name: ");
        path = s.nextLine();
        File file = new File(path);
        Scanner input = new Scanner(file);
        int line = 1;
        while(input.hasNextLine()){
            System.out.println(line + ". " + input.nextLine());
            line++;
        }
        input.close();
    }
    
    public static void exerciseFifteen() throws FileNotFoundException{
        String ipath, opath;
        System.out.println("Enter the file you want to read from:");
        ipath = s.nextLine();
        System.out.println("Enter the file you want to write to:");
        opath = s.nextLine();
        File file = new File(ipath);
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(opath);
        while(input.hasNextLine()){
            String line = input.nextLine();
            line = line.toUpperCase();
            output.println(line);
        }
        input.close();
        output.close();
    }
    
    public static void exerciseSixteen(){
        double budget, expense, total = 0;
        System.out.println("Enter your budget for the month:");
        budget = s.nextDouble();
        System.out.println("Enter each of your expenses or -1 to finish");
        expense = s.nextDouble();
        total += expense;
        while(expense != -1){
            expense = s.nextDouble();
            if(expense != -1)
                total += expense;
        }
        if(budget > total){
            System.out.printf("You were $%,.2f under budget \n", (budget - total));
        } else {
            System.out.printf("You were $%,.2f over budget \n", (total - budget));
        }
    }
    
    public static void exerciseSeventeen(){
        int num, guess;
        num = r.nextInt(2000) - 1000;
        System.out.println("Guess a number between -1000 and 1000:");
        System.out.println("Enter -1 to quit");
        guess = s.nextInt();
        while(guess != num && guess != -1){
            if(guess > num){
                System.out.println("Too high, guess again:");
            } else {
                System.out.println("Too low, guess again:");
            }
            guess = s.nextInt();
        }
        if(guess == num)
            System.out.println("Congratulations the correct umber was " + num);
        else
            System.out.println("Quitter! the answer was " + num);
    }
    
    public static void exerciseEighteen(){
        int num, guess, guesses;
        guesses = 0;
        num = r.nextInt(2000) - 1000;
        System.out.println("Guess a number between -1000 and 1000:");
        System.out.println("Enter -1 to quit");
        guess = s.nextInt();
        guesses++;
        while(guess != num && guess != -1){
            if(guess > num){
                System.out.println("Too high, guess again:");
            } else {
                System.out.println("Too low, guess again:");
            }
            guess = s.nextInt();
            guesses++;
        }
        if(guess == num){
            System.out.println("Congratulations the correct number was " + num);
            System.out.println("It took you " + guesses + " guesses");
        } else {
            System.out.println("Quitter! the answer was " + num);
        }
    }
    
    public static void exerciseNineteen(){
        int num, correct = 0, incorrect = 0;
        String color, guess;
        for(int i = 0; i < 5; i++){
            num = r.nextInt(5) + 1;
            switch(num){
                case 1:
                    color = "Red";
                    break;
                case 2:
                    color = "Green";
                    break;
                case 3:
                    color = "Blue";
                    break;
                case 4:
                    color = "Orange";
                    break;
                case 5:
                    color = "Yellow";
                    break;
                default:
                    color = "Purple";      
            }
            System.out.println("Guess a color (Red, Green, Blue, Orange or Yellow)");
            guess = s.nextLine();
            if(guess.equals(color)){
                System.out.print("Correct! ");
                correct++;
            } else {
                System.out.print("Incorrect! ");
                incorrect++;
            }
            System.out.println("The color was " + color);
        }
        System.out.println("You got " + correct + " correct");
        System.out.println("You got " + incorrect + " incorrect");
    }
    
    public static void exerciseTwenty(){
        int length;
        System.out.println("Enter a number:");
        length = s.nextInt();
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    
    public static void exerciseTwentyOne(){
        int comScore = 0;
        int userScore = 0;
        for(int i = 0; i < 10; i++){
            int com = r.nextInt(6) + 1;
            int user = r.nextInt(6) + 1;
            if(com > user){
                comScore++;
            } else if(user > com){
                userScore++;
            }
        }
        if(comScore == userScore){
            System.out.println("You and the computer tied");
        } else if(comScore > userScore){
            System.out.println("You are the winner!");
        } else {
            System.out.println("You lost to the computer");
        }
    }
    
    public static void exerciseTwentyTwo(){
        double winnings = 0;
        double wagers = 0;
        boolean playAgain = true;
        do{
            System.out.println("How much money would you like to enter?");
            double wager = s.nextDouble();
            wagers += wager;
            winnings -= wager;
            String image, image1 = "", image2 = "", image3 = "";
            for(int i = 0; i < 3; i++){
                int num = r.nextInt(6);
                switch(num){
                    case 0:
                        image = "Cherries";
                        break;
                    case 1:
                        image = "Oranges";
                        break;
                    case 2:
                        image = "Plums";
                        break;
                    case 3:
                        image = "Bells";
                        break;
                    case 4:
                        image = "Melons";
                        break;
                    case 5:
                        image = "Bars";
                        break;
                    default:
                        image = "Error!";
                }
                switch (i) {
                    case 0:
                        image1 = image;
                        break;
                    case 1:
                        image2 = image;
                        break;
                    default:
                        image3 = image;
                        break;
                }
            }
            System.out.println(image1 + " " + image2 + " " + image3);
            if(!image1.equals(image2) && !image2.equals(image3) && !image1.equals(image3)){
                System.out.println("You won $0");
            } else if(image1.equals(image2) && image2.equals(image3)){
                wager = wager * 3;
                winnings += wager;
                System.out.println("You won $" + wager);
            } else if(image1.equals(image2) || image2.equals(image3) || image1.equals(image3)){
                wager = wager * 2;
                winnings += wager;
                System.out.println("You won $" + wager);
            }
            System.out.println("Would you like to play again? (Y/N)");
            s.nextLine();
            char ans = s.nextLine().charAt(0);
            if(ans == 'y' || ans == 'Y'){
                playAgain = true;
            } else {
                playAgain = false;
            }
        }while(playAgain);
        System.out.println("You bet a total of $" + wagers);
        System.out.println("You won a total of $" + winnings);
    }
    
}
