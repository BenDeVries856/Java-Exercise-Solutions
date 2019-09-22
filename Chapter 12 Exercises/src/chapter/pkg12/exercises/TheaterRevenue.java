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
public class TheaterRevenue extends JFrame {
    
    private final int TEXT_COLS = 10;
    private final double THEATER_TAKE = 0.2;
    
    private JPanel panel;
    private JButton btnCalculate;
    // first column
    private JTextField txtAdultPrice;
    private JTextField txtAdultSold;
    private JTextField txtChildPrice;
    private JTextField txtChildSold;
    // second column
    private JTextField txtAdultGross;
    private JTextField txtAdultRevenue;
    private JTextField txtChildGross;
    private JTextField txtChildRevenue;
    private JTextField txtGross;
    private JTextField txtRevenue;
    
    public TheaterRevenue(){
        setSize(500, 350);
        panel = new JPanel();
        attachComponents();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void attachComponents(){
        panel.setLayout(new GridLayout(12, 2));
        // row 1
        panel.add(new JLabel("Price Per Adult Ticket:"));
        panel.add(new JLabel("Gross Revenue for Adult Tickets:"));
        // row 2
        txtAdultPrice = new JTextField(TEXT_COLS);
        panel.add(txtAdultPrice);
        txtAdultGross = new JTextField(TEXT_COLS);
        txtAdultGross.setEditable(false);
        panel.add(txtAdultGross);
        // row 3
        panel.add(new JLabel("Adult Tickets Sold"));
        panel.add(new JLabel("Net Revenue for Adult Tickets:"));
        // row 4
        txtAdultSold = new JTextField(TEXT_COLS);
        panel.add(txtAdultSold);
        txtAdultRevenue = new JTextField(TEXT_COLS);
        txtAdultRevenue.setEditable(false);
        panel.add(txtAdultRevenue);
        // row 5
        panel.add(new JLabel("Price Per Child Ticket:"));
        panel.add(new JLabel("Gross Revenue for Child Tickets:"));
        // row 6
        txtChildPrice = new JTextField(TEXT_COLS);
        panel.add(txtChildPrice);
        txtChildGross = new JTextField(TEXT_COLS);
        txtChildGross.setEditable(false);
        panel.add(txtChildGross);
        // row 7
        panel.add(new JLabel("Child Tickets Sold"));
        panel.add(new JLabel("Net Revenue for Child Tickets"));
        // row 8
        txtChildSold = new JTextField(TEXT_COLS);
        panel.add(txtChildSold);
        txtChildRevenue = new JTextField(TEXT_COLS);
        txtChildRevenue.setEditable(false);
        panel.add(txtChildRevenue);
        // row 9
        panel.add(new JLabel(""));
        panel.add(new JLabel("Total Gross Revenues:"));
        // row 10
        panel.add(new JLabel(""));
        txtGross = new JTextField(TEXT_COLS);
        txtGross.setEditable(false);
        panel.add(txtGross);
        // row 11
        panel.add(new JLabel(""));
        panel.add(new JLabel("Total Net Revenues:"));
        // row 12
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(e -> calculateRevenue());
        panel.add(btnCalculate);
        
        txtRevenue = new JTextField(TEXT_COLS);
        txtRevenue.setEditable(false);
        panel.add(txtRevenue);
    }
    
    private void calculateRevenue(){
        int adultNum, childNum;
        double adultPrice, childPrice, adultGross, childGross,
                adultNet, childNet, gross, net;
        //
        adultNum = Integer.parseInt(txtAdultSold.getText());
        childNum = Integer.parseInt(txtChildSold.getText());
        adultPrice = Double.parseDouble(txtAdultPrice.getText());
        childPrice = Double.parseDouble(txtChildPrice.getText());
        adultGross = adultNum * adultPrice;
        childGross = childNum * childPrice;
        adultNet = adultGross * THEATER_TAKE;
        childNet = childGross * THEATER_TAKE;
        gross = adultGross + childGross;
        net = adultNet + childNet;
        //
        txtAdultGross.setText(String.format("$%,.2f", adultGross));
        txtChildGross.setText(String.format("$%,.2f", childGross));
        txtAdultRevenue.setText(String.format("$%,.2f", adultNet));
        txtChildRevenue.setText(String.format("$%,.2f", childNet));
        txtGross.setText(String.format("$%,.2f", gross));
        txtRevenue.setText(String.format("$%,.2f", net));
    }
    
}
