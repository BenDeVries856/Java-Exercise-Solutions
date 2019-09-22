/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import java.io.File;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author ben_d
 */
public class SlotMachineController {
    
    private Random r = new Random();
    private double total = 0;
    
    @FXML
    private ImageView imgSlot1;
    @FXML
    private ImageView imgSlot2;
    @FXML
    private ImageView imgSlot3;
    @FXML
    private TextField txtInsert;
    @FXML
    private Label lblRound;
    @FXML
    private Label lblTotal;
    
    private String getFruit(){
        int num = r.nextInt(3);
        if(num == 0){
            return "cherries";
        }else if(num == 1){
            return "orange";
        }else{
            return "banana";
        }
    }
    
    public void spinListener(){
        String fslot = getFruit();
        String sslot = getFruit();
        String tslot = getFruit();
        System.out.println("1: " + fslot);
        System.out.println("2: " + sslot);
        System.out.println("3: " + tslot);
        File file1 = new File("slots/" + fslot + ".png");
        File file2 = new File("slots/" + sslot + ".png");
        File file3 = new File("slots/" + tslot + ".png");
        Image image1 = new Image(file1.toURI().toString());
        Image image2 = new Image(file2.toURI().toString());
        Image image3 = new Image(file3.toURI().toString());
        imgSlot1.setImage(image1);
        imgSlot2.setImage(image2);
        imgSlot3.setImage(image3);
        double inserted = Double.parseDouble(txtInsert.getText());
        double won;
        if(fslot.equals(sslot) && sslot.equals(tslot)){
            won = inserted * 3;
        }else if(fslot.equals(sslot) || sslot.equals(tslot) || tslot.equals(fslot)){
            won = inserted * 2;
        }else{
            won = 0;
        }
        total += won;
        lblRound.setText(String.format("Amount Won This Spin: $%.2f", won));
        lblTotal.setText(String.format("Total Amount Won: $%.2f", total));
    }
    
}
