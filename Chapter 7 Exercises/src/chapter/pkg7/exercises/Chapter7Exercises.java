/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter7Exercises {
    
    private static Scanner s = new Scanner(System.in);

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
        //exerciseEighteen();
        exerciseNineteen();
    }
    
    public static void exerciseOne(){
        System.out.println("Enter the rainfall for each month of the year:");
        double[] rain = new double[12];
        for(int i = 0; i < 12; i++){
            rain[i] = s.nextDouble();
        }
        RainFall rf = new RainFall(rain);
        System.out.println("           Total Rainfall: " + rf.totalRainfall());
        System.out.println("         Average Rainfall: " + rf.averageRainfall());
        System.out.println("Month with least Rainfall: " + rf.leastRainfall());
        System.out.println(" Month with most Rainfall: " + rf.greatestRainfall());
    }
    
    public static void exerciseTwo(){
        Payroll pr = new Payroll();
        int[] ids = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        pr.setEmployeeId(ids);
        int[] hours = new int[7];
        double[] pay = new double[7];
        for(int i = 0; i < ids.length; i++){
            System.out.println("Enter the hours and payrate for employee " + (i + 1));
            hours[i] = s.nextInt();
            pay[i] = s.nextDouble();
        }
        pr.setHours(hours);
        pr.setPayRate(pay);
        pr.calculateGrossPay();
        pr.displayGrossPay();
    }
    
    public static void exerciseThree(){
        ChargeAccount account = new ChargeAccount();
        System.out.println("Enter an account number");
        if(account.isValidAccountNumber(s.nextInt())){
            System.out.println("Valid Account");
        } else {
            System.out.println("Not a Valid Account");
        }
    }
    
    public static void exerciseFour(){
        ChargeAccount account = new ChargeAccount();
        System.out.println("Enter an account number");
        if(account.isValidAccountNumber(s.nextInt())){
            System.out.println("Valid Account");
        } else {
            System.out.println("Not a Valid Account");
        }
    }
    
    public static void displayBiggerThan(int[] nums, int compare){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > compare){
                System.out.println(nums[i]);
            }
        }
    }
    //
    public static void exerciseFive(){
        int[] nums = {12, 45, 2, 67, 34, 100, 34, 5, 24, 67, 20, 94};
        displayBiggerThan(nums, 60);
    }
    
    public static void exerciseSix(){
        char[] answers = new char[20];
        System.out.println("Enter the answers for the 20 questions (A, B, C, or D):");
        for(int i = 0; i < 20; i++){
            char a = s.nextLine().charAt(0);
            while(a != 'A' && a != 'B' && a != 'C' && a != 'D'){
                System.out.println("Enter A, B, C, or D");
                a = s.nextLine().charAt(0);
            }
            answers[i] = a;
        }
        DriversTest test = new DriversTest(answers);
        System.out.println("Passed:");
        System.out.println("\t" + test.passed());
        System.out.println("Correct:");
        System.out.println("\t" + test.totalCorrect());
        System.out.println("Incorrect:");
        System.out.println("\t" + test.totalIncorrect());
        System.out.println("Questions Missed:");
        int[] wrong = test.questionsMissed();
        for(int i = 0; i < wrong.length; i++){
            System.out.println("\t" + wrong[i]);
        }
    }
    
    public static void exerciseSeven(){
        double[][] quarterlySales = new double[6][4];
        for(int i = 0; i < 6; i++){
            System.out.println("Enter the 4 quarterly sales figures for division " + (i + 1));
            for(int j = 0; j < 4; j++){
                quarterlySales[i][j] = s.nextDouble();
            }
        }
        // list sales figures by division
        for(int i = 0; i < quarterlySales.length; i++){
            System.out.println("Sales for division " + (i + 1));
            for(int j = 0; j < quarterlySales[i].length; j++){
                System.out.printf("\t $%,.2f \n", quarterlySales[i][j]);
            }
        }
        // increase/decrease from last quarter
        for(int i = 0; i < quarterlySales.length; i++){
            System.out.println("Change for division " + (i + 1));
            for(int j = 1; j < quarterlySales[i].length; j++){
                double change = quarterlySales[i][j] - quarterlySales[i][j-1];
                System.out.printf("\t $%,.2f \n", change);
            }
        }
        // sales totals
        for(int i = 0; i < quarterlySales.length; i++){
            double total = 0;
            for(int j = 0; j < quarterlySales[i].length; j++){
                total += quarterlySales[i][j];
            }
            System.out.printf("Total for division %d, $%,.2f \n", i + 1, total);
        }
        // total increase/decrease from previous quarter
        double companyQuarters[] = new double[4];
        for(int j = 0; j < quarterlySales[0].length; j++){
            double total = 0;
            for(int i = 0; i < quarterlySales.length; i++){
                total += quarterlySales[i][j];
            }
            companyQuarters[j] = total;
        }
        for(int i = 1; i < companyQuarters.length; i++){
            double change = companyQuarters[i] - companyQuarters[i-1];
            System.out.printf("Company wide change for quarter %d: $%,.2f \n", i+1, change);
        }
        // average sales per quarter
        for(int i = 0; i < companyQuarters.length; i++){
            double average = companyQuarters[i] / 6.0;
            System.out.printf("Company wide average for quarter %d: $%,.2f \n", i+1, average);
        }
        // highest sales per quarter
        for(int j = 0; j < quarterlySales[0].length; j++){
            int highest = 0;
            double sales = 0.0;
            for(int i = 0; i < quarterlySales.length; i++){
                if(quarterlySales[i][j] > sales){
                    highest = i;
                    sales = quarterlySales[i][j];
                }
            }
            System.out.printf("Highest Sales for quarter %d: division %d \n", j+1, highest+1);
        }
    }
    
    public static void exerciseEight(){
        ArrayList<String> names = new ArrayList<String>(5);
        double[][] grades = new double[5][4];
        System.out.println("Enter the names and scores for 5 students");
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the name for student " + (i+1));
            names.add(s.nextLine());
            System.out.println("Enter the 4 test scores for " + names.get(i));
            for(int j = 0; j < 4; j++){
                grades[i][j] = s.nextDouble();
                while(grades[i][j] < 0 || grades[i][j] > 100){
                    System.out.println("Not a valid test score");
                    grades[i][j] = s.nextDouble();
                }
            }
            s.nextLine();
        }
        GradeBook gb = new GradeBook(names, grades);
        for(int i = 0; i < 5; i++){
            gb.getGrades(i);
        }
    }
    
    public static void exerciseNine(){
        ArrayList<String> names = new ArrayList<String>(5);
        double[][] grades = new double[5][4];
        System.out.println("Enter the names and scores for 5 students");
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the name for student " + (i+1));
            names.add(s.nextLine());
            System.out.println("Enter the 4 test scores for " + names.get(i));
            for(int j = 0; j < 4; j++){
                grades[i][j] = s.nextDouble();
                while(grades[i][j] < 0 || grades[i][j] > 100){
                    System.out.println("Not a valid test score");
                    grades[i][j] = s.nextDouble();
                }
            }
            s.nextLine();
        }
        GradeBookModified gb = new GradeBookModified(names, grades);
        for(int i = 0; i < 5; i++){
            gb.getGrades(i);
        }
    }
    
    public static void exerciseTen(){
        Lottery lottery = new Lottery();
        System.out.println("Enter five lottery numbers");
        int[] picks = new int[5];
        for(int i = 0; i < picks.length; i++){
            picks[i] = s.nextInt();
        }
        int matches = lottery.compareNumbers(picks);
        System.out.println(matches + " of your numbers are winning numbers");
        if(matches == 5){
            System.out.println("Congratulations! you win the grand prize");
        }
        int[] correct = lottery.getWinningNumbers();
        System.out.print("Winnings numbers: ");
        for(int i = 0; i < correct.length; i++){
            System.out.print(" " + correct[i]);
        }
        System.out.println("");
    }
    
    public static int getTotal(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }
        return total;
    }
    //
    public static double getAverage(int[] a){
        double total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }
        return total / (double) a.length;
    }
    //
    public static int getHighest(int[] a){
        int highest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > highest){
                highest = a[i];
            }
        }
        return highest;
    }
    //
    public static int getLowest(int[] a){
        int lowest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < lowest){
                lowest = a[i];
            }
        }
        return lowest;
    }
    //
    public static void exerciseEleven(){
        int[] testData = {1, 4, 2, 6, 4, 7, 8};
        System.out.println("  Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Highest: " + getHighest(testData));
        System.out.println(" Lowest: " + getLowest(testData));
    }
    
    public static void exerciseTwelve(){
        NumberAnalysis nums = new NumberAnalysis("validaccounts.txt");
        System.out.println("  Total: " + nums.getTotal());
        System.out.println("Average: " + nums.getAverage());
        System.out.println("Highest: " + nums.getHighest());
        System.out.println(" Lowest: " + nums.getLowest());
    }
    
    public static void exerciseThirteen(){
        ArrayList<String> girls = new ArrayList<String>();
        ArrayList<String> boys = new ArrayList<String>();
        File gfile = new File("GirlNames.txt");
        File bfile = new File("BoyNames.txt");
        try{
            Scanner input = new Scanner(gfile);
            while(input.hasNext()){
                girls.add(input.nextLine());
            }
            input = new Scanner(bfile);
            while(input.hasNext()){
                boys.add(input.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File Error");
        }
        System.out.println("Enter a name to see if it is one of the 200 most popular names, or enter quit to quit");
        String line = s.nextLine();
        while(!line.equals("quit")){
            boolean inNames = false;
            for(int i = 0; i < girls.size(); i++){
                if(line.equals(girls.get(i))){
                    inNames = true;
                }
            }
            for(int i = 0; i < boys.size(); i++){
                if(line.equals(boys.get(i))){
                    inNames = true;
                }
            }
            if(inNames){
                System.out.println("It is one of the 200 most popular");
            } else {
                System.out.println("It is not one of the 200 most popular");
            }
            line = s.nextLine();
        }
    }
    
    public static void exerciseFourteen(){
        int[] populations = new int[41];
        File file = new File("USPopulation.txt");
        try{
            Scanner input = new Scanner(file);
            int index = 0;
            while(input.hasNext()){
                populations[index] = input.nextInt();
                index++;
            }
        } catch(FileNotFoundException e){
            System.out.println("File Error");
        }
        double totalChange = 0;
        int highest = populations[0];
        int lowest = populations[0];
        int lowestYear = 0;
        int highestYear = 0;
        for(int i = 1; i < populations.length; i++){
            totalChange += populations[i] - populations[i-1];
            if(populations[i] > highest){
                highest = populations[i];
                highestYear = i;
            }
            if(populations[i] < lowest){
                lowest = populations[i];
                lowestYear = i;
            }
        }
        highestYear += 1950;
        lowestYear += 1950;
        double average = totalChange / (double) populations.length - 1;
        System.out.println("Average Change in Population: " + average);
        System.out.println("  Year of Highest Population: " + highestYear);
        System.out.println("   Year of Lowest Population: " + lowestYear);
    }
    
    public static void exerciseFifteen(){
        ArrayList<String> winners = new ArrayList<String>();
        File file = new File("WorldSeriesWinners.txt");
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                winners.add(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Error");
        }
        System.out.println("Enter a World Series Team");
        String team = s.nextLine();
        int wins = 0;
        for(int i = 0; i < winners.size(); i++){
            if(winners.get(i).equals(team)){
                wins++;
            }
        }
        System.out.println("That team has won " + wins + " times");
    }
    
    public static void exerciseSixteen(){
        int[][] testData = {{1,2,3},
                            {4,3,2},
                            {6,4,5},
                            {8,7,1},
                            {5,3,8}};
        System.out.println("Total: " + TwoDimensionalArray.getTotal(testData));
        System.out.println("Average: " + TwoDimensionalArray.getAverage(testData));
        System.out.println("Row Total for 3rd row: " + TwoDimensionalArray.getRowTotal(testData, 2));
        System.out.println("Column Total for 2nd column: " + TwoDimensionalArray.getColumnTotal(testData, 1));
        System.out.println("Highest in row 1: " + TwoDimensionalArray.getHighestInRow(testData, 0));
        System.out.println("Lowest in row 4: " + TwoDimensionalArray.getLowestInRow(testData, 3));
    }
    
    public static void exerciseSeventeen(){
        ArrayList<PhoneBookEntry> contacts = new ArrayList<>();
        contacts.add(new PhoneBookEntry("JP", "(519)-280-7584"));
        contacts.add(new PhoneBookEntry("Sue", "(519)-280-9573"));
        contacts.add(new PhoneBookEntry("Jim", "(519)-280-0582"));
        contacts.add(new PhoneBookEntry("Betsy", "(519)-280-7583"));
        contacts.add(new PhoneBookEntry("Monsuer", "(519)-280-9274"));
        for(int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i).getName() + ": " + contacts.get(i).getPhoneNumber());
        }
    }
    
    public static void exerciseEighteen(){
        Question[] questions = new Question[10];
        questions[0] = new Question("What is the capital of Portugal?",
                                    "Madrid",
                                    "Lisbon",
                                    "Porto",
                                    "Rome",
                                    'B');
        questions[1] = new Question("What is the capital of Iran?",
                                    "Damascus",
                                    "Tehran",
                                    "Bahgdad",
                                    "Baku",
                                    'B');
        questions[2] = new Question("What continent is Laos in?",
                                    "South America",
                                    "Africa",
                                    "Asia",
                                    "Europe",
                                    'C');
        questions[3] = new Question("What is the largest country in the world?",
                                    "Russia",
                                    "United States",
                                    "China",
                                    "Canada",
                                    'A');
        questions[4] = new Question("What is the smallest country in the world?",
                                    "Morocco",
                                    "Liechtenstein",
                                    "Vatican",
                                    "Tuvalu",
                                    'C');
        questions[5] = new Question("What is the capital of Zambia?",
                                    "Lilongwe",
                                    "Harare",
                                    "Lusaka",
                                    "Gabarone",
                                    'C');
        questions[6] = new Question("What continent is Angola in?",
                                    "South America",
                                    "Africa",
                                    "Asia",
                                    "Europe",
                                    'B');
        questions[7] = new Question("What is the capital of Chille?",
                                    "Rosario",
                                    "Falkland",
                                    "Calama",
                                    "Santiago",
                                    'D');
        questions[8] = new Question("What continent is Serbia in?",
                                    "South America",
                                    "Africa",
                                    "Asia",
                                    "Europe",
                                    'D');
        questions[9] = new Question("What is the southern most country in Africa?",
                                    "South Africa",
                                    "Madagascar",
                                    "Somalia",
                                    "Botswana",
                                    'A');
        int playerOne = 0, playerTwo = 0;
        for(int i = 0; i < questions.length; i++){
            if(i % 2 == 0){
                System.out.println("Player 1:");
            } else {
                System.out.println("Player 2:");
            }
            System.out.println(questions[i].getQuestion());
            System.out.println("A: " + questions[i].getAnswer('a'));
            System.out.println("B: " + questions[i].getAnswer('b'));
            System.out.println("C: " + questions[i].getAnswer('c'));
            System.out.println("D: " + questions[i].getAnswer('d'));
            System.out.println("Enter the correct answer:");
            char answer = Character.toUpperCase(s.nextLine().charAt(0));
            if(answer == Character.toUpperCase(questions[i].getCorrect())){
                System.out.println("Correct");
                if(i % 2 == 0){
                    playerOne++;
                } else {
                    playerTwo++;
                }
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("Player One score: " + playerOne);
        System.out.println("Player Two score: " + playerTwo);
        if(playerOne == playerTwo){
            System.out.println("You tied.");
        } else if(playerOne > playerTwo){
            System.out.println("Player One Won!");
        } else{
            System.out.println("Player Two Won!");
        }
    }
    
    public static boolean isLoShuMagicSquare(int[][] square){
        boolean isMagic = true;
        for(int i = 0; i < square.length; i++){
            int total = 0;
            for(int j = 0; j < square[i].length; j++){
                total += square[i][j];
            }
            if(total != 15) isMagic = false;
        }
        for(int i = 0; i < square[0].length; i++){
            int total = 0;
            for(int j = 0; j < square.length; j++){
                total += square[i][j];
            }
            if(total != 15) isMagic = false;
        }
        int total = 0;
        for(int i = 0; i < square.length; i++){
            total += square[i][i];
        }
        if(total != 15) isMagic = false;
        return isMagic;
    }
    public static void exerciseNineteen(){
        int[][] magicSquare = {{4,9,2},
                               {3,5,7},
                               {8,1,6}};
        int[][] nonMagicSquare = {{6,8,5},
                                  {7,1,4},
                                  {9,2,3}};
        System.out.println("Square one: " + isLoShuMagicSquare(magicSquare));
        System.out.println("Square two: " + isLoShuMagicSquare(nonMagicSquare));
    }
    
    
    
}
