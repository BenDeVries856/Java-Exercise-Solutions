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
public class DistanceTraveledController {
    
    @FXML
    private TextField txtSpeed;
    @FXML
    private TextField txtFive;
    @FXML
    private TextField txtEight;
    @FXML
    private TextField txtTwelve;
    
    public void calculateListener(){
        double speed = Double.parseDouble(txtSpeed.getText());
        txtFive.setText(String.format("%.2f miles", speed * 5));
        txtEight.setText(String.format("%.2f miles", speed * 8));
        txtTwelve.setText(String.format("%.2f miles", speed * 12));
    }
    
}
