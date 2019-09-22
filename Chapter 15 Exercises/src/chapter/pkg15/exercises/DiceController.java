/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import java.io.File;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author ben_d
 */
public class DiceController {
    
    private Random r = new Random();
    
    @FXML
    private ImageView imgDice1;
    @FXML
    private ImageView imgDice2;
    
    public void rollListener(){
        int fnum = r.nextInt(6) + 1;
        int snum = r.nextInt(6) + 1;
        String filename1 = "dice/Die" + fnum + ".png";
        String filename2 = "dice/Die" + snum + ".png";
        File file1 = new File(filename1);
        File file2 = new File(filename2);
        Image image1 = new Image(file1.toURI().toString());
        Image image2 = new Image(file2.toURI().toString());
        imgDice1.setImage(image1);
        imgDice2.setImage(image2);
    }
    
}
