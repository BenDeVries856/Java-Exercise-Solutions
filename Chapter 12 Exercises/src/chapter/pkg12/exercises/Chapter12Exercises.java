/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg12.exercises;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ben_d
 */
public class Chapter12Exercises {

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
            System.out.println("Error!");
        }
    }
    
    public static void exerciseOne(){
        new RetailCalculator();
    }
    
    public static void exerciseTwo(){
        new MonthlyTax();
    }
    
    public static void exerciseThree(){
        new PropertyTax();
    }
    
    public static void exerciseFour(){
        new TravelExpenses();
    }
    
    public static void exerciseFive(){
        new TheaterRevenue();
    }
    
    public static void exerciseSix(){
        new JoesAutomotive();
    }
    
    public static void exerciseSeven(){
        new LongDistance();
    }
    
    public static void exerciseEight(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // componentes
        JButton sinister = new JButton("sinister");
        JButton dexter = new JButton("dexter");
        JButton medium = new JButton("center");
        JTextField result = new JTextField(10);
        result.setEditable(false);
        panel.add(sinister);
        panel.add(dexter);
        panel.add(medium);
        panel.add(result);
        sinister.addActionListener(e -> result.setText("left"));
        dexter.addActionListener(e -> result.setText("right"));
        medium.addActionListener(e -> result.setText("center"));
        //
        frame.setSize(350, 125);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseNine(){
        JFrame frame = new JFrame();
        frame.setSize(300,115);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        //components
        panel.add(new JLabel("Gallons:"));
        panel.add(new JLabel("Miles:"));
        JTextField txtGallons = new JTextField(10);
        JTextField txtMiles = new JTextField(10);
        JButton calculate = new JButton("Calculate");
        JTextField txtMPG = new JTextField(10);
        calculate.addActionListener(e -> {
            double gallons = Double.parseDouble(txtGallons.getText());
            double miles = Double.parseDouble(txtMiles.getText());
            txtMPG.setText(String.format("%.2f", miles / gallons));
        });
        txtMPG.setEditable(false);
        panel.add(txtGallons);
        panel.add(txtMiles);
        panel.add(calculate);
        panel.add(txtMPG);
        //
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void exerciseTen(){
        JFrame frame = new JFrame();
        frame.setSize(300, 75);
        JPanel panel = new JPanel();
        //
        JTextField txtCelsius = new JTextField(7);
        JButton btnConvert = new JButton("Convert");
        JTextField txtFar = new JTextField(7);
        txtFar.setEditable(false);
        btnConvert.addActionListener(e -> {
            double celsius = Double.parseDouble(txtCelsius.getText());
            txtFar.setText(String.format("%.2f", (9.0/5.0)*celsius+32));
        });
        panel.add(txtCelsius);
        panel.add(btnConvert);
        panel.add(txtFar);
        //
        frame.setTitle("Celsius to Farenheit");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
