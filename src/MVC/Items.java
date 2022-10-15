/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.ArrayList;

/**
 *
 * @author manu2
 */

//Items Class where each item has its own perk
public class Items {
    
    //Arraylist for items
    ArrayList<String> Items = new ArrayList();

    public ArrayList itemNames()
    {
         //Coin does nothing Collectable
        Items.add("Coin");
        //Eclipse adds 100 damage
        Items.add("Eclipse");
        //Warmogs heals you 20 hp each round
        Items.add("Warmogs");
         //Coin does nothing Collectable
        Items.add("Coin");
        //Holy Grail adds 50 damage
        Items.add("Holy Grail");
         //Coin does nothing Collectable
        Items.add("Coin");
        //Fairy passively grants 20 damage after each round
        Items.add("Fairy");
        //Coin does nothing Collectable
        Items.add("Coin");
        
        //Coin is there to lower the chances of getting good items.
        return Items;
    }
}
