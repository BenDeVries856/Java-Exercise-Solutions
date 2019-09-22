/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg10.exercises;

import java.util.ArrayList;

/**
 *
 * @author ben_d
 */
public class Chapter10Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
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
            System.out.println("Error!");
        }
    }
    
    public static void exerciseOne(){
        ProductionWorker worker = new ProductionWorker("John", "143-A", "12/22/87", 2, 21.30);
        System.out.println("Shift: " + worker.getShift() + ", EmpNum: " + worker.getEmployeeNumber());
        worker.setShift(1);
        worker.setEmployeeNumber("635-B");
        System.out.println("Shift: " + worker.getShift() + ", EmpNum: " + worker.getEmployeeNumber());
    }
    
    public static void exerciseTwo(){
        ShiftSupervisor worker = new ShiftSupervisor("John", "143-A", "12/22/87", 86500, 2034.34);
        System.out.println("Bonus: " + worker.getBonus() + ", EmpNum: " + worker.getEmployeeNumber());
        worker.setBonus(1234.56);
        worker.setEmployeeNumber("635-B");
        System.out.println("Bonus: " + worker.getBonus() + ", EmpNum: " + worker.getEmployeeNumber());
    }
    
    public static void exerciseThree(){
        TeamLeader leader = new TeamLeader("Jim", "foiodd", "12/22/78", 6, 24.60, 156.76, 24, 16);
        System.out.println("Number: " + leader.getEmployeeNumber() + ", Shift: " + leader.getShift() + ", Monthly Bonus: " + leader.getMonthlyBonus());
        leader.setEmployeeNumber("354-N");
        leader.setShift(2);
        leader.setMonthlyBonus(365.43);
        System.out.println("Number: " + leader.getEmployeeNumber() + ", Shift: " + leader.getShift() + ", Monthly Bonus: " + leader.getMonthlyBonus());
    }
    
    public static void exerciseFour(){
        Essay essay = new Essay();
        System.out.println("Grade: " + essay.getGrade());
        essay.setGrammar(26);
        essay.setSpelling(19);
        essay.setLength(20);
        essay.setContent(20);
        System.out.println("Grade: " + essay.getGrade());
        essay.setScore(99);
        System.out.println("Grade: " + essay.getGrade());
    }
    
    public static void exerciseFive(){
        CoursesGraded course = new CoursesGraded();
        GradedActivity lab = new GradedActivity();
        lab.setScore(87);
        PassFailExam pfexam = new PassFailExam(10, 2, 70);
        Essay essay = new Essay(26, 19, 20, 20);
        FinalExam fexam = new FinalExam(50, 4);
        course.setLab(lab);
        course.setPassFailExam(pfexam);
        course.setEssay(essay);
        course.setFinalExam(fexam);
        System.out.println(course.toString());
    }
    
    public static void exerciseSix(){
        CoursesGraded course = new CoursesGraded();
        GradedActivity lab = new GradedActivity();
        lab.setScore(87);
        PassFailExam pfexam = new PassFailExam(10, 2, 70);
        Essay essay = new Essay(26, 19, 20, 20);
        FinalExam fexam = new FinalExam(50, 4);
        course.setLab(lab);
        course.setPassFailExam(pfexam);
        course.setEssay(essay);
        course.setFinalExam(fexam);
        System.out.println("Average: " + course.getAverage());
        System.out.println("Highest: " + course.getHighest().toString());
        System.out.println(" Lowest: " + course.getLowest().toString());
    }
    
    public static void exerciseSeven(){
        Customer cust = new Customer("Jane Doe", 12345);
        System.out.println("Customer Name: " + cust.getName() + ", On Mailing List: " + cust.isOnMailingList());
        cust.addToMailingList();
        System.out.println("Customer Name: " + cust.getName() + ", On Mailing List: " + cust.isOnMailingList());
        cust.removeFromMailingList();
        System.out.println("Customer Name: " + cust.getName() + ", On Mailing List: " + cust.isOnMailingList());
    }
    
    public static void exerciseEight(){
        PreferredCustomer cust = new PreferredCustomer("BOb boi", 98765);
        System.out.println("Total Spent: " + cust.getTotal() + ", Discount: " + cust.getDiscount());
        cust.makePurchase("Drumset", 850.00);
        System.out.println("Total Spent: " + cust.getTotal() + ", Discount: " + cust.getDiscount());
        cust.makePurchase("Blender", 250.00);
        System.out.println("Total Spent: " + cust.getTotal() + ", Discount: " + cust.getDiscount());
        cust.makePurchase("Dirt Bike", 8000.00);
        System.out.println("Total Spent: " + cust.getTotal() + ", Discount: " + cust.getDiscount());
    }
    
    public static void exerciseNine(){
        SavingsAccount account = new SavingsAccount(75.00, 0.06);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(25.00);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(5.25);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(15.25);
        System.out.println("Balance: " + account.getBalance());
        account.monthlyProcess();
        account.withdraw(25.00);
        System.out.println("Balance: " + account.getBalance());
        account.withdrawRemaining();
        System.out.println("Balance: " + account.getBalance());
    }
    
    public static void exerciseTen(){
        ArrayList<Ship> ships = new ArrayList<Ship>();
        ships.add(new Ship("Blue Schooner", "1955"));
        ships.add(new CargoShip("Black Pearl", "1767", 2400));
        ships.add(new CruiseShip("Titanic", "1967", 5000));
        ships.add(new CruiseShip("Oasis of the Seas", "2005", 12000));
        ships.add(new Ship("La Vegabonde", "1989"));
        for(int i = 0; i < ships.size(); i++){
            System.out.println(ships.get(i).toString());
        }
    }
    
}
