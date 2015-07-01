/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.esprit.entites.Experience;
import com.esprit.entites.Guide;
import daoLayer.GuideDao;
import javax.swing.JOptionPane;


/**
 *
 * @author mac
 */
public class UserAddGuide extends javax.swing.JFrame {
    public static Experience experiencStatic;
    public static String titleExperience;
    
    /**
     * Creates new form TableauDeBord
     */
    public UserAddGuide() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        countryGuide = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionGuide = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        nameGuide = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addGuide = new javax.swing.JButton();
        resetGuide = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        guideManage = new javax.swing.JMenu();
        listeGuide = new javax.swing.JMenuItem();
        createGuide = new javax.swing.JMenuItem();
        createExperience = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        listeExperience = new javax.swing.JMenuItem();
        newsletterManage = new javax.swing.JMenu();
        recommandUser = new javax.swing.JMenu();
        userManage = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Pays : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 64, 60, 30));

        countryGuide.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tunisie", "France", "Suisse", "Italie", "Egypte", "Malysie", "île de séchelle" }));
        getContentPane().add(countryGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 150, 30));

        descriptionGuide.setColumns(20);
        descriptionGuide.setRows(5);
        jScrollPane1.setViewportView(descriptionGuide);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 590, 200));

        jLabel10.setText("Titre de guide : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 30));
        getContentPane().add(nameGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 160, 30));

        jLabel2.setText("Description guide : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, 20));

        addGuide.setText("Ajouter");
        addGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGuideActionPerformed(evt);
            }
        });
        getContentPane().add(addGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        resetGuide.setText("réinitialiser");
        getContentPane().add(resetGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        jLabel1.setText("Dépense : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 940, 740));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        guideManage.setText("Guides");
        guideManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guideManageMouseClicked(evt);
            }
        });

        listeGuide.setText("Lister");
        listeGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeGuideMousePressed(evt);
            }
        });
        guideManage.add(listeGuide);

        createGuide.setText("Créer");
        guideManage.add(createGuide);

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userManageMousePressed(evt);
            }
        });
        jMenuBar1.add(userManage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManageMouseClicked
        // TODO add your handling code here:
            GestionUtilisateur userManage = new GestionUtilisateur();
            userManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_userManageMouseClicked

    private void guideManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideManageMouseClicked
        // TODO add your handling code here:
            GestionGuide guideManage = new GestionGuide();
            guideManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_guideManageMouseClicked

    private void createExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createExperienceMouseClicked
        // TODO add your handling code here:
            GestionExperience experienceManage = new GestionExperience();
            experienceManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_createExperienceMouseClicked

    private void newsletterManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsletterManageMouseClicked
        // TODO add your handling code here:
            UserNewsletter newsletterManage = new UserNewsletter();
            newsletterManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newsletterManageMouseClicked

    private void listeGuideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeGuideMousePressed
        // TODO add your handling code here:
        UserListeGuide guideList = new UserListeGuide();
        guideList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeGuideMousePressed

    private void addGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGuideActionPerformed
        // TODO add your handling code here:
        Guide newGuide = new Guide();
        JOptionPane jop = new JOptionPane();

        newGuide.setName_guide(nameGuide.getText());
        newGuide.setId_country(countryGuide.getSelectedIndex()+1);
        newGuide.setDescription_guide(descriptionGuide.getText());
        newGuide.setStatus_guide(0);
        newGuide.setNote_guide(0);
        newGuide.setId_compte(Login.compteStatic.getId_compte());
        
        GuideDao gDao = GuideDao.getInstance();
        try {
            if(gDao.insertEntity(newGuide)){
                jop.showMessageDialog(null, "Guide ajouté avec succé", "Information", JOptionPane.INFORMATION_MESSAGE);
                UserListeGuide guideListe = new UserListeGuide();
                guideListe.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
            jop.showMessageDialog(null, e.getMessage(), "Eroor", JOptionPane.INFORMATION_MESSAGE);        
        }

    }//GEN-LAST:event_addGuideActionPerformed

    private void userManageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManageMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_userManageMousePressed

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
            java.util.logging.Logger.getLogger(UserAddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAddGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAddGuide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGuide;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox countryGuide;
    private javax.swing.JMenu createExperience;
    private javax.swing.JMenuItem createGuide;
    private javax.swing.JTextArea descriptionGuide;
    private javax.swing.JMenu guideManage;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listeExperience;
    private javax.swing.JMenuItem listeGuide;
    private javax.swing.JTextField nameGuide;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JMenu recommandUser;
    private javax.swing.JButton resetGuide;
    private javax.swing.JMenu userManage;
    // End of variables declaration//GEN-END:variables
}