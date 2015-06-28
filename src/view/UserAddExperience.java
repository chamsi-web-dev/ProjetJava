/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.esprit.entites.Experience;
import daoLayer.ExperienceDao;
import java.util.List;
import tables.ExperienceAdapter;


/**
 *
 * @author mac
 */
public class UserAddExperience extends javax.swing.JFrame {
    public static Experience experiencStatic;
    public static String titleExperience;
    
    /**
     * Creates new form TableauDeBord
     */
    public UserAddExperience() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        titreExperience = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        decalageExperience = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        depenseExperience = new javax.swing.JLabel();
        depensExperience = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        noteExperience = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        countryExperience = new javax.swing.JComboBox();
        typeContentExperience = new javax.swing.JLabel();
        btnTextExperience = new javax.swing.JRadioButton();
        btnImgExperience = new javax.swing.JRadioButton();
        btnVideoExperience = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textExperience = new javax.swing.JTextArea();
        startExperience = new com.toedter.calendar.JDateChooser();
        endExperience = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        userManage = new javax.swing.JMenu();
        guideManage = new javax.swing.JMenu();
        listeGuide = new javax.swing.JMenuItem();
        createGuide = new javax.swing.JMenuItem();
        contributeGuide = new javax.swing.JMenuItem();
        createExperience = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        listeExperience = new javax.swing.JMenuItem();
        newsletterManage = new javax.swing.JMenu();
        recommandUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Titre expérience : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 20));
        getContentPane().add(titreExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 120, -1));

        jLabel5.setText("Décalage horaire :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 100, 20));
        getContentPane().add(decalageExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 150, -1));

        jLabel2.setText("Date de début :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel6.setText("Date de fin :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 20));

        jLabel7.setText("Saison : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Automne", "Hiver", "Printemps", "Eté" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 120, -1));

        depenseExperience.setText("Dépense : ");
        getContentPane().add(depenseExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));
        getContentPane().add(depensExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 150, 20));

        jLabel8.setText("Note :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        noteExperience.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(noteExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 120, -1));

        jLabel9.setText("Pays : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        countryExperience.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tunisie", "France", "Suisse", "Italie", "Egypte", "Malysie", "île de séchelle" }));
        getContentPane().add(countryExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 150, -1));

        typeContentExperience.setText("Type de contenu :");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, typeContentExperience, org.jdesktop.beansbinding.ELProperty.create("${background.RGB}"), typeContentExperience, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(typeContentExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 20));

        btnTextExperience.setText("Texte");
        getContentPane().add(btnTextExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnImgExperience.setText("Image");
        getContentPane().add(btnImgExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        btnVideoExperience.setText("Vidéo");
        getContentPane().add(btnVideoExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        textExperience.setColumns(20);
        textExperience.setRows(5);
        jScrollPane1.setViewportView(textExperience);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 520, 200));

        startExperience.setDateFormatString("yyyy-MM-d");
        getContentPane().add(startExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 120, -1));

        endExperience.setDateFormatString("yyyy-MM-d");
        getContentPane().add(endExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        jLabel1.setText("Dépense : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 940, 740));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        userManage.setText("Profile");
        userManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(userManage);

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

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

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
            GestionNewsletter newsletterManage = new GestionNewsletter();
            newsletterManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newsletterManageMouseClicked

    private void contributeGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contributeGuideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contributeGuideActionPerformed

    private void listeGuideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeGuideMousePressed
        // TODO add your handling code here:
        UserListeGuide guideList = new UserListeGuide();
        guideList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeGuideMousePressed

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
            java.util.logging.Logger.getLogger(UserAddExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAddExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAddExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAddExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UserAddExperience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnImgExperience;
    private javax.swing.JRadioButton btnTextExperience;
    private javax.swing.JRadioButton btnVideoExperience;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem contributeGuide;
    private javax.swing.JComboBox countryExperience;
    private javax.swing.JMenu createExperience;
    private javax.swing.JMenuItem createGuide;
    private javax.swing.JTextField decalageExperience;
    private javax.swing.JTextField depensExperience;
    private javax.swing.JLabel depenseExperience;
    private com.toedter.calendar.JDateChooser endExperience;
    private javax.swing.JMenu guideManage;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listeExperience;
    private javax.swing.JMenuItem listeGuide;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JComboBox noteExperience;
    private javax.swing.JMenu recommandUser;
    private com.toedter.calendar.JDateChooser startExperience;
    private javax.swing.JTextArea textExperience;
    private javax.swing.JTextField titreExperience;
    private javax.swing.JLabel typeContentExperience;
    private javax.swing.JMenu userManage;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}