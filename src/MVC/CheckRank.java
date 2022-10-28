/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author manu2
 */
public class CheckRank{
    Character Player = new Character();
     public void rankUp() {
        //if the current rank not equal to this rank
        if (Player.getRank() != 'C') {
            //if exp greater than or equal to 100
            if (Player.getExp() >= 100) {
                //set the rank to this rank
                Player.setRank('C');
                System.out.println("New Rank: " + Player.getRank());
                //add health
                Player.setHealth(Player.getHealth() + 100);
            }
            //progresses more when higher rank is obtained
        } else if (Player.getRank() != 'B') {
            if (Player.getExp() >= 250) {
                Player.setRank('B');
                System.out.println("New Rank: " + Player.getRank());
                Player.setHealth(Player.getHealth() + 250);
            }
        } else if (Player.getRank() != 'A') {
            if (Player.getExp() >= 500) {
                Player.setRank('A');
                System.out.println("New Rank: " + Player.getRank());
                Player.setHealth(Player.getHealth() + 500);
            }
        } else if (Player.getRank() != 'S') {
            if (Player.getExp() >= 1000) {
                Player.setRank('S');
                System.out.println("New Rank: " + Player.getRank());
                Player.setHealth(Player.getHealth() + 1000);
            }
        }

    }
}
