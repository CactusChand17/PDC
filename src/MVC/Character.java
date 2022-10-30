package MVC;

import java.util.HashMap;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manu2
 */
public class Character extends Player{
   //characterclasses class
    private CharacterClasses classes = new CharacterClasses();
    //hashmap of the chosen class for player
    private HashMap<String, Integer> playerClass = new HashMap();
    
     /**
     * @return the classes
     */
    public CharacterClasses getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(CharacterClasses classes) {
        this.classes = classes;
    }

    /**
     * @return the playerClass
     */
    public HashMap<String, Integer> getPlayerClass() {
        return playerClass;
    }

    /**
     * @param playerClass the playerClass to set
     */
    public void setPlayerClass(HashMap<String, Integer> playerClass) {
        this.playerClass = playerClass;
    }
}
