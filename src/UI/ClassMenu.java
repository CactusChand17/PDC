/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author manu2
 */
public class ClassMenu extends javax.swing.JFrame {


    /**
     * Creates new form ClassMenu
     */
    public ClassMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classesJPanel = new javax.swing.JPanel();
        classLabel = new javax.swing.JLabel();
        mageButton = new javax.swing.JButton();
        rogueButton = new javax.swing.JButton();
        warriorButton = new javax.swing.JButton();
        classesQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classesJPanel.setPreferredSize(new java.awt.Dimension(647, 552));

        classLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        classLabel.setText("Classes");

        mageButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        mageButton.setText("Mage");
        mageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mageButtonActionPerformed(evt);
            }
        });

        rogueButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        rogueButton.setText("Rogue");
        rogueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rogueButtonActionPerformed(evt);
            }
        });

        warriorButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        warriorButton.setText("Warrior");
        warriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorButtonActionPerformed(evt);
            }
        });

        classesQuit.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        classesQuit.setText("Quit");
        classesQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesQuitActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mainform = new MainMenu();
        //mainform.getCharacter().setPlayerClass(mainform.getCharacter().getClasses().Mage());  
        mainform.setVisible(true);
        mainform.pack();
        mainform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mageButtonActionPerformed

    private void rogueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rogueButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mainform = new MainMenu();
        //mainform.getCharacter().setPlayerClass(mainform.getCharacter().getClasses().Rogue());  
        mainform.setVisible(true);
        mainform.pack();
        mainform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_rogueButtonActionPerformed

    private void warriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mainform = new MainMenu();
       // mainform.getCharacter().setPlayerClass(mainform.getCharacter().getClasses().Warrior());     
        mainform.setVisible(true);
        mainform.pack();
        mainform.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_warriorButtonActionPerformed

    private void classesQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesQuitActionPerformed
        Object source = evt.getSource();
        if (source == classesQuit) {
            System.exit(0);
        }
    }//GEN-LAST:event_classesQuitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel classesJPanel;
    private javax.swing.JButton classesQuit;
    private javax.swing.JButton mageButton;
    private javax.swing.JButton rogueButton;
    private javax.swing.JButton warriorButton;
    // End of variables declaration//GEN-END:variables
}