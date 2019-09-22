/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author ben_d
 */
public class RetailController {
    
    @FXML
    private TextField txtSubtotal;
    @FXML
    private TextField txtMarkup;
    @FXML
    private TextField txtTotal;
    @FXML
    private Button btnCalculate;
    
    public void initialize(){
        
    }
    
    public void calculateListener(){
        double subtotal = Double.parseDouble(txtSubtotal.getText());
        double markup = Double.parseDouble(txtMarkup.getText()) / 100;
        double total = subtotal + (subtotal * markup);
        txtTotal.setText(String.format("%.2f", total));
    }
    
}
