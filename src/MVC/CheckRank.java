/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author manu2
 */
public class CheckRank extends Character{
     public void rankUp() {
        //if the current rank not equal to this rank
        if (getRank() != 'C') {
            //if exp greater than or equal to 100
            if (getExp() >= 100) {
                //set the rank to this rank
                setRank('C');
                System.out.println("New Rank: " + getRank());
                //add health
                setHealth(getHealth() + 100);
            }
            //progresses more when higher rank is obtained
        } else if (getRank() != 'B') {
            if (getExp() >= 250) {
                setRank('B');
                System.out.println("New Rank: " + getRank());
                setHealth(getHealth() + 250);
            }
        } else if (getRank() != 'A') {
            if (getExp() >= 500) {
                setRank('A');
                System.out.println("New Rank: " + getRank());
                setHealth(getHealth() + 500);
            }
        } else if (getRank() != 'S') {
            if (getExp() >= 1000) {
                setRank('S');
                System.out.println("New Rank: " + getRank());
                setHealth(getHealth() + 1000);
            }
        }

    }
}
