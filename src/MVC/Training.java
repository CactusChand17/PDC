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
public class Training extends Character{

    public void trainPlayer() {
       
        //asks for input for how long you want to train
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter time training: \n 1: 10mins \n 2: 20mins \n 3: 30mins");
            String input = scan.nextLine();

            //takes input
            if ("1".equals(input) || "2".equals(input) || "3".equals(input)) {
                int number = Integer.parseInt(input);
                switch (number) {
                    case 1:
                        //trains for 10 minutes
                        for (int i = 0; i < 10; i++) {
                            System.out.println(i + "Minute");
                        }
                        //adds 10 exp
                        setExp(getExp() + 10);
                        break;
                    case 2:
                        //trains for 20 minutes
                        for (int i = 0; i < 20; i++) {
                            System.out.println(i + "Minute");
                        }
                        //adds 20 exp
                        setExp(getExp() + 20);
                        break;
                    case 3:
                        //trains for 30 minutes
                        for (int i = 0; i < 30; i++) {
                            System.out.println(i + "Minute");
                        }
                        //adds 30 exp
                        setExp(getExp() + 30);
                        break;
                    default:
                        break;
                }
                break;
            } else {
                System.out.println("Enter Correct Input");
            }
        }

    }
}
