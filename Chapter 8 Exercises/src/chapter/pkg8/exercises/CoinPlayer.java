/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg8.exercises;

/**
 *
 * @author ben_d
 */
public class CoinPlayer {
    
    private Coin coin;
    private int points;
    
    public CoinPlayer(){
        this.points = 1;
        this.coin = new Coin();
    }
    
    public String flip(String input){
        Coin.Face guess;
        if(input.equals("heads") || input.equals("HEADS") || input.equals("Heads") || input.equals("H") || input.equals("h")){
            guess = Coin.Face.HEADS;
        } else if(input.equals("tails") || input.equals("TAILS") || input.equals("Tails") || input.equals("T") || input.equals("t")){
            guess = Coin.Face.TAILS;
        } else {
            return "That was not a valid guess and therefore you forfeit your turn";
        }
        Coin.Face face = coin.flipCoin();
        if((face == Coin.Face.HEADS && guess == Coin.Face.HEADS)
                || (face == Coin.Face.TAILS && guess == Coin.Face.TAILS)){
            points++;
            return "Player rolled a " + face + ", they are correct";
        } else {
            return "Player rolled a " + face + ", they are incorrect";
        }
    }
    
    public int getPoints(){
        return this.points;
    }
    
}
