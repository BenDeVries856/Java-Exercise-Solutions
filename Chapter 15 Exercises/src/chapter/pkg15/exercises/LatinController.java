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
public class LatinController {
    
    @FXML
    private Button btnSinister;
    @FXML
    private Button btnDexter;
    @FXML
    private Button btnMedium;
    @FXML
    private TextField txtEnglish;
    
    public void sinisterListener(){
        txtEnglish.setText("Left");
    }
    
    public void dexterListener(){
        txtEnglish.setText("Right");
    }
    
    public void mediumListener(){
        txtEnglish.setText("Center");
    }
    
}
