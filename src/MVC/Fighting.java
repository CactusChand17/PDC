/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

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
    Database database = new Database();
    playerData playerdata = new playerData();

    //sets the orginal health of player
    int orginalHealth = Player.getHealth();

    private int botLevel;

    public static void main(String[] args) {
        Fighting fight = new Fighting();
        fight.fight();
    }

    public void fight() {
        //sets bots up
        //Player = menu.getCharacter();
        //menu.setCharacter(Player);
        moderate.moderateBot();
        hard.hardBot();
        superhard.grandMasterBot();
        finalboss.FinalBoss();
        //setBotLevel(1);
        switch (getBotLevel()) {
            case 1:
                checker();
                this.easy();
                break;
            case 2:
                checker();
                this.moderate();
                break;
            case 3:
                checker();
                this.hard();
                break;
            case 4:
                checker();
                this.superhard();
                break;
            case 5:
                checker();
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

        fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
        fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
        fightingMenu.getAttack1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
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
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (easy.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
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
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (easy.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Lightning");
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
                    easy.setHealth(easy.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
                if (easy.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - easy.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (easy.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
                    easy.setHealth(easy.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
                    easy.setHealth(easy.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(easy.getHealth()));
                if (easy.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - easy.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (easy.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }

            }
        });

        fightingMenu.getFightingMenuBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

        fightingMenu.getFightingQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                database.saveStats(playerdata.getWins(), playerdata.getUsername());
                System.exit(0);
            }

        });

        fightingMenu.getFightingRestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });
    }

    //rest are repeated but different boss difficulty 
    public void moderate() {
        moderate.moderateBot();
        //tells name and difficulty of boss
        System.out.println("Fighting Moderate Enemy");
        System.out.println(moderate.getName());
        FightingMenu fightingMenu = new FightingMenu();
        fightingMenu.setVisible(true);
        fightingMenu.pack();
        fightingMenu.setLocationRelativeTo(null);

        fightingMenu.getBotHealth().setText(String.valueOf(moderate.getHealth()));
        fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
        fightingMenu.getAttack1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
                    moderate.setHealth(moderate.getHealth() - damage);

                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
                    moderate.setHealth(moderate.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(moderate.getHealth()));
                if (moderate.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - moderate.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (moderate.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
                    moderate.setHealth(moderate.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(moderate.getHealth()));
                if (moderate.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - moderate.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (moderate.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Lightning");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
                    moderate.setHealth(moderate.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(moderate.getHealth()));
                if (moderate.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - moderate.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (moderate.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
                    moderate.setHealth(moderate.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
                    moderate.setHealth(moderate.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(moderate.getHealth()));
                if (moderate.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - moderate.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (moderate.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }

            }
        });

        fightingMenu.getFightingMenuBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

        fightingMenu.getFightingQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                database.saveStats(playerdata.getWins(), playerdata.getUsername());
                System.exit(0);
            }

        });

        fightingMenu.getFightingRestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

    }

    public void hard() {
        hard.hardBot();
        //tells name and difficulty of boss
        System.out.println("Fighting Hard Enemy");
        System.out.println(hard.getName());
        FightingMenu fightingMenu = new FightingMenu();
        fightingMenu.setVisible(true);
        fightingMenu.pack();
        fightingMenu.setLocationRelativeTo(null);

        fightingMenu.getBotHealth().setText(String.valueOf(hard.getHealth()));
        fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
        fightingMenu.getAttack1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
                    hard.setHealth(hard.getHealth() - damage);

                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
                    hard.setHealth(hard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(hard.getHealth()));
                if (hard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - hard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (hard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
                    hard.setHealth(hard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(hard.getHealth()));
                if (hard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - hard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (hard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Lightning");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
                    hard.setHealth(hard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(hard.getHealth()));
                if (hard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - hard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (hard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();

                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
                    hard.setHealth(hard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
                    hard.setHealth(hard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(hard.getHealth()));
                if (hard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - hard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (hard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }

            }
        });

        fightingMenu.getFightingMenuBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

        fightingMenu.getFightingQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                database.saveStats(playerdata.getWins(), playerdata.getUsername());
                System.exit(0);
            }

        });

        fightingMenu.getFightingRestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });
    }

    public void superhard() {

        superhard.grandMasterBot();
        //tells name and difficulty of boss
        System.out.println("Fighting SuperHard Enemy");
        System.out.println(superhard.getName());
        FightingMenu fightingMenu = new FightingMenu();
        fightingMenu.setVisible(true);
        fightingMenu.pack();
        fightingMenu.setLocationRelativeTo(null);

        fightingMenu.getBotHealth().setText(String.valueOf(superhard.getHealth()));
        fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
        fightingMenu.getAttack1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
                    superhard.setHealth(superhard.getHealth() - damage);

                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
                    superhard.setHealth(superhard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(superhard.getHealth()));
                if (superhard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - superhard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (superhard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
                    superhard.setHealth(superhard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(superhard.getHealth()));
                if (superhard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - superhard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (superhard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Lightning");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
                    superhard.setHealth(superhard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(superhard.getHealth()));
                if (superhard.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - superhard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (superhard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();

                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
                    superhard.setHealth(superhard.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
                    superhard.setHealth(superhard.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(superhard.getHealth()));
                if (finalboss.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - superhard.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (superhard.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }

            }
        });

        fightingMenu.getFightingMenuBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

        fightingMenu.getFightingQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                database.saveStats(playerdata.getWins(), playerdata.getUsername());
                System.exit(0);
            }

        });

        fightingMenu.getFightingRestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });
    }

    public void finalboss() {

        finalboss.FinalBoss();
        //tells name and difficulty of boss
        System.out.println("Fighting Hardest Enemy");
        System.out.println(finalboss.getName());
        FightingMenu fightingMenu = new FightingMenu();
        fightingMenu.setVisible(true);
        fightingMenu.pack();
        fightingMenu.setLocationRelativeTo(null);

        fightingMenu.getBotHealth().setText(String.valueOf(finalboss.getHealth()));
        fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
        fightingMenu.getAttack1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Neutral");
                    finalboss.setHealth(finalboss.getHealth() - damage);

                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Neutral");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Neutral");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(finalboss.getHealth()));
                if (finalboss.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - finalboss.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (finalboss.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();

                }
            }
        });

        fightingMenu.getAttack2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Heavy");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Heavy");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Heavy");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(finalboss.getHealth()));
                if (finalboss.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - finalboss.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (finalboss.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Lightning");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("Sneak");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Sheild");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(finalboss.getHealth()));
                if (finalboss.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - finalboss.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (finalboss.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }
            }
        });

        fightingMenu.getAttack4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warmogs();
                fairy();
                if (Player.getPlayerClass() == Player.getClasses().Mage()) {
                    Integer damage = (Integer) Player.getClasses().Mage().get("Storm");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Rogue()) {
                    Integer damage = (Integer) Player.getClasses().Rogue().get("DeathDance");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                } else if (Player.getPlayerClass() == Player.getClasses().Warrior()) {
                    Integer damage = (Integer) Player.getClasses().Warrior().get("Barrage");
                    finalboss.setHealth(finalboss.getHealth() - damage);
                }
                fightingMenu.getBotHealth().setText(String.valueOf(finalboss.getHealth()));
                if (finalboss.getHealth() > 0) {
                    Player.setHealth(Player.getHealth() - finalboss.getDamage());
                }
                fightingMenu.getHealth().setText(String.valueOf(Player.getHealth()));
                if (Player.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You Lose", "You Lose", 2);
                    database.saveStats(playerdata.getWins(), playerdata.getUsername());
                    System.exit(0);
                } else if (finalboss.getHealth() <= 0) {
                    JOptionPane.showMessageDialog(fightingMenu.getRootPane(), "You win", "You win", 2);
                    playerdata.setWins(playerdata.getWins() + 1);
                    addingStats();
                    playerdata.character = Player;
                    fightingMenu.hide();
                }

            }
        });

        fightingMenu.getFightingMenuBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });

        fightingMenu.getFightingQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                database.saveStats(playerdata.getWins(), playerdata.getUsername());
                System.exit(0);
            }

        });

        fightingMenu.getFightingRestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightingMenu.hide();
            }

        });
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
