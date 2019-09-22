/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg11.exercises;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class Chapter11Exercises {
    
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
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void exerciseOne(){
        int[] scores = {78, 45, 65, 88, 125, -3};
        TestScores ts = new TestScores(scores);
        try{
            double average = ts.getAverage();
        } catch(IllegalArgumentException e){
            System.out.println("One of the test scores was negative or greater than 100");
        }
    }
    
    public static void exerciseTwo(){
        int[] scores = {78, 45, 65, 88, 125, -3};
        TestScores2 ts = new TestScores2(scores);
        try{
            double average = ts.getAverage();
        } catch(InvalidTestScore e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void exerciseThree(){
        try{
            RetailItem item = new RetailItem("An Item", -25, -100.00);
        } catch(InvalidPrice e){
            System.out.println(e.getMessage());
        } catch(InvalidUnitsOnHand e){
            System.out.println(e.getMessage());
        }
        try{
            RetailItem item = new RetailItem("An Item", -25, 100.00);
        } catch(InvalidPrice e){
            System.out.println(e.getMessage());
        } catch(InvalidUnitsOnHand e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void exerciseFour(){
        try{
            Month m1 = new Month();
            Month m2 = new Month("NotaMonth");
            m1.setMonth(18);
            boolean equalTo = m1.equals(m2);
            boolean greaterThan = m1.greaterThan(m2);
            boolean lessThan = m1.lessThan(m2);
            System.out.println(equalTo);
            System.out.println(greaterThan);
            System.out.println(lessThan);
            System.out.println(m1 + ", " + m2);
        }catch(InvalidMonth e){
            System.out.println(e.getMessage());
        }catch(InvalidMonthNumber e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void exerciseFive(){
        PayRoll pr;
        try{
            pr = new PayRoll("John Doe", 243);
            double grossPay;
            System.out.println("Enter the employees hourly pay rate:");
            pr.setHourlyPayRate(s.nextDouble());
            System.out.println("Enter the number of hours the employee worked:");
            pr.setHoursWorked(s.nextInt());
            grossPay = pr.getGrossPay();
            System.out.printf("The employees gross pay is $%,.2f \n", grossPay);
        } catch(EmptyString e){
            System.out.println(e.getMessage());
        } catch(InvalidEmployeeID e){
            System.out.println(e.getMessage());
        } catch(InvalidHoursWorked e){
            System.out.println(e.getMessage());
        } catch(InvalidHourlyPayrate e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void exerciseSix(){
        String filename = "BinaryNums.dat";
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums2 = new int[8];
        try{
            FileArray.writeArray(filename, nums);
            FileArray.readArray(filename, nums2);
        }catch(FileNotFoundException e){
            System.out.println("The specified file could not be found");
        }catch(IOException e){
            System.out.println("An error happened reading/writine the file");
        }
        for(int i = 0; i < nums2.length; i++){
            System.out.print(nums2[i] + ", ");
        }
    }
    
    public static void exerciseSeven(){
        String data = "As for me, I am tormented with an everlasting itch for things remote. I love to sail forbidden seas, and land on barbarous coasts.";
        String file1, file2;
        file1 = "unencrypted.dat";
        file2 = "encrypted.dat";
        try{
            FileOutputStream ostream = new FileOutputStream(file1);
            DataOutputStream output = new DataOutputStream(ostream);
            for(int i = 0; i < data.length(); i++){
                output.writeChar(data.charAt(i));
            }
        }catch(Exception e){
            System.out.println("Something went wrong creating the original file");
        }
        try{
            FileEncryptor.EncryptFile(file1, file2);
        } catch(Exception e){
            System.out.println("Something went wrong encrypting to the new file");
        }
    }
    
    public static void exerciseEight(){
        String file = "encrypted.dat";
        try{
            FileEncryptor.DecryptFile(file);
        }catch(Exception e){
            System.out.println("Error decrypting data");
        }
    }
    
    public static void exerciseNine() throws FileNotFoundException, IOException, ClassNotFoundException{
        String filename = "testscores.dat";
        Random r = new Random();
        ArrayList<TestScores> scores = new ArrayList<TestScores>();
        for(int i = 0; i < 6; i++){
            int[] nums = {r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1};
            TestScores grade = new TestScores(nums);
            scores.add(grade);
        }
        // serialize
        FileOutputStream ostream = new FileOutputStream(filename);
        ObjectOutputStream output = new ObjectOutputStream(ostream);
        for(int i = 0; i < scores.size(); i++){
            output.writeObject(scores.get(i));
        }
        // deserialize
        ArrayList<TestScores> inputs = new ArrayList<TestScores>();
        FileInputStream istream = new FileInputStream(filename);
        ObjectInputStream input = new ObjectInputStream(istream);
        boolean end = false;
        while(!end){
            try{
                inputs.add((TestScores) input.readObject());
            } catch(EOFException e){
                end = true;
            }
        }
        for(int i = 0; i < inputs.size(); i++){
            System.out.println(inputs.get(i).getAverage());
        }
    }
    
    public static void exerciseTen(){
        try{
            ProductionWorker worker = new ProductionWorker("John", "6dh4g", "12/22/87", 2, 21.30);
            System.out.println("Shift: " + worker.getShift() + ", EmpNum: " + worker.getEmployeeNumber());
            worker.setShift(1);
            worker.setEmployeeNumber("635-B");
            System.out.println("Shift: " + worker.getShift() + ", EmpNum: " + worker.getEmployeeNumber());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
