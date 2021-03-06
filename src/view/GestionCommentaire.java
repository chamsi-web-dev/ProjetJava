/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.esprit.entites.Commentaire;
import daoLayer.CommentaireDao;
import java.util.List;
import javax.swing.JOptionPane;
import tables.CommentaireAdapter;

/**
 *
 * @author mac
 */
public class GestionCommentaire extends javax.swing.JFrame {
    public static int idCommentaire;
    public static String lienCommentaire;
    public static int statusCommentaire;
    public static Commentaire commentaireStatic;
    /**
     * Creates new form TableauDeBord
     */
    public GestionCommentaire() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        deleteFlux = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentaireTableModel = new javax.swing.JTable();
        enableFlux = new javax.swing.JButton();
        disableFlux = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteFlux.setText("Supprimer");
        deleteFlux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFluxActionPerformed(evt);
            }
        });
        getContentPane().add(deleteFlux, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        commentaireTableModel.setBackground(new java.awt.Color(153, 153, 153));
        commentaireTableModel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        commentaireTableModel.setForeground(new java.awt.Color(255, 255, 255));
        commentaireTableModel.setModel(new CommentaireAdapter());
        commentaireTableModel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(commentaireTableModel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 950, 440));

        enableFlux.setText("Activé");
        enableFlux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableFluxActionPerformed(evt);
            }
        });
        getContentPane().add(enableFlux, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        disableFlux.setText("Désactivé");
        disableFlux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableFluxActionPerformed(evt);
            }
        });
        getContentPane().add(disableFlux, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/http-www.bhutantravelshop.com-wp-content-uploads-2014-07-lt.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 270, 340));

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

    private void deleteFluxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFluxActionPerformed
        // TODO add your handling code here:
        if(commentaireTableModel.getSelectedRow() != -1){
               CommentaireDao commentaireDao     = CommentaireDao.getInstance();
               CommentaireAdapter commentaireAdapter   = new CommentaireAdapter();
               List<Commentaire> listCommentaire       = commentaireAdapter.getCommentaires();
               Commentaire tmpCommentaire              = listCommentaire.get(commentaireTableModel.getSelectedRow());
               commentaireDao.deleteEntity(tmpCommentaire);
               
               JOptionPane jop = new JOptionPane();

                if(commentaireDao.deleteEntity(tmpCommentaire)){
                    jop.showMessageDialog(null, "Suppression de "+tmpCommentaire.getIdCommentaire()+" avec sucess", "Sucess", JOptionPane.ERROR_MESSAGE);
                }
               commentaireTableModel.setModel(new CommentaireAdapter());
            }
    }//GEN-LAST:event_deleteFluxActionPerformed

    private void enableFluxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableFluxActionPerformed
        // TODO add your handling code here:
        if(commentaireTableModel.getSelectedRow() != -1){
            CommentaireDao cDao = CommentaireDao.getInstance();
            CommentaireAdapter commentaireAdapter = new CommentaireAdapter();
            List<Commentaire> listCommentaire = commentaireAdapter.getCommentaires();
            Commentaire tmpCommentaire = listCommentaire.get(commentaireTableModel.getSelectedRow());
            System.out.println(tmpCommentaire);
            cDao.disableCommentaire(tmpCommentaire.getIdCommentaire(), true);
            commentaireTableModel.setModel(new CommentaireAdapter());
        }
    }//GEN-LAST:event_enableFluxActionPerformed

    private void disableFluxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableFluxActionPerformed
        // TODO add your handling code here:
        if(commentaireTableModel.getSelectedRow() != -1){
           CommentaireDao cDao = CommentaireDao.getInstance();
            CommentaireAdapter commentaireAdapter = new CommentaireAdapter();
            List<Commentaire> listCommentaire = commentaireAdapter.getCommentaires();
            Commentaire tmpCommentaire = listCommentaire.get(commentaireTableModel.getSelectedRow());
            cDao.disableCommentaire(tmpCommentaire.getIdCommentaire(), false);
            commentaireTableModel.setModel(new CommentaireAdapter());
        }
    }//GEN-LAST:event_disableFluxActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCommentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCommentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCommentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCommentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestionCommentaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable commentaireTableModel;
    private javax.swing.JButton deleteFlux;
    private javax.swing.JButton disableFlux;
    private javax.swing.JButton enableFlux;
    private javax.swing.JMenu experienceManage;
    private javax.swing.JMenu guideManage;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JMenu rssManage;
    private javax.swing.JMenu statManage;
    private javax.swing.JMenu userManage;
    // End of variables declaration//GEN-END:variables
}
