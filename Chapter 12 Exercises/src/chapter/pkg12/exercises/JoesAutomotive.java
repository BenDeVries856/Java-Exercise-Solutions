/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg12.exercises;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ben_d
 */
public class JoesAutomotive extends JFrame {
    
    private JPanel panel;
    //options panel
    private JCheckBox chxOil;
    private JCheckBox chxLube;
    private JCheckBox chxRad;
    private JCheckBox chxTransmission;
    private JCheckBox chxInspection;
    private JCheckBox chxMuffler;
    private JCheckBox chxTire;
    //total panel
    private JTextField txtExtra;
    private JTextField txtTotal;
    private JTextField txtParts;
    private JButton btnCalculate;
    
    public JoesAutomotive(){
        addComponents();
        setupFrame();
    }
    
    public void setupFrame(){
        setSize(350, 275);
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
        chxOil = new JCheckBox("Oil change");
        chxLube = new JCheckBox("Lube job");
        chxRad = new JCheckBox("Radiator flush");
        chxTransmission = new JCheckBox("Transmission flush");
        chxInspection = new JCheckBox("Inspection");
        chxMuffler = new JCheckBox("Muffler replacement");
        chxTire = new JCheckBox("Tire rotation");
        jp.add(chxOil);
        jp.add(chxLube);
        jp.add(chxRad);
        jp.add(chxTransmission);
        jp.add(chxInspection);
        jp.add(chxMuffler);
        jp.add(chxTire);
        jp.setBorder(BorderFactory.createTitledBorder("Maintenance"));
        return jp;
    }
    
    private JPanel getTotalPanel(){
        JPanel jp = new JPanel();
        jp.add(new JLabel("Extra Labor:"));
        txtExtra = new JTextField(13);
        jp.add(txtExtra);
        jp.add(new JLabel("Extra Parts:"));
        txtParts = new JTextField(13);
        jp.add(txtParts);
        jp.add(new JLabel("Total:"));
        txtTotal = new JTextField(13);
        txtTotal.setEditable(false);
        jp.add(txtTotal);
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(e -> calculateTotal());
        jp.add(btnCalculate);
        jp.setBorder(BorderFactory.createTitledBorder("Total"));
        return jp;
    }
    
    private void calculateTotal(){
        double total = 0;
        if(chxOil.isSelected()){
            total += 26;
        }
        if(chxLube.isSelected()){
            total += 18;
        }
        if(chxRad.isSelected()){
            total += 30;
        }
        if(chxTransmission.isSelected()){
            total += 80;
        }
        if(chxInspection.isSelected()){
            total += 15;
        }
        if(chxMuffler.isSelected()){
            total += 100;
        }
        if(chxTire.isSelected()){
            total += 20;
        }
        int hours = Integer.parseInt(txtExtra.getText());
        total += hours * 20.0;
        total += Double.parseDouble(txtParts.getText());
        txtTotal.setText(String.format("$%,.2f", total));
    }
    
}
