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
public class TempController {
    
    @FXML
    private TextField txtOriginal;
    @FXML
    private TextField txtNew;
    
    public void farenheitListener(){
        double celsius = Double.parseDouble(txtOriginal.getText());
        double farenheit = 1.8 * celsius + 32;
        txtNew.setText(String.format("%.2f", farenheit));
    }
    
    public void celsiusListener(){
        double farenheit = Double.parseDouble(txtOriginal.getText());
        double celsius = (5.0/9.0) * (farenheit - 32);
        txtNew.setText(String.format("%.2f", celsius));
    }
    
}
