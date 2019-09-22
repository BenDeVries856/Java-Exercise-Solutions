/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg7.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ben_d
 */
public class ModifiedChargeAccount {
    
    private ArrayList<String> accounts;
    
    public ModifiedChargeAccount() throws FileNotFoundException{
        accounts = new ArrayList<String>();
        File file = new File("validaccounts.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String account = input.nextLine();
            accounts.add(account);
        }
    }
    
    public boolean isValidAccountNumber(String id){
        for(int i = 0; i < accounts.size(); i++){
            if(id.equals(accounts.get(i))){
                return true;
            }
        }
        return false;
    }
    
}
