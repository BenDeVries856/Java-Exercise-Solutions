/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

/**
 *
 * @author ben_d
 */
public class ChargeAccount {
    
    private int[] ids = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231,
        3852085, 7576651, 7881200, 4581002};
    
    public boolean isValidAccountNumber(int id){
        for(int i = 0; i < ids.length; i++){
            if(id == ids[i]){
                return true;
            }
        }
        return false;
    }
    
}
