/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg12.exercises;

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
public class MonthlyTax extends JFrame{
    
    private final double COUNTY_TAX = 0.02;
    private final double STATE_TAX = 0.04;
    
    private JPanel panel;
    private JLabel description;
    private JTextField txtTotalSales;
    private JButton btnCalculate;
    
    public MonthlyTax(){
        setSize(200, 150);
        panel = new JPanel();
        add(panel);
        attachComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void attachComponents(){
        description = new JLabel("<html><body>Enter the total sales<br>then hit calculate</body></html>");
        txtTotalSales = new JTextField(10);
        btnCalculate = new JButton("calculate");
        
        btnCalculate.addActionListener(e -> calculateTax());
        
        panel.add(description);
        panel.add(txtTotalSales);
        panel.add(btnCalculate);
        add(panel);
    }
    
    private void calculateTax(){
        double sales = Double.parseDouble(txtTotalSales.getText());
        double county = sales * COUNTY_TAX;
        double state = sales * STATE_TAX;
        double total = county + state;
        JOptionPane.showMessageDialog(null, String.format("County Tax: $%,.2f\nState Tax: $%,.2f\nTotal: $%,.2f", county, state, total));
    }
    
}
