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
public class NameFormatController {
    
    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtMiddle;
    @FXML
    private TextField txtLast;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextField txtResult;
    
    public void format1Listener(){
        String first = txtFirst.getText();
        String middle = txtMiddle.getText();
        String last = txtLast.getText();
        String title = txtTitle.getText();
        txtResult.setText(title + " " + first + " " + middle + " " + last);
    }
    
    public void format2Listener(){
        String first = txtFirst.getText();
        String middle = txtMiddle.getText();
        String last = txtLast.getText();
        txtResult.setText(first + " " + middle + " " + last);
    }
    
    public void format3Listener(){
        String first = txtFirst.getText();
        String last = txtLast.getText();
        txtResult.setText(first + " " +  last);
    }
    
    public void format4Listener(){
        String first = txtFirst.getText();
        String middle = txtMiddle.getText();
        String last = txtLast.getText();
        String title = txtTitle.getText();
        txtResult.setText(last + ", " + first + " " + middle + ", " + title);
    }
    
    public void format5Listener(){
        String first = txtFirst.getText();
        String middle = txtMiddle.getText();
        String last = txtLast.getText();
        txtResult.setText(last + ", " + first + " " + middle);
    }
    
    public void format6Listener(){
        String first = txtFirst.getText();
        String last = txtLast.getText();
        txtResult.setText(last + ", " + first);
    }
    
}
