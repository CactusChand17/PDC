package MVC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;





/**
 *
 * @author manu2
 */
public abstract class Player {
    //Player and bot features
    
    //name bot and Player

    //rank
    private char rank = 'D';
    //health bot and Player
    private int health = 100;
    //experience 
    private int exp;
    //damage for bot
    private int damage;
    //items for player
    ArrayList<String> items = new ArrayList();
    
    
    /**
     * @return the rank
     */
    public char getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(char rank) {
        this.rank = rank;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the ranking
     */


    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }



    /**
     * @return the type
     */

}
