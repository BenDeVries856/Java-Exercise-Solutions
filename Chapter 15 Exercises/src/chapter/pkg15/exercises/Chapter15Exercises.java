/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg15.exercises;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ben_d
 */
public class Chapter15Exercises extends Application {
    
    private static boolean ex1 = false;
    private static boolean ex2 = false;
    private static boolean ex3 = false;
    private static boolean ex4 = false;
    private static boolean ex5 = false;
    private static boolean ex6 = false;
    private static boolean ex7 = false;
    private static boolean ex8 = false;
    private static boolean ex9 = false;
    private static boolean ex10 = false;
    private static boolean ex11 = true;
    
    
    public void start(Stage stage) throws Exception{
        String filename;
        if(ex1){
          filename = "RetailPrice.fxml";  
        }else if(ex2){
            filename = "LatinTranslator.fxml"; 
        }else if(ex3){
            filename = "NameFormatter.fxml"; 
        }else if(ex4){
            filename = "TipTaxTotal.fxml"; 
        }else if(ex5){
            filename = "DistanceTraveled.fxml";
        }else if(ex6){
            filename = "HeadsTails.fxml";
        }else if(ex7){
            filename = "TempConverter.fxml";
        }else if(ex8){
            filename = "DiceSimulator.fxml";
        }else if(ex9){
            filename = "RPS.fxml";
        }else if(ex10){
            filename = "TicTacToe.fxml";
        }else if(ex11){
            filename = "SlotMachine.fxml";
        }else{
            filename = "";
        }
        Parent parent = FXMLLoader.load(getClass().getResource(filename));
        
        Scene scene = new Scene(parent);
        
        stage.setTitle("Retail Price Calculator");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
