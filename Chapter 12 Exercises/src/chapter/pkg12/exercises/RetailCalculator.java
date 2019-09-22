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
public class RetailCalculator extends JFrame {
    
    JPanel panel;
    JLabel description;
    JTextField txtPrice;
    JTextField txtMarkup;
    JButton btnCalculate;
    
    public RetailCalculator(){
        setSize(300, 150);
        panel = new JPanel();
        add(panel);
        attachComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void attachComponents(){
        description = new JLabel("<html><body>Enter the price and markup percent<br> then hit calculate</body></html>");
        txtPrice = new JTextField(10);
        txtMarkup = new JTextField(10);
        btnCalculate = new JButton("calculate");
        
        btnCalculate.addActionListener(e -> calculateMarkup());
        
        panel.add(description);
        panel.add(txtPrice);
        panel.add(txtMarkup);
        panel.add(btnCalculate);
        add(panel);
    }
    
    private void calculateMarkup(){
        double price = Double.parseDouble(txtPrice.getText());
        double percent = Double.parseDouble(txtMarkup.getText());
        double markup = price * (percent * 0.01);
        JOptionPane.showMessageDialog(null, String.format("The markup is $%,.2f", markup));
    }
    
}
