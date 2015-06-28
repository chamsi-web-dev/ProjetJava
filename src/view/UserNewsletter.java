/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import daoLayer.CompteDao;

/**
 *
 * @author mac
 */
public class UserNewsletter extends javax.swing.JFrame {

    /**
     * Creates new form TableauDeBord
     */
    public UserNewsletter() {
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

        abonnementNewsletter = new javax.swing.JCheckBox();
        validateNewsletter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        guideManage = new javax.swing.JMenu();
        listeGuide = new javax.swing.JMenuItem();
        createGuide = new javax.swing.JMenuItem();
        contributeGuide = new javax.swing.JMenuItem();
        createExperience = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        listeExperience = new javax.swing.JMenuItem();
        newsletterManage = new javax.swing.JMenu();
        recommandUser = new javax.swing.JMenu();
        userManage = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abonnementNewsletter.setText("                            S'abbonner au newsletter");
        abonnementNewsletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonnementNewsletterActionPerformed(evt);
            }
        });
        getContentPane().add(abonnementNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 360, -1));

        validateNewsletter.setText("Valider");
        validateNewsletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateNewsletterActionPerformed(evt);
            }
        });
        getContentPane().add(validateNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 940, 510));

        guideManage.setText("Guides");
        guideManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guideManageMouseClicked(evt);
            }
        });

        listeGuide.setText("Lister");
        listeGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeGuideMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeGuideMousePressed(evt);
            }
        });
        guideManage.add(listeGuide);

        createGuide.setText("Créer");
        guideManage.add(createGuide);

        contributeGuide.setText("Contribuer");
        contributeGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contributeGuideActionPerformed(evt);
            }
        });
        guideManage.add(contributeGuide);

        jMenuBar1.add(guideManage);

        createExperience.setText("Experiences");
        createExperience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createExperienceMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Créer");
        createExperience.add(jMenuItem1);

        listeExperience.setText("Lister");
        listeExperience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeExperienceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listeExperienceMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeExperienceMousePressed(evt);
            }
        });
        createExperience.add(listeExperience);

        jMenuBar1.add(createExperience);

        newsletterManage.setText("Newsletter");
        newsletterManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsletterManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(newsletterManage);

        recommandUser.setText("Recommander");
        jMenuBar1.add(recommandUser);

        userManage.setText("Exit");
        userManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(userManage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManageMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_userManageMouseClicked

    private void guideManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideManageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_guideManageMouseClicked

    private void createExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createExperienceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createExperienceMouseClicked

    private void newsletterManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsletterManageMouseClicked
        // TODO add your handling code here:
            UserNewsletter newsletterAbonnement = new UserNewsletter();
            newsletterAbonnement.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newsletterManageMouseClicked

    private void contributeGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contributeGuideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contributeGuideActionPerformed

    private void listeExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeExperienceMouseClicked
        // TODO add your handling code here:
            UserListeExperience experienceList = new UserListeExperience();
            experienceList.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_listeExperienceMouseClicked

    private void listeExperienceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeExperienceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_listeExperienceMouseEntered

    private void listeExperienceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeExperienceMousePressed
        // TODO add your handling code here:
        UserListeExperience experienceList = new UserListeExperience();
        experienceList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeExperienceMousePressed

    private void listeGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeGuideMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listeGuideMouseClicked

    private void listeGuideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeGuideMousePressed
        // TODO add your handling code here:
        UserListeGuide guideList = new UserListeGuide();
        guideList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeGuideMousePressed

    private void abonnementNewsletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonnementNewsletterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abonnementNewsletterActionPerformed

    private void validateNewsletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateNewsletterActionPerformed
        // TODO add your handling code here:
            CompteDao cDao = CompteDao.getInstance();
            cDao.abonnementNewsletter(2, true);
    }//GEN-LAST:event_validateNewsletterActionPerformed

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
            java.util.logging.Logger.getLogger(UserNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserNewsletter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abonnementNewsletter;
    private javax.swing.JMenuItem contributeGuide;
    private javax.swing.JMenu createExperience;
    private javax.swing.JMenuItem createGuide;
    private javax.swing.JMenu guideManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem listeExperience;
    private javax.swing.JMenuItem listeGuide;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JMenu recommandUser;
    private javax.swing.JMenu userManage;
    private javax.swing.JButton validateNewsletter;
    // End of variables declaration//GEN-END:variables
}
