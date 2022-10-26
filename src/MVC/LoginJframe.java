/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author manu2
 */
public class LoginJframe extends JFrame {

    private final int trainingNumber = 10;
    private Character character = new Character();
    Character newCharacter = character;
    Training train = new Training(trainingNumber);
    Fighting fight = new Fighting();
    private boolean reset;

    //login
    private javax.swing.JTextField Age;
    private javax.swing.JButton Login;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Quit;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bossfightsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;

    //classselectionMenu
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel classesJPanel;
    private javax.swing.JButton classesQuit;
    private javax.swing.JButton mageButton;
    private javax.swing.JButton rogueButton;
    private javax.swing.JButton warriorButton;

    //MainMenu
    private javax.swing.JButton CheckStats;
    private javax.swing.JButton Fighting;
    private javax.swing.JPanel MainMenuJPanel;
    private javax.swing.JButton Training;
    private javax.swing.JButton mainMenuQuit;
    private javax.swing.JButton mainRestart;

    //StatsMenu
    private javax.swing.JLabel EXP;
    private javax.swing.JLabel ExpLabel;
    private javax.swing.JLabel ItemLabel;
    private javax.swing.JLabel Items;
    private javax.swing.JLabel Rank;
    private javax.swing.JLabel RankLabel1;
    private javax.swing.JPanel StatsJPanel;
    private javax.swing.JLabel StatsLabel;
    private javax.swing.JLabel classes;
    private javax.swing.JButton menuBackStats;
    private javax.swing.JButton statsQuit;
    private javax.swing.JButton statsRestart;

    //TrainingMenu
    private javax.swing.JPanel TrainingJPanel;
    private javax.swing.JLabel TrainingLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel trainingExp;
    private javax.swing.JLabel trainingExpLabel;
    private javax.swing.JButton trainingMenuBack;
    private javax.swing.JButton trainingQuit;
    private javax.swing.JButton trainingRestart;
    private javax.swing.JButton updateButton;

    //SelectionMenu
    private javax.swing.JPanel SelectionJPanel;
    private javax.swing.JButton bossBot;
    private javax.swing.JButton easyBot;
    private javax.swing.JButton hardBot;
    private javax.swing.JButton moderateBot;
    private javax.swing.JButton selectionMenuBack;
    private javax.swing.JButton selectionQuit;
    private javax.swing.JButton selectionRestart;
    private javax.swing.JButton superHardBot;

