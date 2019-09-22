/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author ben_d
 */
public class TipTaxTotalController {
    
    @FXML
    private TextField txtBill;
    @FXML
    private TextField txtTip;
    @FXML
    private TextField txtTax;
    @FXML
    private TextField txtTotal;
    
    public void calculateListener(){
        double bill = Double.parseDouble(txtBill.getText());
        double tip = bill * 0.18;
        double tax = bill * 0.07;
        double total = tip + tax + bill;
        txtTip.setText(String.format("%.2f", tip));
        txtTax.setText(String.format("%.2f", tax));
        txtTotal.setText(String.format("%.2f", total));
    }
    
}
