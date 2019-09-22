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
public class PropertyTax extends JFrame {
    
    private final double PROPERTY_TAX = 0.0064;
    
    private JPanel panel;
    private JLabel description;
    private JTextField txtValue;
    private JButton btnCalculate;
    
    public PropertyTax(){
        setSize(200, 150);
        panel = new JPanel();
        add(panel);
        attachComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void attachComponents(){
        description = new JLabel("<html><body>Enter the property value<br>for the property tax</body></html>");
        txtValue = new JTextField(10);
        btnCalculate = new JButton("calculate");
        
        btnCalculate.addActionListener(e -> calculateTax());
        
        panel.add(description);
        panel.add(txtValue);
        panel.add(btnCalculate);
        add(panel);
    }
    
    private void calculateTax(){
        double value = Double.parseDouble(txtValue.getText());
        double tax = value * PROPERTY_TAX;
        JOptionPane.showMessageDialog(null, String.format("The property tax is: $%,.2f", tax));
    }
    
}
