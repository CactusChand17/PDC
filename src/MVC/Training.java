/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.Scanner;

/**
 *
 * @author manu2
 */


public class Training extends Character implements Runnable{  
    
    private final int num;
    private int finalNumber;
    public Training(int i) {
        this.num = i;
    }

    @Override
    public void run() {
        for (int j = 0; j <= this.num; j++) {

            
            finalNumber = j;
        }
    }
    
    
    public void trainPlayer()
    {
        setExp(getExp()+finalNumber);
    }
}