    public void loginInit() {
        jPanel1 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        bossfightsLabel = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ageLabel.setText("Age");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        bossfightsLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        bossfightsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bossfightsLabel.setText("Boss Fights");

        Login.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Login.setText("Login");

        Quit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        Quit.setText("Quit");
        Quit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == Quit) {
                System.exit(0);
            }

        });

        Login.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (reset == true) {
                setCharacter(newCharacter);
                setReset(false);
            }
            Object source = evt.getSource();
            String username = Username.getText();
            String password = String.valueOf(Password.getText());
            String age = String.valueOf(Age.getText());
            if (source == Login) {
                if (username.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter Username", "Empty Username", 2);
                } else if (password.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter Password", "Empty Password", 2);
                } else if (age.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter Age", "Empty Age", 2);
                } else {
                    //start connect with database
                    this.jPanel1.hide();
                    this.classSelectionInit();

                }

            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(242, 242, 242)
                                                .addComponent(bossfightsLabel))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordLabel)
                                                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ageLabel)
                                                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 282, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(263, 263, 263)
                                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(bossfightsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(usernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(ageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(Quit)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        // this.add(jPanel1, BorderLayout.CENTER);
        setPreferredSize(getPreferredSize());
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void classSelectionInit() {
        classesJPanel = new javax.swing.JPanel();
        classLabel = new javax.swing.JLabel();
        mageButton = new javax.swing.JButton();
        rogueButton = new javax.swing.JButton();
        warriorButton = new javax.swing.JButton();
        classesQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        classLabel.setText("Classes");

        mageButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        mageButton.setText("Mage");
        mageButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            getCharacter().setPlayerClass(getCharacter().getClasses().Mage());
            mainMenuInit();
            this.classesJPanel.hide();
        });

        rogueButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        rogueButton.setText("Rogue");
        rogueButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            getCharacter().setPlayerClass(getCharacter().getClasses().Rogue());
            mainMenuInit();
            this.classesJPanel.hide();
        });

        warriorButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        warriorButton.setText("Warrior");
        warriorButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            getCharacter().setPlayerClass(getCharacter().getClasses().Warrior());
            mainMenuInit();
            this.classesJPanel.hide();
        });

        classesQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        classesQuit.setText("Quit");
        classesQuit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == classesQuit) {
                System.exit(0);
            }
        });

        javax.swing.GroupLayout classesJPanelLayout = new javax.swing.GroupLayout(classesJPanel);
        classesJPanel.setLayout(classesJPanelLayout);
        classesJPanelLayout.setHorizontalGroup(
                classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(classesJPanelLayout.createSequentialGroup()
                                .addGroup(classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(classesJPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(classesQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(classesJPanelLayout.createSequentialGroup()
                                                .addGap(244, 244, 244)
                                                .addGroup(classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(classesJPanelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(warriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(rogueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(238, Short.MAX_VALUE))
        );
        classesJPanelLayout.setVerticalGroup(
                classesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesJPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(mageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rogueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(classesQuit))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(classesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(classesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        //this.add(classesJPanel, BorderLayout.CENTER);
        setPreferredSize(getPreferredSize());
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void mainMenuInit() {
        MainMenuJPanel = new javax.swing.JPanel();
        Fighting = new javax.swing.JButton();
        Training = new javax.swing.JButton();
        CheckStats = new javax.swing.JButton();
        mainMenuQuit = new javax.swing.JButton();
        mainRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fighting.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Fighting.setText("Fighting");
        Fighting.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == Fighting) {
                selectionMenuInit();
                this.MainMenuJPanel.hide();
            }
        });

        Training.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Training.setText("Training");
        Training.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();

            if (source == Training) {
                trainingMenuInit();
                this.MainMenuJPanel.hide();
            }
        });

        CheckStats.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CheckStats.setText("Stats");
        CheckStats.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == CheckStats) {
                statsMenuInit();

                EXP.setText(String.valueOf(getCharacter().getExp()));
                Rank.setText(String.valueOf(getCharacter().getRank()));
                Items.setText(String.valueOf(getCharacter().items));
                classes.setText(String.valueOf(getCharacter().getClasses().type));

                this.MainMenuJPanel.hide();
            }
        });

        mainMenuQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        mainMenuQuit.setText("Quit");
        mainMenuQuit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == mainMenuQuit) {
                System.exit(0);
            }
        });

        mainRestart.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        mainRestart.setText("Restart");
        mainRestart.addActionListener((java.awt.event.ActionEvent evt) -> {
            setReset(true);
            loginInit();
            this.MainMenuJPanel.hide();
        });
        javax.swing.GroupLayout MainMenuJPanelLayout = new javax.swing.GroupLayout(MainMenuJPanel);
        MainMenuJPanel.setLayout(MainMenuJPanelLayout);
        MainMenuJPanelLayout.setHorizontalGroup(
                MainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainMenuJPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(mainMenuQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainRestart)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuJPanelLayout.createSequentialGroup()
                                .addContainerGap(246, Short.MAX_VALUE)
                                .addGroup(MainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Fighting, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Training, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CheckStats, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(228, 228, 228))
        );
        MainMenuJPanelLayout.setVerticalGroup(
                MainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainMenuJPanelLayout.createSequentialGroup()
                                .addContainerGap(127, Short.MAX_VALUE)
                                .addComponent(Fighting, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(Training, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(CheckStats, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addGroup(MainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mainMenuQuit)
                                        .addComponent(mainRestart))
                                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainMenuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainMenuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        //this.add(MainMenuJPanel, BorderLayout.CENTER);
        setPreferredSize(getPreferredSize());
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void statsMenuInit() {
        StatsJPanel = new javax.swing.JPanel();
        classes = new javax.swing.JLabel();
        ItemLabel = new javax.swing.JLabel();
        Items = new javax.swing.JLabel();
        EXP = new javax.swing.JLabel();
        ExpLabel = new javax.swing.JLabel();
        RankLabel1 = new javax.swing.JLabel();
        Rank = new javax.swing.JLabel();
        StatsLabel = new javax.swing.JLabel();
        menuBackStats = new javax.swing.JButton();
        statsQuit = new javax.swing.JButton();
        statsRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classes.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        classes.setText("None");

        ItemLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        ItemLabel.setText("Items:");

        Items.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Items.setText("None");

        EXP.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        EXP.setText(String.valueOf(getCharacter().getExp()));

        ExpLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        ExpLabel.setText("EXP:");

        RankLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        RankLabel1.setText("Rank:");

        Rank.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Rank.setText(String.valueOf(getCharacter().getRank()));

        StatsLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        StatsLabel.setText("Stats");

        statsRestart.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        statsRestart.setText("Restart");
        statsRestart.addActionListener((java.awt.event.ActionEvent evt) -> {
            setReset(true);
            loginInit();
            this.StatsJPanel.hide();
        });

        menuBackStats.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        menuBackStats.setText("Menu");
        menuBackStats.addActionListener((java.awt.event.ActionEvent evt) -> {
            mainMenuInit();
            this.StatsJPanel.hide();
        });

        statsQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        statsQuit.setText("Quit");
        statsQuit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == statsQuit) {
                System.exit(0);
            }
        });

        javax.swing.GroupLayout StatsJPanelLayout = new javax.swing.GroupLayout(StatsJPanel);
        StatsJPanel.setLayout(StatsJPanelLayout);
        StatsJPanelLayout.setHorizontalGroup(
                StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatsJPanelLayout.createSequentialGroup()
                                                .addComponent(menuBackStats, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                                .addComponent(StatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(319, 319, 319))
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addComponent(statsQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(statsRestart)
                                                .addContainerGap())))
                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addComponent(ItemLabel)
                                                .addGap(56, 56, 56)
                                                .addComponent(Items)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StatsJPanelLayout.createSequentialGroup()
                                                                .addComponent(ExpLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(EXP))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StatsJPanelLayout.createSequentialGroup()
                                                                .addComponent(RankLabel1)
                                                                .addGap(59, 59, 59)
                                                                .addComponent(Rank)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(classes)
                                                .addGap(76, 76, 76))))
        );
        StatsJPanelLayout.setVerticalGroup(
                StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(StatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(menuBackStats)))
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RankLabel1)
                                                        .addComponent(Rank))
                                                .addGap(67, 67, 67))
                                        .addGroup(StatsJPanelLayout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(classes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)))
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ExpLabel)
                                        .addComponent(EXP))
                                .addGap(25, 25, 25)
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ItemLabel)
                                        .addComponent(Items))
                                .addGap(10, 10, 10)
                                .addGroup(StatsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(statsQuit)
                                        .addComponent(statsRestart))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(StatsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StatsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        setPreferredSize(getPreferredSize());
        this.add(StatsJPanel, BorderLayout.CENTER);
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void trainingMenuInit() {
        TrainingJPanel = new javax.swing.JPanel();
        TrainingLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        trainingQuit = new javax.swing.JButton();
        trainingExpLabel = new javax.swing.JLabel();
        trainingExp = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        trainingMenuBack = new javax.swing.JButton();
        trainingRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TrainingLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        TrainingLabel.setText("Training");

        startButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == startButton) {
                startButton.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Training Started", "Training", 2);
                Thread thread = new Thread(train);
                thread.start();
                try {
                    thread.sleep(10000);

                } catch (InterruptedException ex) {
                    System.out.println("The sleeping has been interruped!");
                }

                train.trainPlayer();
            }
            updateButton.setVisible(true);
        });

        trainingQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        trainingQuit.setText("Quit");
        trainingQuit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == trainingQuit) {
                System.exit(0);
            }
        });

        trainingExpLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        trainingExpLabel.setText("Exp");

        trainingExp.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        trainingExp.setText("");

        updateButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == updateButton) {
                getCharacter().setExp(getCharacter().getExp() + train.getExp());
                trainingExp.setText(String.valueOf(train.getExp()));
                startButton.setVisible(true);
            }
            updateButton.setVisible(false);
        });

        trainingMenuBack.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        trainingMenuBack.setText("Menu");
        trainingMenuBack.addActionListener((java.awt.event.ActionEvent evt) -> {
            mainMenuInit();
            this.TrainingJPanel.hide();
        });

        trainingRestart.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        trainingRestart.setText("Restart");
        trainingRestart.addActionListener((java.awt.event.ActionEvent evt) -> {
            setReset(true);
            loginInit();
            this.TrainingJPanel.hide();
        });

        javax.swing.GroupLayout TrainingJPanelLayout = new javax.swing.GroupLayout(TrainingJPanel);
        TrainingJPanel.setLayout(TrainingJPanelLayout);
        TrainingJPanelLayout.setHorizontalGroup(
                TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(trainingQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(trainingMenuBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(trainingRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                                .addGap(301, 301, 301)
                                                .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TrainingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(trainingExp)
                                                                        .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                                .addGap(366, 366, 366)
                                                .addComponent(trainingExpLabel)))
                                .addContainerGap(307, Short.MAX_VALUE))
        );
        TrainingJPanelLayout.setVerticalGroup(
                TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TrainingJPanelLayout.createSequentialGroup()
                                .addComponent(trainingMenuBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TrainingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(startButton)
                                .addGap(46, 46, 46)
                                .addComponent(updateButton)
                                .addGap(29, 29, 29)
                                .addComponent(trainingExpLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trainingExp)
                                .addGap(42, 42, 42)
                                .addGroup(TrainingJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(trainingQuit)
                                        .addComponent(trainingRestart)))
        );

        updateButton.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TrainingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TrainingJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        //this.add(TrainingJPanel, BorderLayout.CENTER);
        setPreferredSize(getPreferredSize());
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void selectionMenuInit() {
        SelectionJPanel = new javax.swing.JPanel();
        easyBot = new javax.swing.JButton();
        moderateBot = new javax.swing.JButton();
        hardBot = new javax.swing.JButton();
        superHardBot = new javax.swing.JButton();
        bossBot = new javax.swing.JButton();
        selectionQuit = new javax.swing.JButton();
        selectionRestart = new javax.swing.JButton();
        selectionMenuBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        easyBot.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        easyBot.setText("Easy");
        easyBot.setPreferredSize(new java.awt.Dimension(43, 43));
        easyBot.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.SelectionJPanel.hide();
            this.hide();
            fight.setBotLevel(1);
            fight.Player = getCharacter();
            fight.fight();

        });

        moderateBot.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        moderateBot.setText("Moderate");
        moderateBot.setPreferredSize(new java.awt.Dimension(43, 43));
        moderateBot.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.SelectionJPanel.hide();
            this.hide();
            fight.setBotLevel(2);
            fight.Player = getCharacter();
            fight.fight();

        });

        hardBot.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        hardBot.setText("Hard");
        hardBot.setPreferredSize(new java.awt.Dimension(43, 43));
        hardBot.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.SelectionJPanel.hide();
            this.hide();
            fight.setBotLevel(3);
            fight.Player = getCharacter();
            fight.fight();

        });

        superHardBot.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        superHardBot.setText("Superhard");
        superHardBot.setPreferredSize(new java.awt.Dimension(43, 43));
        superHardBot.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.SelectionJPanel.hide();
            this.hide();
            fight.setBotLevel(4);
            fight.Player = getCharacter();
            fight.fight();

        });

        bossBot.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        bossBot.setText("Boss");
        bossBot.setPreferredSize(new java.awt.Dimension(43, 43));
        bossBot.addActionListener((java.awt.event.ActionEvent evt) -> {
            this.SelectionJPanel.hide();
            this.hide();
            fight.setBotLevel(5);
            fight.Player = getCharacter();
            fight.fight();

        });

        selectionQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        selectionQuit.setText("Quit");
        selectionQuit.addActionListener((java.awt.event.ActionEvent evt) -> {
            Object source = evt.getSource();
            if (source == selectionQuit) {
                System.exit(0);
            }
        });

        selectionRestart.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        selectionRestart.setText("Restart");
        selectionRestart.addActionListener((java.awt.event.ActionEvent evt) -> {
            setReset(true);
            loginInit();
            this.SelectionJPanel.hide();
        });

        selectionMenuBack.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        selectionMenuBack.setText("Menu");
        selectionMenuBack.addActionListener((java.awt.event.ActionEvent evt) -> {
            mainMenuInit();
            this.SelectionJPanel.hide();
        });

        javax.swing.GroupLayout SelectionJPanelLayout = new javax.swing.GroupLayout(SelectionJPanel);
        SelectionJPanel.setLayout(SelectionJPanelLayout);
        SelectionJPanelLayout.setHorizontalGroup(
                SelectionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SelectionJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SelectionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(SelectionJPanelLayout.createSequentialGroup()
                                                .addComponent(selectionQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(selectionRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(SelectionJPanelLayout.createSequentialGroup()
                                                .addComponent(selectionMenuBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionJPanelLayout.createSequentialGroup()
                                .addContainerGap(216, Short.MAX_VALUE)
                                .addGroup(SelectionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hardBot, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(superHardBot, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bossBot, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(moderateBot, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(easyBot, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(212, 212, 212))
        );
        SelectionJPanelLayout.setVerticalGroup(
                SelectionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SelectionJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(selectionMenuBack)
                                .addGap(139, 139, 139)
                                .addComponent(easyBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moderateBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hardBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(superHardBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bossBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addGroup(SelectionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectionQuit)
                                        .addComponent(selectionRestart))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SelectionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SelectionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        //this.add(SelectionJPanel, BorderLayout.CENTER);
        setPreferredSize(getPreferredSize());
        this.setVisible(rootPaneCheckingEnabled);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
    }

    public void FightingMenuInit() {

    }

    public static void main(String[] args) {
        LoginJframe n = new LoginJframe();
        n.loginInit();
    }

    /**
     * @return the character
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(Character character) {
        this.character = character;
    }

    /**
     * @return the reset
     */
    public boolean isReset() {
        return reset;
    }

    /**
     * @param reset the reset to set
     */
    public void setReset(boolean reset) {
        this.reset = reset;
    }
}
