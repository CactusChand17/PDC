package MVC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;

/**
 *
 * @author manu2
 */
public class Bot extends Player {

    //Random
    Random rand = new Random();
    //botnames class for random names
    BotNames botNames = new BotNames();
    //craeting a private string for randomname and the addon name
    private String randomName;
    private String randomAddOn;

    //this class adds difficulty to the bosses
    //the bosses get harder and so does there stats
    public void easyBot() {
        //random health
        int health = rand.nextInt(50 - 10) + 10;
        //random damage
        int damage = rand.nextInt(25 - 0) + 0;
        //setting random health and damage
        setHealth(health);
        setDamage(damage);
        //setting rank
        setRank('D');

        //generates a random name for the bosses
        int randomIndex = rand.nextInt(botNames.botNames().size());
        int randomIndex2 = rand.nextInt(botNames.botNames().size());
        randomName = (String) botNames.botNames().get(randomIndex);
        randomAddOn = (String) botNames.botNames().get(randomIndex2);
        setName(randomName + " " + randomAddOn);
    }
    
    //repeated but made more difficult
    public void moderateBot() {
        int health = rand.nextInt(100 - 50) + 50;
        int damage = rand.nextInt(50 - 25) + 25;
        setHealth(health);
        setDamage(damage);
        setRank('C');

        int randomIndex = rand.nextInt(botNames.botNames().size());
        int randomIndex2 = rand.nextInt(botNames.botNames().size());
        randomName = (String) botNames.botNames().get(randomIndex);
        randomAddOn = (String) botNames.botNames().get(randomIndex2);
        setName(randomName + " " + randomAddOn);
    }

    public void hardBot() {
        int health = rand.nextInt(200 - 100) + 100;
        int damage = rand.nextInt(100 - 50) + 50;
        setHealth(health);
        setDamage(damage);
        setRank('B');

        int randomIndex = rand.nextInt(botNames.botNames().size());
        int randomIndex2 = rand.nextInt(botNames.botNames().size());
        randomName = (String) botNames.botNames().get(randomIndex);
        randomAddOn = (String) botNames.botNames().get(randomIndex2);
        setName(randomName + " " + randomAddOn);
    }

    public void grandMasterBot() {
        int health = rand.nextInt(500 - 250) + 250;
        int damage = rand.nextInt(200 - 100) + 100;
        setHealth(health);
        setDamage(damage);
        setRank('A');

        int randomIndex = rand.nextInt(botNames.botNames().size());
        int randomIndex2 = rand.nextInt(botNames.botNames().size());
        randomName = (String) botNames.botNames().get(randomIndex);
        randomAddOn = (String) botNames.botNames().get(randomIndex2);
        setName(randomName + " " + randomAddOn);
    }

    public void FinalBoss() {
        int health = rand.nextInt(1000 - 750) + 750;
        int damage = rand.nextInt(500 - 200) + 200;
        setHealth(health);
        setDamage(damage);
        setRank('S');

        int randomIndex = rand.nextInt(botNames.botNames().size());
        int randomIndex2 = rand.nextInt(botNames.botNames().size());
        randomName = (String) botNames.botNames().get(randomIndex);
        randomAddOn = (String) botNames.botNames().get(randomIndex2);
        setName(randomName + " " + randomAddOn);
    }
   

}
