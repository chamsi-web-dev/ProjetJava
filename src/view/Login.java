/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import daoLayer.CompteDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        userName = new javax.swing.JTextField();
        jNom = new javax.swing.JLabel();
        jPwd = new javax.swing.JLabel();
        jConnectApplication = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jInscription = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 113, 155, -1));

        jNom.setForeground(new java.awt.Color(255, 255, 255));
        jNom.setText("Nom utlisateur :");
        getContentPane().add(jNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jPwd.setForeground(new java.awt.Color(255, 255, 255));
        jPwd.setText("Mots de passe");
        getContentPane().add(jPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jConnectApplication.setText("Connexion");
        jConnectApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConnectApplicationActionPerformed(evt);
            }
        });
        getContentPane().add(jConnectApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        getContentPane().add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jInscription.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jInscription.setText("Inscription");
        jInscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInscriptionMouseClicked(evt);
            }
        });
        getContentPane().add(jInscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 169, 155, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_background_1366x768_22718.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jInscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInscriptionMouseClicked
        // TODO add your handling code here:
        Inscription formInscription = new Inscription();
        formInscription.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jInscriptionMouseClicked

    private void jConnectApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConnectApplicationActionPerformed
        // TODO add your handling code here:
        
        CompteDao cDAO = CompteDao.getInstance();
        String resCompte = cDAO.verifyEntity(userName.getText(), pwd.getText());
        if(resCompte != "")
        {
            if(resCompte.equals("Administrateur")){
                TableauDeBord formBordUser = new TableauDeBord();
                formBordUser.setVisible(true);
                this.setVisible(false);
            }else if(resCompte.equals("Utilisateur")){
                TableauDeBord formBordUser = new TableauDeBord();
                formBordUser.setVisible(true);
                this.setVisible(false);
            }
            
        }else{
            String message = "Utlisateur non trouvé";
            JOptionPane.showMessageDialog(new JFrame(), message, "Erreur authentification",
                JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jConnectApplicationActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JButton jConnectApplication;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jInscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jNom;
    private javax.swing.JLabel jPwd;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
