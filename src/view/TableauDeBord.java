/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author mac
 */
public class TableauDeBord extends javax.swing.JFrame {

    /**
     * Creates new form TableauDeBord
     */
    public TableauDeBord() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        userManage = new javax.swing.JMenu();
        guideManage = new javax.swing.JMenu();
        experienceManage = new javax.swing.JMenu();
        statManage = new javax.swing.JMenu();
        rssManage = new javax.swing.JMenu();
        newsletterManage = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20204_1201798667.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 940, 510));

        userManage.setText("Utilisateurs");
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
        jMenuBar1.add(guideManage);

        experienceManage.setText("Experiences");
        experienceManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                experienceManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(experienceManage);

        statManage.setText("Statistiques");
        statManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(statManage);

        rssManage.setText("Flux Rss");
        rssManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rssManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(rssManage);

        newsletterManage.setText("Newsletter");
        newsletterManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsletterManageMouseClicked(evt);
            }
        });
        jMenuBar1.add(newsletterManage);

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

    private void experienceManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_experienceManageMouseClicked
        // TODO add your handling code here:
            GestionExperience experienceManage = new GestionExperience();
            experienceManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_experienceManageMouseClicked

    private void statManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statManageMouseClicked
        // TODO add your handling code here:
            GestionStat statManage = new GestionStat();
            statManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_statManageMouseClicked

    private void rssManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rssManageMouseClicked
        // TODO add your handling code here:
            GestionFlux rssManage = new GestionFlux();
            rssManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_rssManageMouseClicked

    private void newsletterManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsletterManageMouseClicked
        // TODO add your handling code here:
            GestionNewsletter newsletterManage = new GestionNewsletter();
            newsletterManage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_newsletterManageMouseClicked

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
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableauDeBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableauDeBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu experienceManage;
    private javax.swing.JMenu guideManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JMenu rssManage;
    private javax.swing.JMenu statManage;
    private javax.swing.JMenu userManage;
    // End of variables declaration//GEN-END:variables
}
