/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.HashMap;

/**
 *
 * @author manu2
 */
public class CharacterClasses {

    //class for creating player class
    //sets damage for the different abilitys
    public String type;
    private int neutral = 10;
    private int heavy = 15;
    private int ability1 = 18;
    private int ability2 = 20;

    //creates a hashmap for each class
    private HashMap<String, Integer> Warrior = new HashMap();
    private HashMap<String, Integer> Rogue = new HashMap();
    private HashMap<String, Integer> Mage = new HashMap();

    //Warrior class
    public HashMap Warrior() {
        //sets type name
        type = "Warrior";
        //sets the damage as the value and name as key
        Warrior.put("Neutral", getNeutral());
        Warrior.put("Heavy", getHeavy());
        Warrior.put("Sheild", getAbility1());
        Warrior.put("Barrage", getAbility2());
        return Warrior;
    }

    //Rogue class
    public HashMap Rogue() {
        //sets type name
        type = "Rogue";
        //sets the damage as the value and name as key
        Rogue.put("Neutral", getNeutral());
        Rogue.put("Heavy", getHeavy());
        Rogue.put("Sneak", getAbility1());
        Rogue.put("DeathDance", getAbility2());
        return Rogue;
    }

    //Mage class
    public HashMap Mage() {
        //sets type name
        type = "Mage";
        //sets the damage as the value and name as key
        Mage.put("Neutral", getNeutral());
        Mage.put("Heavy", getHeavy());
        Mage.put("Lightning", getAbility1());
        Mage.put("Storm", getAbility2());
        return Mage;
    }

    /**
     * @return the neutral
     */
    public int getNeutral() {
        return neutral;
    }

    /**
     * @param neutral the neutral to set
     */
    public void setNeutral(int neutral) {
        this.neutral = neutral;
    }

    /**
     * @return the heavy
     */
    public int getHeavy() {
        return heavy;
    }

    /**
     * @param heavy the heavy to set
     */
    public void setHeavy(int heavy) {
        this.heavy = heavy;
    }

    /**
     * @return the ability1
     */
    public int getAbility1() {
        return ability1;
    }

    /**
     * @param ability1 the ability1 to set
     */
    public void setAbility1(int ability1) {
        this.ability1 = ability1;
    }

    /**
     * @return the ability2
     */
    public int getAbility2() {
        return ability2;
    }

    /**
     * @param ability2 the ability2 to set
     */
    public void setAbility2(int ability2) {
        this.ability2 = ability2;
    }

}
