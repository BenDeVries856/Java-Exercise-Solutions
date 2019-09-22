/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg12.exercises;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ben_d
 */
public class TravelExpenses extends JFrame {
    
    private final int TEXT_COLS = 10;
    
    private JPanel panel;
    private JButton btnCalculate;
    // first column
    private JTextField txtDays;
    private JTextField txtAirFare;
    private JTextField txtCarRental;
    private JTextField txtMilesDriven;
    private JTextField txtParkingFees;
    private JTextField txtTaxiCharges;
    private JTextField txtSeminarFees;
    private JTextField txtLodging;
    // second column
    private JTextField txtExpenses;
    private JTextField txtAllowable;
    private JTextField txtExcess;
    private JTextField txtSaved;
    
    public TravelExpenses(){
        setSize(500, 450);
        panel = new JPanel();
        attachComponents();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void attachComponents(){
        panel.setLayout(new GridLayout(16, 2));
        // row 1
        panel.add(new JLabel("Number of Days"));
        panel.add(new JLabel("Expenses Incurred"));
        // row 2
        txtDays = new JTextField(TEXT_COLS);
        panel.add(txtDays);
        txtExpenses = new JTextField(TEXT_COLS);
        txtExpenses.setEditable(false);
        panel.add(txtExpenses);
        // row 3
        panel.add(new JLabel("Airfare Amount"));
        panel.add(new JLabel("Allowable Expenses"));
        // row 4
        txtAirFare = new JTextField(TEXT_COLS);
        panel.add(txtAirFare);
        txtAllowable = new JTextField(TEXT_COLS);
        txtAllowable.setEditable(false);
        panel.add(txtAllowable);
        // row 5
        panel.add(new JLabel("Car Rental Fees"));
        panel.add(new JLabel("Excess Total"));
        // row 6
        txtCarRental = new JTextField(TEXT_COLS);
        panel.add(txtCarRental);
        txtExcess = new JTextField(TEXT_COLS);
        txtExcess.setEditable(false);
        panel.add(txtExcess);
        // row 7
        panel.add(new JLabel("Miles Driven"));
        panel.add(new JLabel("Amount Saved"));
        // row 8
        txtMilesDriven = new JTextField(TEXT_COLS);
        panel.add(txtMilesDriven);
        txtSaved = new JTextField(TEXT_COLS);
        txtSaved.setEditable(false);
        panel.add(txtSaved);
        // row 9
        panel.add(new JLabel("Parking Fees"));
        panel.add(new JLabel(""));
        // row 10
        txtParkingFees = new JTextField(TEXT_COLS);
        panel.add(txtParkingFees);
        panel.add(new JLabel(""));
        // row 11
        panel.add(new JLabel("Taxi Charges"));
        panel.add(new JLabel(""));
        // row 12
        txtTaxiCharges = new JTextField(TEXT_COLS);
        panel.add(txtTaxiCharges);
        panel.add(new JLabel(""));
        // row 13
        panel.add(new JLabel("Conference/Seminar Fees"));
        panel.add(new JLabel(""));
        // row 14
        txtSeminarFees = new JTextField(TEXT_COLS);
        panel.add(txtSeminarFees);
        panel.add(new JLabel(""));
        // row 15
        panel.add(new JLabel("Lodging Charges"));
        panel.add(new JLabel(""));
        // row 16
        txtLodging = new JTextField(TEXT_COLS);
        panel.add(txtLodging);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(e -> calculateExpenses());
        panel.add(btnCalculate);
    }
    
    private void calculateExpenses(){
        int days, miles;
        double airfare, car, parking, taxi, seminar, lodging;
        double total, allowable;
        //
        days = Integer.parseInt(txtDays.getText());
        miles = Integer.parseInt(txtMilesDriven.getText());
        airfare = Double.parseDouble(txtAirFare.getText());
        car = Double.parseDouble(txtCarRental.getText());
        parking = Double.parseDouble(txtParkingFees.getText());
        taxi = Double.parseDouble(txtTaxiCharges.getText());
        seminar = Double.parseDouble(txtSeminarFees.getText());
        lodging = Double.parseDouble(txtLodging.getText());
        //
        total = airfare + car + parking + taxi + seminar + lodging;
        allowable = (days * 37) + (days * 20) + (days * 95);
        if(car <= 0.0){
            allowable += (days * 10);
        } else {
            allowable += (miles * 0.27);
        }
        
        txtExpenses.setText(String.format("$%,.2f", total));
        txtAllowable.setText(String.format("$%,.2f", allowable));
        if(total == allowable){
            txtExcess.setText(String.format("$%,.2f", 0.0));
            txtSaved.setText(String.format("$%,.2f", 0.0));
        } else if(total > allowable){
            txtExcess.setText(String.format("$%,.2f", total - allowable));
            txtSaved.setText(String.format("$%,.2f", 0.0));
        } else {
            txtExcess.setText(String.format("$%,.2f", 0.0));
            txtSaved.setText(String.format("$%,.2f", allowable - total));
        }
    }
    
}
