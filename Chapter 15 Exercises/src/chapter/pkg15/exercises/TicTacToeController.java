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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ben_d
 */
public class TicTacToeController {
    
    private Random r = new Random();
    
    @FXML
    private Label lblResult;
    @FXML
    private TextField txtNewGame;
    @FXML
    private ImageView img00;
    @FXML
    private ImageView img01;
    @FXML
    private ImageView img02;
    @FXML
    private ImageView img10;
    @FXML
    private ImageView img11;
    @FXML
    private ImageView img12;
    @FXML
    private ImageView img20;
    @FXML
    private ImageView img21;
    @FXML
    private ImageView img22;
    
    private void ticTacToe(){
        boolean xstart;
        if(r.nextInt(2) == 0){
            xstart = true;
        } else {
            xstart = false;
        }
        String[][] tacs = {{"n","n","n"},{"n","n","n"},{"n","n","n"}};
        for(int i = 0; i < 9; i++){
            String val;
            if(xstart){
                if(i % 2 == 0){
                    val = "x";
                } else {
                    val = "o";
                }
            } else {
                if(i % 2 == 0){
                    val = "o";
                } else {
                    val = "x";
                }
            }
            int fnum, snum;
            String x;
            do{
              fnum = r.nextInt(3);
              snum = r.nextInt(3);
              x = tacs[fnum][snum];
            } while(!x.equals("n"));
            tacs[fnum][snum] = val;
        }
        String fn00 = "tacs/" + tacs[0][0] + ".png";
        String fn01 = "tacs/" + tacs[0][1] + ".png";
        String fn02 = "tacs/" + tacs[0][2] + ".png";
        String fn10 = "tacs/" + tacs[1][0] + ".png";
        String fn11 = "tacs/" + tacs[1][1] + ".png";
        String fn12 = "tacs/" + tacs[1][2] + ".png";
        String fn20 = "tacs/" + tacs[2][0] + ".png";
        String fn21 = "tacs/" + tacs[2][1] + ".png";
        String fn22 = "tacs/" + tacs[2][2] + ".png";
        File file00 = new File(fn00);
        File file01 = new File(fn01);
        File file02 = new File(fn02);
        File file10 = new File(fn10);
        File file11 = new File(fn11);
        File file12 = new File(fn12);
        File file20 = new File(fn20);
        File file21 = new File(fn21);
        File file22 = new File(fn22);
        Image image00 = new Image(file00.toURI().toString());
        Image image01 = new Image(file01.toURI().toString());
        Image image02 = new Image(file02.toURI().toString());
        Image image10 = new Image(file10.toURI().toString());
        Image image11 = new Image(file11.toURI().toString());
        Image image12 = new Image(file12.toURI().toString());
        Image image20 = new Image(file20.toURI().toString());
        Image image21 = new Image(file21.toURI().toString());
        Image image22 = new Image(file22.toURI().toString());
        img00.setImage(image00);
        img01.setImage(image01);
        img02.setImage(image02);
        img10.setImage(image10);
        img11.setImage(image11);
        img12.setImage(image12);
        img20.setImage(image20);
        img21.setImage(image21);
        img22.setImage(image22);
        String result;
        if(tacs[0][0].equals(tacs[0][1]) && tacs[0][1].equals(tacs[0][2])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[1][0].equals(tacs[1][1]) && tacs[1][1].equals(tacs[1][2])){
            result = tacs[1][0] + " Wins!";
        } else if(tacs[2][0].equals(tacs[2][1]) && tacs[2][1].equals(tacs[2][2])){
            result = tacs[2][0] + " Wins!";
        } else if(tacs[0][0].equals(tacs[1][0]) && tacs[1][0].equals(tacs[2][0])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[0][1].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][1])){
            result = tacs[0][1] + " Wins!";
        } else if(tacs[0][2].equals(tacs[1][2]) && tacs[1][2].equals(tacs[2][2])){
            result = tacs[0][2] + " Wins!";
        } else if(tacs[0][0].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][2])){
            result = tacs[0][0] + " Wins!";
        } else if(tacs[0][2].equals(tacs[1][1]) && tacs[1][1].equals(tacs[2][0])){
            result = tacs[0][2] + " Wins!";
        } else {
            result = "Cats Game";
        }
        lblResult.setText(result);
    }
    
    public void newGameListener(){
        ticTacToe();
    }
    
}
