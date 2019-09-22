
package chapter.pkg3.exercises;

import java.util.Scanner;


public class Chapter3Exercises {

    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise5();
        // exercise6();
        // exercise7();
        // exercise8();
        // exercise9();
        // exercise10();
        // exercise11();
        // exercise12();
        // exercise13();
        // exercise14();
        // exercise15();
         exercise16();
    }
    
    public static void exercise1(){
        int num;
        System.out.println("Enter a number you want in roman numerals");
        num = s.nextInt();
        switch(num){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Enter a number between 1-10");              
        }
    }
    
    public static void exercise2(){
        int day, month, year;
        System.out.println("Enter a month, day, and year in numeric two digit form:");
        month = s.nextInt();
        day = s.nextInt();
        year = s.nextInt();
        if(day * month == year){
            System.out.println("This is a magic number");
        } else {
            System.out.println("This is not a magic number");
        }
    }
    
    public static void exercise3(){
        double weight, height, bmi;
        System.out.println("Enter your weight in lbs");
        weight = s.nextDouble();
        System.out.println("Enter your height in inches");
        height = s.nextDouble();
        bmi = weight * 703 / (height * height);
        if(bmi <= 18.5){
            System.out.println("You are underweight");
        } else if(bmi < 25){
            System.out.println("Your BMI is optimal");
        } else {
            System.out.println("You are overweight");
        }
        System.out.println("Your BMI is: " + bmi);
    }
    
    public static void exercise4(){
        int fscore, sscore, tscore;
        double average;
        System.out.println("Enter 3 test scores on different lines");
        fscore = s.nextInt();
        sscore = s.nextInt();
        tscore = s.nextInt();
        average = (double) (fscore + sscore + tscore) / 3;
        System.out.printf("Your average is %.2f \n", average);
        if(average < 60){
            System.out.println("Your letter grade is : F");
        } else if(average < 70){
            System.out.println("Your letter grade is : D");
        } else if(average < 80){
            System.out.println("Your letter grade is : C");
        } else if(average < 90){
            System.out.println("Your letter grade is : B");
        } else if(average <= 100){
            System.out.println("Your letter grade is : A");
        } else {
            System.out.println("Next time enter in valid grades you twat");
        }
    }
    
    public static void exercise5(){
        double weight, mass;
        System.out.println("Enter an objects mass in KG");
        mass = s.nextDouble();
        weight = mass * 9.8;
        if(weight > 1000){
            System.out.println("This object is too heavy");
        } else if(weight < 10){
            System.out.println("This object is too light");
        }
        System.out.println("The objects weight is " + weight + " Newtons");
    }
    
    public static void exercise6(){
        int seconds;
        System.out.println("Enter a number of seconds");
        seconds = s.nextInt();
        if(seconds >= 86400){
            int days = seconds / 86400;
            System.out.println(days + " days");
        } else if(seconds >= 3600){
            int hours = seconds / 3600;
            System.out.println(hours + " hours");
        } else if(seconds >= 60){
            int minutes = seconds / 60;
            System.out.println(minutes + " minutes");
        } else {
            System.out.println(seconds + " seconds");
        }
    }
    
    public static void exercise7(){
        String fname, sname, tname;
        System.out.println("Enter three different names: ");
        fname = s.nextLine();
        sname = s.nextLine();
        tname = s.nextLine();
        if(fname.compareTo(sname) < 0 && fname.compareTo(tname) < 0){
            // fname is greatest
            if(sname.compareTo(tname) < 0){
                // fname sname tname
                System.out.printf(" %s \n %s \n %s \n", fname, sname, tname);
            } else {
                // fname tname sname
                System.out.printf(" %s \n %s \n %s \n", fname, tname, sname);
            }
        }else if(sname.compareTo(fname) < 0 && sname.compareTo(tname) < 0){
            // sname is greatest
            if(fname.compareTo(tname) < 0){
                // sname fname tname
                System.out.printf(" %s \n %s \n %s \n", sname, fname, tname);
            } else {
                // sname tname fname
                System.out.printf(" %s \n %s \n %s \n", sname, tname, fname);
            }
        }else if(tname.compareTo(fname) < 0 && tname.compareTo(sname) < 0){
            // tname is greatest
            if(fname.compareTo(sname) < 0){
                // tname fname sname 
                System.out.printf(" %s \n %s \n %s \n", tname, fname, sname);
            } else {
                // tname sname fname
                System.out.printf(" %s \n %s \n %s \n", tname, sname, fname);
            }
        } else {
            System.out.println("The three names must be distinct");
        }
    }
    
    public static void exercise8(){
        int quantity;
        double discount = 0;
        double total = 99.0;
        System.out.println("How many software packages where purchased");
        quantity = s.nextInt();
        if(quantity >= 100){
            discount = total * quantity * 0.5;
        } else if(quantity >= 50){
            discount = total * quantity * 0.4;
        } else if(quantity >= 20){
            discount = total * quantity * 0.3;
        } else if(quantity >= 10){
            discount = total * quantity * 0.2;
        }
        total = total * quantity;
        System.out.printf("Before Discount: %,.2f \n", total);
        System.out.printf("       Discount: %,.2f \n", discount);
        System.out.printf("          Total: %,.2f \n", total - discount);
    }
    
    public static void exercise9(){
        int weight, distance;
        double charge;
        System.out.println("What is the package weight in lbs?");
        weight = s.nextInt();
        System.out.println("How many miles is it being shipped?");
        distance = s.nextInt();
        if(weight <= 2){
            charge = 1.1;
        } else if(weight <= 6){
            charge = 2.2;
        } else if(weight <= 10){
            charge = 3.7;
        } else {
            charge = 3.8;
        }
        charge = charge * (double)(1 + (int)(distance / 500));
        System.out.printf("The shipping cost will be $%,.2f", charge);
    }
    
    public static void exercise10(){
        double calories, fat, fatCals, fatPercent;
        System.out.println("How many calories where consumed?");
        calories = s.nextDouble();
        System.out.println("How many grams of fat where consumed?");
        fat = s.nextDouble();
        fatCals = fat * 9;
        if(fatCals > calories){
            System.out.println("That not possible");
        } else {
            fatPercent = fatCals / calories * 100;
            System.out.println(fatPercent + " % of calories where from fat");
            if(fatPercent <= 30){
                System.out.println("This food item is low in fat");
            }
        }
    }
    
    public static void exercise11(){
        String fname, sname, tname;
        double ftime, stime, ttime;
        System.out.println("Enter the name of runner 1 and their time:");
        fname = s.nextLine();
        ftime = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the name of runner 2 and their time:");
        sname = s.nextLine();
        stime = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the name of runner 3 and their time:");
        tname = s.nextLine();
        ttime = s.nextDouble();
        if(ftime < stime && ftime < ttime){
            if(stime < ttime){
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", fname, ftime, sname, stime, tname, ttime);
            } else {
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", fname, ftime, tname, ttime, sname, stime);
            }
        } else if(stime < ftime && stime < ttime){
            if(ftime < ttime){
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", sname, stime, fname, ftime, tname, ttime);
            } else {
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", sname, stime, tname, ttime, fname, ftime);
            }
        } else if(ttime < ftime && ttime < stime){
            if(ftime < stime){
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", tname, ttime, fname, ftime, sname, stime);
            } else {
                System.out.printf("%s: %f \n %s: %f \n %s: %f ", tname, ttime, sname, stime, fname, ftime);
            }
        }
    }
    
    public static void exercise12(){
        int distance;
        String medium;
        double time;
        System.out.println("What is the sound moving through?");
        medium = s.nextLine();
        System.out.println("How many feet is the sound travelling?");
        distance = s.nextInt();
        if(medium.equalsIgnoreCase("air")){
            time = distance / 1100.0;
            System.out.println("Total Time " + time + "s");
        } else if(medium.equalsIgnoreCase("water")){
            time = distance / 4900.0;
            System.out.println("Total Time " + time + "s");
        } else if(medium.equalsIgnoreCase("steel")){
            time = distance / 16400.0;
            System.out.println("Total Time " + time + "s");
        } else {
            System.out.println("Not a valid medium");
        }
    }
    
    public static void exercise13(){
        char pack;
        int hours;
        double charge;
        System.out.println("What Service Package was purchased?");
        pack = s.nextLine().charAt(0);
        System.out.println("How many hours were used?");
        hours = s.nextInt();
        if(pack == 'a' || pack == 'A'){
            charge = 9.95;
            if(hours > 10){
                charge += (hours - 10) * 2;
            }
            System.out.printf("Total charge: %,.2f", charge);
        } else if(pack == 'b' || pack == 'B'){
            charge = 13.95;
            if(hours > 20){
                charge += (hours - 20);
            }
            System.out.printf("Total charge: %,.2f", charge);
        } else if(pack == 'c' || pack == 'C'){
            charge = 19.95;
            System.out.printf("Total charge: %,.2f", charge);
        } else {
            System.out.println("Not a valid package");
        }
    }
    
    public static void exercise14(){
        char pack;
        int hours;
        double chargeA, chargeB, chargeC;
        System.out.println("What Service Package was purchased?");
        pack = s.nextLine().charAt(0);
        System.out.println("How many hours were used?");
        hours = s.nextInt();
        // Charge A
        chargeA = 9.95;
        if(hours > 10){
            chargeA += (hours - 10) * 2;
        }
        // Charge B
        chargeB = 13.95;
        if(hours > 20){
            chargeB += (hours - 20);
        }
        // Charge C
        chargeC = 19.95;
        // display
        switch (pack){
            case 'a':
            case 'A':
                System.out.printf("Total charge: %,.2f \n", chargeA);
                System.out.printf("You would save %,.2f with Package B \n", chargeA - chargeB);
                System.out.printf("You would save %,.2f with Package C \n", chargeA - chargeC);
                break;
            case 'b':
            case 'B':
                System.out.printf("Total charge: %,.2f \n", chargeB);
                System.out.printf("You would save %,.2f with Package C \n", chargeB - chargeC);
                break;
            case 'c':
            case 'C':
                System.out.printf("Total charge: %,.2f \n", chargeC);
                break;
            default:
                System.out.println("Not a valid package");
        }
    }
    
    public static void exercise15(){
        final double INITIAL_CHARGE = 10;
        int numChecks;
        double charge;
        System.out.println("How many checks did you write this month?");
        numChecks = s.nextInt();
        if(numChecks < 20){
            charge = INITIAL_CHARGE + (numChecks * 0.10);
        } else if(numChecks < 40){
            charge = INITIAL_CHARGE + (numChecks * 0.08);
        } else if(numChecks < 60){
            charge = INITIAL_CHARGE + (numChecks * 0.06);
        } else {
            charge = INITIAL_CHARGE + (numChecks * 0.04);
        }
        System.out.printf("The service fees are: $%,.2f \n", charge);
    }
    
    public static void exercise16(){
        int numBooks, points;
        System.out.println("How many books where purchased this month?");
        numBooks = s.nextInt();
        switch(numBooks){
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                points = 60;
        }
        System.out.printf("You eanred %d points this month. \n", points);
    }
    
}
