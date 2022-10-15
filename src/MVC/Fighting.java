/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manu2
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author manu2
 */
public class Fighting {

    //Creating new Bot objects
    Bot easy = new Bot();
    Bot moderate = new Bot();
    Bot hard = new Bot();
    Bot superhard = new Bot();
    Bot finalboss = new Bot();

    //Adding Player object
    Character Player = new Character();
    //Calling items class
    Items items = new Items();
    //Random
    Random rand = new Random();

    //sets the orginal health of player
    int orginalHealth = Player.getHealth();

    //list for abilitys
    ArrayList<String> list = new ArrayList<>();
    //file for abilitys used
    File file = new File("./resources/AbilitysUsed.txt");
    //writefile class
    //WriteFile writeFile = new WriteFile();

    public void fight() {
        //sets bots up
        easy.easyBot();
        moderate.moderateBot();
        hard.hardBot();
        superhard.grandMasterBot();
        finalboss.FinalBoss();

        //Scanner for scanning input
        Scanner scan = new Scanner(System.in);
        String input = " ";

        while (input != null) {
            //printing out the options
            System.out.println("Enter: \n 1: Easy \n 2: Moderate \n 3: Hard \n 4: SuperHard \n 5: Final \n Press x to exit");
            input = scan.nextLine();

            //checking if the player wants to quit
            if ("x".equals(input)) {

                System.out.println("Exiting");
                //add to the exit menu****
                Player.setHealth(0);
                input = null;
                //if input is equal to the number
            } else if ("1".equals(input) || "2".equals(input) || "3".equals(input) || "4".equals(input) || "5".equals(input)) {
                //Parsing the string to int
                int number = Integer.parseInt(input);

                //switch case for choosen option
                switch (number) {
                    case 1:
                        //goes into the easy boss
                        this.easy();
                        //add stats if won
                        this.addingStats();
                        input = null;
                        break;
                    case 2:
                        //goes into the moderate boss
                        this.moderate();
                        //add stats if won
                        this.addingStats();
                        input = null;
                        break;
                    case 3:
                        //goes into the hard boss
                        this.hard();
                        //add stats if won
                        this.addingStats();
                        input = null;
                        break;
                    case 4:
                        //goes into the superhard boss
                        this.superhard();
                        //add stats if won
                        this.addingStats();
                        input = null;
                        break;
                    case 5:
                        //goes into the final boss
                        this.finalboss();
                        //add stats if won
                        this.addingStats();
                        input = null;
                        break;
                    default:
                        break;
                }

            } else {
                //if the input does not equal correctly
                System.out.println("Enter correct input");
            }
        }
        //checks if the player item list contains holy grail or eclipse and it adds its stats
        //then also removes them from both items and player items because it adds the stat once
        if (Player.items.contains("Holy Grail")) {
            Player.getClasses().setNeutral(Player.getClasses().getNeutral() + 50);
            Player.getClasses().setHeavy(Player.getClasses().getHeavy() + 50);
            Player.getClasses().setAbility1(Player.getClasses().getAbility1() + 50);
            Player.getClasses().setAbility2(Player.getClasses().getAbility2() + 50);
            Player.items.remove("Holy Grail");
            items.Items.remove("Holy Grail");
        } else if (Player.items.contains("Eclipse")) {
            Player.getClasses().setNeutral(Player.getClasses().getNeutral() + 100);
            Player.getClasses().setHeavy(Player.getClasses().getHeavy() + 100);
            Player.getClasses().setAbility1(Player.getClasses().getAbility1() + 100);
            Player.getClasses().setAbility2(Player.getClasses().getAbility2() + 100);
            Player.items.remove("Eclipse");
            items.Items.remove("Eclipse");
        }

    }

