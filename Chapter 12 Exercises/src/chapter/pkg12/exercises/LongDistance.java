/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg12.exercises;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ben_d
 */
public class LongDistance extends JFrame {
    
    private JPanel panel;
    //options panel
    private JRadioButton chbDaytime;
    private JRadioButton chbEvening;
    private JRadioButton chbOffPeak;
    private JTextField txtMinutes;
    //total panel
    private JTextField txtTotal;
    private JButton btnCalculate;
    
    public LongDistance(){
        addComponents();
        setupFrame();
    }
    
    public void setupFrame(){
        setSize(275, 220);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void addComponents(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.add(getOptionsPanel());
        panel.add(getTotalPanel());
    }
    
    private JPanel getOptionsPanel(){
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.LEFT));
        chbDaytime = new JRadioButton("Daytime");
        chbEvening = new JRadioButton("Evening");
        chbOffPeak = new JRadioButton("Off-Peak");
        ButtonGroup group = new ButtonGroup();
        group.add(chbDaytime);
        group.add(chbEvening);
        group.add(chbOffPeak);
        jp.add(chbDaytime);
        jp.add(chbEvening);
        jp.add(chbOffPeak);
        jp.add(new JLabel("Minutes:"));
        txtMinutes = new JTextField(7);
        jp.add(txtMinutes);
        jp.setBorder(BorderFactory.createTitledBorder("Category"));
        return jp;
    }
    
    private JPanel getTotalPanel(){
        JPanel jp = new JPanel();
        jp.add(new JLabel("Total:"));
        txtTotal = new JTextField(7);
        txtTotal.setEditable(false);
        jp.add(txtTotal);
        jp.add(new JLabel(""));
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(e -> calculateTotal());
        jp.add(btnCalculate);
        jp.setBorder(BorderFactory.createTitledBorder("Total"));
        return jp;
    }
    
    private void calculateTotal(){
        double total = 0;
        int minutes = Integer.parseInt(txtMinutes.getText());
        if(chbDaytime.isSelected()){
            total = minutes * 0.07;
        } else if(chbEvening.isSelected()){
            total = minutes * 0.12;
        } else if(chbOffPeak.isSelected()){
            total = minutes * 0.05;
        } else {
            System.out.println("else");
        }
        txtTotal.setText(String.format("$%,.2f", total));
    }
    
}
