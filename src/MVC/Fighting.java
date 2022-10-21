/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private int botLevel;
    private int attack1 = 1;
    private final int attack2 = 2;
    private final int attack3 = 3;
    private final int attack4 = 4;

    public static void main(String[] args) {
        Fighting fight = new Fighting();
        fight.fight();
    }

    public void fight() {
        //sets bots up

        moderate.moderateBot();
        hard.hardBot();
        superhard.grandMasterBot();
        finalboss.FinalBoss();
        setBotLevel(1);
        switch (getBotLevel()) {
            case 1:
                this.easy();
                break;
            case 2:
                this.moderate();
                break;
            case 3:
                this.hard();
                break;
            case 4:
                this.superhard();
                break;
            case 5:
                this.finalboss();
                break;
            default:
                break;
        }

    }

    public void checker() {
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
        easy.easyBot();
        //tells name and difficulty of boss
        System.out.println("Fighting Easy Enemy");
        System.out.println(easy.getName());
        FightingMenu fightingMenu = new FightingMenu();
        fightingMenu.setVisible(true);
        fightingMenu.pack();
        fightingMenu.setLocationRelativeTo(null);

        Player.setPlayerClass(Player.getClasses().Mage());
        while (Player.getHealth() > 0 || easy.getHealth() > 0) {
            fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
            fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
            fightingMenu.getAttack1().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                        Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
                        easy.setHealth(easy.getHealth() - damage);

                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                        Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
                        easy.setHealth(easy.getHealth() - damage);
                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                        Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
                        easy.setHealth(easy.getHealth() - damage);
                    }
                    fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
                    if (easy.getHealth() > 0) {
                        Player.setHealth(Player.getHealth() - easy.getDamage());
                    }
                    fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));

                }
            });

            fightingMenu.getAttack2().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                        Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
                        easy.setHealth(easy.getHealth() - damage);
                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                        Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
                        easy.setHealth(easy.getHealth() - damage);
                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                        Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
                        easy.setHealth(easy.getHealth() - damage);
                    }
                    fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
                    if (easy.getHealth() > 0) {
                        Player.setHealth(Player.getHealth() - easy.getDamage());
                    }
                    fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                }
            });

//            switch (attack1) {
//                case 1:
//                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
//                        Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
//                        easy.setHealth(easy.getHealth() - damage);          
//                        fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
//                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
//                        Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
//                        Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
//                        easy.setHealth(easy.getHealth() - damage);
//                    }
//                    break;
//                case 2:
//                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
//                        Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
//                        Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
//                        Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
//                        easy.setHealth(easy.getHealth() - damage);
//                    }
//                    break;
//                case 3:
//                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
//                        Integer damage = (Integer) Player.getClasses().Mage().get("Lighting");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
//                        Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
//                        Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
//                        easy.setHealth(easy.getHealth() - damage);
//                    }
//                    break;
//                case 4:
//                    if (Player.getPlayerClass() == Player.getClasses().Mage()) {
//                        Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
//                        Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
//                        easy.setHealth(easy.getHealth() - damage);
//                    } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
//                        Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
//                        easy.setHealth(easy.getHealth() - damage);
//                    }
//                    break;
//                default:
//                    break;
//            }
            break;
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

    /**
     * @return the botLevel
     */
    public int getBotLevel() {
        return botLevel;
    }

    /**
     * @param botLevel the botLevel to set
     */
    public void setBotLevel(int botLevel) {
        this.botLevel = botLevel;
    }

}
