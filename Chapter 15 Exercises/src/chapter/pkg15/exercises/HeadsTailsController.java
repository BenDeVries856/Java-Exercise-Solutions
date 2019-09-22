/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.ImageIcon;

/**
 *
 * @author ben_d
 */
public class HeadsTailsController {
    
    private static Random r = new Random();
    
    @FXML
    private ImageView imgCoin;
    
    public void initialize(URL location, ResourceBundle resources){
        File file = new File(flip());
        Image image = new Image(file.toURI().toString());
        imgCoin.setImage(image);
    }
    
    public void flipListener(){
        File file = new File(flip());
        Image image = new Image(file.toURI().toString());
        imgCoin.setImage(image);
    }
    
    private String flip(){
        int num = r.nextInt(2);
        if(num == 0){
            return "coins/heads.jpg";
        }else{
            return "coins/tails.jpg";
        }
    }
    
}
