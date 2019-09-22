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
public class RPSController {
    
    private Random r = new Random();
    
    @FXML
    private ImageView imgPlayer;
    @FXML
    private ImageView imgCom;
    @FXML
    private TextField txtResult;
    @FXML
    private Label txtMessage;
    
    // choices: 1-rock, 2-paper, 3-scissors
    public void play(int player){
        int computer = r.nextInt(3) + 1;
        String outcome;
        if(player == 1 && computer == 1){
            outcome = "Rock";
            txtMessage.setText("Tie");
        }else if(player == 2 && computer == 2){
            outcome = "Paper";
            txtMessage.setText("Tie");
        }else if(player == 3 && computer == 3){
            outcome = "Scissors";
            txtMessage.setText("Tie");
        }else if(player == 1 && computer == 3){
            outcome = "Scissors";
            txtMessage.setText("You Win!");
        }else if(player == 1 && computer == 2){
            outcome = "Paper";
            txtMessage.setText("You Lose :(");
        }else if(player == 2 && computer == 1){
            outcome = "Rock";
            txtMessage.setText("You Win!");
        }else if(player == 2 && computer == 3){
            outcome = "Scissors";
            txtMessage.setText("You Lose :(");
        }else if(player == 3 && computer == 2){
            outcome = "Paper";
            txtMessage.setText("You Win!");
        }else if(player == 3 && computer == 1){
            outcome = "Rock";
            txtMessage.setText("You Lose :(");
        }else{
            outcome = "Rock";
        }
        txtResult.setText(outcome);
        File file1 = new File("rps/" + outcome + ".jpg");
        Image image1 = new Image(file1.toURI().toString());
        imgCom.setImage(image1);
        String ply;
        if(player == 1){
            ply = "Rock";
        }else if(player == 2){
            ply = "Paper";
        }else{
            ply = "Scissors";
        }
        File file2 = new File("rps/" + ply + ".jpg");
        Image image2 = new Image(file2.toURI().toString());
        imgPlayer.setImage(image2);
    }
    
    public void rockListener(){
        play(1);
    }
    
    public void paperListener(){
        play(2);
    }
    
    public void scissorsListener(){
        play(3);
    }
    
}
