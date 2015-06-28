/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.esprit.entites.Guide;
import daoLayer.GuideDao;
import java.util.List;
import tables.UserGuideAdapter;


/**
 *
 * @author mac
 */
public class UserListeGuide extends javax.swing.JFrame {
    public static Guide guideStatic;
    public static String titleGuide;
    
    /**
     * Creates new form TableauDeBord
     */
    public UserListeGuide() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userGuideTableModel = new javax.swing.JTable();
        consulterGuide = new javax.swing.JButton();
        countryGuide = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        userGuideTableModel.setModel(new UserGuideAdapter());
        userGuideTableModel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(userGuideTableModel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 870, -1));

        consulterGuide.setText("Consulter");
        consulterGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterGuideActionPerformed(evt);
            }
        });
        getContentPane().add(consulterGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        countryGuide.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tunisie", "France ", "Suisse", "Italie" }));
        countryGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                countryGuideMousePressed(evt);
            }
        });
        countryGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryGuideActionPerformed(evt);
            }
        });
        getContentPane().add(countryGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 80, -1));

        jLabel3.setText("Choisir une pays : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 90, 100, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20204_1201798667.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 240, -1));

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
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        createExperience.add(jMenuItem1);

        listeExperience.setText("Lister");
        listeExperience.addMouseListener(new java.awt.event.MouseAdapter() {
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
            GestionNewsletter newsletterManage = new GestionNewsletter();
            newsletterManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newsletterManageMouseClicked

    private void consulterGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterGuideActionPerformed
        // TODO add your handling code here:
        if(userGuideTableModel.getSelectedRow() != -1){
            GuideDao guideDao               = GuideDao.getInstance();
            UserGuideAdapter guidesAdapter  = new UserGuideAdapter();
            List<Guide> listGuide           = guidesAdapter.getGuides();
            Guide tmpGuide                  = listGuide.get(userGuideTableModel.getSelectedRow());
            System.out.println(tmpGuide);
            //userGuideTableModel.setModel(new UserGuideAdapter());
            guideStatic  = tmpGuide;
            userConsulterGuide voirGuide    =  new userConsulterGuide();
            voirGuide.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_consulterGuideActionPerformed

    private void listeGuideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeGuideMousePressed
        // TODO add your handling code here:
        UserListeGuide guideList = new UserListeGuide();
        guideList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeGuideMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void listeExperienceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeExperienceMousePressed
        // TODO add your handling code here:
        UserListeExperience experienceList = new UserListeExperience();
        experienceList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeExperienceMousePressed

    private void countryGuideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryGuideMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryGuideMousePressed

    private void countryGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryGuideActionPerformed
        // TODO add your handling code here:
        if(countryGuide.getSelectedItem()!= "")
        {
            userGuideTableModel.setModel(new UserGuideAdapter(countryGuide.getSelectedIndex()+1));
        }
    }//GEN-LAST:event_countryGuideActionPerformed

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
            java.util.logging.Logger.getLogger(UserListeGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserListeGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserListeGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserListeGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new UserListeGuide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulterGuide;
    private javax.swing.JComboBox countryGuide;
    private javax.swing.JMenu createExperience;
    private javax.swing.JMenuItem createGuide;
    private javax.swing.JMenu guideManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listeExperience;
    private javax.swing.JMenuItem listeGuide;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JMenu recommandUser;
    private javax.swing.JTable userGuideTableModel;
    private javax.swing.JMenu userManage;
    // End of variables declaration//GEN-END:variables
}
