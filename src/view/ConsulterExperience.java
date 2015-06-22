/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import daoLayer.ExperienceDao;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class ConsulterExperience extends javax.swing.JFrame {
    
    /**
     * Creates new form TableauDeBord
     */
    public ConsulterExperience() {
        initComponents();

        this.title_experience.setText(GestionExperience.titleExperience);
        this.title_experience.disable();
        this.decalage_horaire.setText(Integer.toString(GestionExperience.decalage_horaire_experience));
        this.decalage_horaire.disable();

        this.start_experience.setText(GestionExperience.start_experience);
        this.start_experience.disable();
        
        this.end_experience.setText(GestionExperience.end_experience);
        this.end_experience.disable();
        
        this.season_experience.setText(GestionExperience.season_experience);
        this.season_experience.disable();
        
        this.depense_experience.setText(Float.toString(GestionExperience.depense_experience));
        this.depense_experience.disable();
        
        this.note_experience.setText(Integer.toString(GestionExperience.note_experience));
        this.note_experience.disable();
        
        this.texte_exp.setText(GestionExperience.text_experience);
        this.texte_exp.disable();
        
        this.video_experience.setText(GestionExperience.video_experience);
        this.video_experience.disable();

        this.image_exp.setText(GestionExperience.image_experience);
        this.image_exp.disable();
        
        this.compte_experience.setText(GestionExperience.compte_experience);
        this.compte_experience.disable();
        
        this.country_exp.setText(GestionExperience.country_experience);
        this.country_exp.disable();
        this.compte_experience.disable();
        String status;
        if(GestionExperience.status_experience == 1)
             status = "Activé";
        else
             status = "Désactivé";
        
        this.statusExperience.setText(status);
        this.statusExperience.disable();
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jNom = new javax.swing.JLabel();
        title_experience = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        decalage_horaire = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        start_experience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        end_experience = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        season_experience = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        depense_experience = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        note_experience = new javax.swing.JTextField();
        sur_dix = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texte_exp = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        video_experience = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        image_exp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        compte_experience = new javax.swing.JTextField();
        deleteExperience = new javax.swing.JToggleButton();
        btnEnableUser = new javax.swing.JButton();
        btnDisableUser = new javax.swing.JButton();
        returnExperience = new javax.swing.JButton();
        country_exp = new javax.swing.JTextField();
        pays = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        statusExperience = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        userManage = new javax.swing.JMenu();
        guideManage = new javax.swing.JMenu();
        experienceManage = new javax.swing.JMenu();
        statManage = new javax.swing.JMenu();
        rssManage = new javax.swing.JMenu();
        newsletterManage = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jNom.setText("Titre : ");
        jPanel1.add(jNom);
        jNom.setBounds(90, 30, 40, 20);

        title_experience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title_experienceActionPerformed(evt);
            }
        });
        jPanel1.add(title_experience);
        title_experience.setBounds(190, 30, 180, 30);

        jLabel2.setText("Décalage horaire :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 30, 100, 14);
        jPanel1.add(decalage_horaire);
        decalage_horaire.setBounds(500, 30, 180, 30);

        jLabel3.setText("Date de début :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 70, 90, 14);
        jPanel1.add(start_experience);
        start_experience.setBounds(190, 70, 180, 30);

        jLabel4.setText("Date de fin :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 70, 70, 14);
        jPanel1.add(end_experience);
        end_experience.setBounds(500, 70, 180, 30);

        jLabel5.setText("Saison : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 110, 60, 20);
        jPanel1.add(season_experience);
        season_experience.setBounds(190, 110, 180, 30);

        jLabel6.setText("Dépense :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 110, 60, 14);
        jPanel1.add(depense_experience);
        depense_experience.setBounds(500, 110, 180, 30);

        jLabel7.setText("Note : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 160, 33, 14);
        jPanel1.add(note_experience);
        note_experience.setBounds(190, 160, 150, 30);

        sur_dix.setText("/10");
        jPanel1.add(sur_dix);
        sur_dix.setBounds(350, 160, 34, 20);

        jLabel9.setText("Description : ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 160, 70, 14);

        texte_exp.setColumns(20);
        texte_exp.setRows(5);
        jScrollPane1.setViewportView(texte_exp);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 160, 180, 96);

        jLabel10.setText("Vidéo :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 220, 33, 14);
        jPanel1.add(video_experience);
        video_experience.setBounds(190, 220, 180, 30);

        jLabel11.setText("Image :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 270, 37, 14);
        jPanel1.add(image_exp);
        image_exp.setBounds(190, 270, 180, 30);

        jLabel12.setText("Propriétaire :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 270, 70, 20);
        jPanel1.add(compte_experience);
        compte_experience.setBounds(500, 270, 180, 30);

        deleteExperience.setText("Supprimer");
        deleteExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExperienceActionPerformed(evt);
            }
        });
        jPanel1.add(deleteExperience);
        deleteExperience.setBounds(480, 350, 105, 23);

        btnEnableUser.setText("Activé");
        btnEnableUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnableUser);
        btnEnableUser.setBounds(190, 350, 80, 23);

        btnDisableUser.setText("Désactivé");
        btnDisableUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisableUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisableUser);
        btnDisableUser.setBounds(280, 350, 79, 23);

        returnExperience.setText("<< précédent");
        returnExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnExperienceActionPerformed(evt);
            }
        });
        jPanel1.add(returnExperience);
        returnExperience.setBounds(370, 350, 101, 23);
        jPanel1.add(country_exp);
        country_exp.setBounds(190, 310, 180, 30);

        pays.setText("Pays : ");
        jPanel1.add(pays);
        pays.setBounds(90, 314, 40, 20);

        jLabel13.setText("Status :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(410, 320, 38, 14);
        jPanel1.add(statusExperience);
        statusExperience.setBounds(500, 310, 180, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 830, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 1150, 620));

        userManage.setText("Utilisateurs");
        userManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(userManage);

        guideManage.setText("Guides");
        jMenuBar1.add(guideManage);

        experienceManage.setText("Experiences");
        jMenuBar1.add(experienceManage);

        statManage.setText("Statistiques");
        jMenuBar1.add(statManage);

        rssManage.setText("Flux Rss");
        jMenuBar1.add(rssManage);

        newsletterManage.setText("Newsletter");
        jMenuBar1.add(newsletterManage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userManageMouseClicked

    private void btnEnableUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUserActionPerformed
        // TODO add your handling code here:
            ExperienceDao cDao = ExperienceDao.getInstance();
            cDao.disableExperience(GestionExperience.idExperience, true);
            GestionExperience.status_experience = 1;
            
    }//GEN-LAST:event_btnEnableUserActionPerformed

    private void btnDisableUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisableUserActionPerformed
        // TODO add your handling code here:
            ExperienceDao cDao = ExperienceDao.getInstance();
            cDao.disableExperience(GestionExperience.idExperience, false);
            GestionExperience.status_experience = 0;

    }//GEN-LAST:event_btnDisableUserActionPerformed

    private void returnExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnExperienceActionPerformed
        // TODO add your handling code here:
            this.returnExperienceForm();
    }//GEN-LAST:event_returnExperienceActionPerformed

    private void title_experienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_experienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title_experienceActionPerformed

    private void deleteExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExperienceActionPerformed
        // TODO add your handling code here:
            ExperienceDao experienceDao               = ExperienceDao.getInstance();

            JOptionPane jop = new JOptionPane();

            if(experienceDao.deleteEntity(GestionExperience.expStatic)){
                jop.showMessageDialog(null, "Suppression de "+GestionExperience.titleExperience+" avec sucess", "Sucess", JOptionPane.ERROR_MESSAGE);
            }
            this.returnExperienceForm();

    }//GEN-LAST:event_deleteExperienceActionPerformed
    
    public void returnExperienceForm(){
        GestionExperience expForm = new GestionExperience();
        expForm.setVisible(true);
        this.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(ConsulterExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterExperience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsulterExperience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisableUser;
    private javax.swing.JButton btnEnableUser;
    private javax.swing.JTextField compte_experience;
    private javax.swing.JTextField country_exp;
    private javax.swing.JTextField decalage_horaire;
    private javax.swing.JToggleButton deleteExperience;
    private javax.swing.JTextField depense_experience;
    private javax.swing.JTextField end_experience;
    private javax.swing.JMenu experienceManage;
    private javax.swing.JMenu guideManage;
    private javax.swing.JTextField image_exp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JTextField note_experience;
    private javax.swing.JLabel pays;
    private javax.swing.JButton returnExperience;
    private javax.swing.JMenu rssManage;
    private javax.swing.JTextField season_experience;
    private javax.swing.JTextField start_experience;
    private javax.swing.JMenu statManage;
    private javax.swing.JTextField statusExperience;
    private javax.swing.JLabel sur_dix;
    private javax.swing.JTextArea texte_exp;
    private javax.swing.JTextField title_experience;
    private javax.swing.JMenu userManage;
    private javax.swing.JTextField video_experience;
    // End of variables declaration//GEN-END:variables
}