    public void easy() {
        Scanner scan = new Scanner(System.in);
        //tells name and difficulty of boss
        System.out.println("Fighting Easy Enemy");
        System.out.println(easy.getName());
        //loops while player health or boss health is greater than 0
        while (Player.getHealth() > 0 || easy.getHealth() > 0) {
            //shows player class
            System.out.println(Player.getPlayerClass());
            //asking for input
            System.out.println("Enter ability name e.g 'Heavy': ");
            String stringInput = scan.nextLine();
            //if statement checks if the input has the correct key
            if (Player.getPlayerClass().containsKey(stringInput)) {
                //adds key to arraylist
                list.add(stringInput);
                //checks what the player class is
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    //from the class it takes the damage of the ability
                    Integer damage = (Integer) Player.getClasses().Mage().get(stringInput);
                    //sets the health of bot minus the damage
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get(stringInput);
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get(stringInput);
                    easy.setHealth(easy.getHealth() - damage);
                }

                //if the bosses health is still above 0
                if (easy.getHealth() > 0) {
                    //show boss health
                    System.out.println("Boss Health: " + easy.getHealth());
                    //do damage to player
                    Player.setHealth(Player.getHealth() - easy.getDamage());
                } else {
                    //breaks loop
                    break;
                }
                //if the players health is above 0
                if (Player.getHealth() > 0) {
                    //show player health
                    System.out.println("Your Health: " + Player.getHealth());
                } else {
                    //breaks loop
                    break;
                }
                //checks if the player has fairy or warmogs item
                //they are in the loop cause they can stack
                this.fairy();
                this.warmogs();

                //if the input is not equal to the key
            } else {
                System.out.println("Enter correct input");
            }
        }
    }

    //rest are repeated but different boss difficulty 
    public void moderate() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fighting Moderate Enemy");
        System.out.println(moderate.getName());
        while (Player.getHealth() > 0 || moderate.getHealth() > 0) {
            System.out.println(Player.getPlayerClass());
            System.out.println("Enter ability name e.g 'Heavy': ");
            String stringInput = scan.nextLine();
            if (Player.getPlayerClass().containsKey(stringInput)) {
                list.add(stringInput);
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get(stringInput);
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get(stringInput);
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get(stringInput);
                    moderate.setHealth(moderate.getHealth() - damage);
                }

                if (moderate.getHealth() > 0) {
                    System.out.println("Boss Health: " + moderate.getHealth());
                    Player.setHealth(Player.getHealth() - moderate.getDamage());
                } else {
                    break;
                }
                if (Player.getHealth() > 0) {
                    System.out.println("Your Health: " + Player.getHealth());
                } else {
                    break;
                }
                this.fairy();
                this.warmogs();

            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void hard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fighting Hard Enemy");
        System.out.println(hard.getName());
        while (Player.getHealth() > 0 || hard.getHealth() > 0) {
            System.out.println(Player.getPlayerClass());
            System.out.println("Enter ability name e.g 'Heavy': ");
            String stringInput = scan.nextLine();
            if (Player.getPlayerClass().containsKey(stringInput)) {
                list.add(stringInput);
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get(stringInput);
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get(stringInput);
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get(stringInput);
                    hard.setHealth(hard.getHealth() - damage);
                }

                if (hard.getHealth() > 0) {
                    System.out.println("Boss Health: " + hard.getHealth());
                    Player.setHealth(Player.getHealth() - hard.getDamage());
                } else {
                    break;
                }
                if (Player.getHealth() > 0) {
                    System.out.println("Your Health: " + Player.getHealth());
                } else {
                    break;
                }
                this.fairy();
                this.warmogs();

            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void superhard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fighting SuperHard Enemy");
        System.out.println(superhard.getName());
        while (Player.getHealth() >= 0 || superhard.getHealth() > 0) {
            System.out.println(Player.getPlayerClass());
            System.out.println("Enter ability name e.g 'Heavy': ");
            String stringInput = scan.nextLine();
            if (Player.getPlayerClass().containsKey(stringInput)) {
                list.add(stringInput);
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get(stringInput);
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get(stringInput);
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get(stringInput);
                    superhard.setHealth(superhard.getHealth() - damage);
                }

                if (superhard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - superhard.getDamage());
                } else {
                    break;
                }

                if (Player.getHealth() > 0) {
                    System.out.println("Boss Health: " + superhard.getHealth());
                    System.out.println("Your Health: " + Player.getHealth());
                } else {
                    break;
                }
                this.fairy();
                this.warmogs();

            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void finalboss() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fighting FinalBoss Enemy");
        System.out.println(finalboss.getName());
        while (Player.getHealth() > 0 || finalboss.getHealth() > 0) {

            System.out.println(Player.getPlayerClass());
            System.out.println("Enter ability name e.g 'Heavy': ");
            String stringInput = scan.nextLine();
            if (Player.getPlayerClass().containsKey(stringInput)) {
                list.add(stringInput);
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get(stringInput);
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get(stringInput);
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get(stringInput);
                    finalboss.setHealth(finalboss.getHealth() - damage);
                }

                if (finalboss.getHealth() > 0) {
                    System.out.println("Boss Health: " + finalboss.getHealth());
                    Player.setHealth(Player.getHealth() - finalboss.getDamage());
                } else {
                    break;
                }

                if (Player.getHealth() > 0) {
                    System.out.println("Your Health: " + Player.getHealth());
                } else {
                    break;
                }

                this.fairy();
                this.warmogs();

            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void fairy() {
        //if the player has item fairy. add its passive
        if (Player.items.contains("Fairy")) {
            Player.getClasses().setNeutral(Player.getClasses().getNeutral() + 20);
            Player.getClasses().setHeavy(Player.getClasses().getHeavy() + 20);
            Player.getClasses().setAbility1(Player.getClasses().getAbility1() + 20);
            Player.getClasses().setAbility2(Player.getClasses().getAbility2() + 20);
        }
    }

    public void warmogs() {
        //if the player has item warmogs. add its passive
        if (Player.items.contains("Warmogs")) {
            Player.setHealth(Player.getHealth() + 20);
        }
    }

    //adds stats
    public void addingStats() {
        //if the player health is still greater than 0       
        if (Player.getHealth() > 0) {
            System.out.println("You won");
            //adds more health
            orginalHealth = orginalHealth * 2;
            Player.setHealth(orginalHealth);
            //Setting abilitys of class higher in damage after the fight
            Player.getClasses().setNeutral(Player.getClasses().getNeutral() * 2);
            Player.getClasses().setHeavy(Player.getClasses().getHeavy() * 2);
            Player.getClasses().setAbility1(Player.getClasses().getAbility1() * 2);
            Player.getClasses().setAbility2(Player.getClasses().getAbility2() * 2);
            //adds more exp
            Player.setExp(Player.getExp() + 20);
            //add random item
            addItems();
            //write the abilitys list to the file
            //writeFile.write(file, list);
        }
    }

    //adds items
    public void addItems() {
        //chooses a random item from the item class
        int randomIndex = rand.nextInt(items.itemNames().size());
        String randomItem = (String) items.itemNames().get(randomIndex);
        //adds it to the player item list
        Player.items.add(randomItem);
    }

}


