/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.esprit.entites.Compte;
import daoLayer.CompteDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;
import com.sun.xml.internal.ws.wsdl.writer.document.Message;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.sql.SQLException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
//import org.eclipse.persistence.sessions.Session;
import static org.omg.CORBA.ORB.init;
import sun.rmi.transport.Transport;*/

/**
 *
 * @author mac
 */
public class GestionNewsletter extends javax.swing.JFrame {
    List<Compte> cListe;
    String to;
    /**
     * Creates new form TableauDeBord
     */
    public GestionNewsletter() {
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

        allClient = new javax.swing.JRadioButton();
        otherNewsletter = new javax.swing.JTextField();
        objetNewsletter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentNewsletter = new javax.swing.JTextArea();
        subject = new javax.swing.JLabel();
        autres = new javax.swing.JLabel();
        sendTo = new javax.swing.JLabel();
        LAB_Content = new javax.swing.JLabel();
        sendNewsletter = new javax.swing.JButton();
        resetNewsletter = new javax.swing.JToggleButton();
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

        allClient.setText("Tous les clients");
        getContentPane().add(allClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 30));
        getContentPane().add(otherNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 160, 30));
        getContentPane().add(objetNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 340, 30));

        contentNewsletter.setColumns(20);
        contentNewsletter.setRows(5);
        jScrollPane1.setViewportView(contentNewsletter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 340, 250));

        subject.setText("Sujet : ");
        getContentPane().add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        autres.setBackground(new java.awt.Color(204, 204, 204));
        autres.setText("Autres : ");
        getContentPane().add(autres, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 30));

        sendTo.setText("Envoyé à :");
        getContentPane().add(sendTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 30));

        LAB_Content.setText("Content :");
        getContentPane().add(LAB_Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        sendNewsletter.setText("Envoyer");
        sendNewsletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNewsletterActionPerformed(evt);
            }
        });
        getContentPane().add(sendNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        resetNewsletter.setText("Annuler");
        getContentPane().add(resetNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

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

    private void sendNewsletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNewsletterActionPerformed
        // TODO add your handling code here:
        /*
            final String username = "besttripsuccess@esprit.tn";
            final String password = "esprit2015";
        */
        CompteDao cDao = CompteDao.getInstance();
        if(allClient.isSelected())
        {
            cListe =  cDao.displayAllEntity();
        } 
        else{
            to = otherNewsletter.getText();
        }
        
        // Recipient's email ID needs to be mentioned.
            //String to = "c@gmail.com";

        // Sender's email ID needs to be mentioned
            String from = "web@gmail.com";

        // Assuming you are sending email from localhost
            String host = "localhost";

        // Get system properties
            Properties properties = System.getProperties();

        // Setup mail server
            properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
            Session session = Session.getDefaultInstance(properties);

        // Create a default MimeMessage object.
             MimeMessage message = new MimeMessage(session);

           // Set From: header field of the header.
            try {
                message.setFrom(new InternetAddress(from));
                if(to == ""){
                    for (Iterator<Compte> iterator = cListe.iterator(); iterator.hasNext();) {
                        Compte next = iterator.next();
                        to = next.getEmail_compte();
                        // Set To: header field of the header.
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                       // Set Subject: header field
                            message.setSubject(objetNewsletter.getText());

                       // Now set the actual message
                            message.setText(contentNewsletter.getText());
                            System.out.println(message.toString());

                       // Send message
                            Transport.send(message);
                            System.out.println("Newsletter envoyé à "+next.getNom_compte()+" "+next.getPrenom_compte()+"....");

                    }
                }else{
                    // Set To: header field of the header.
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                   // Set Subject: header field
                        message.setSubject(objetNewsletter.getText());

                   // Now set the actual message
                        message.setText(contentNewsletter.getText());
                        System.out.println(message.toString());

                   // Send message
                        Transport.send(message);
                        System.out.println("Newsletter envoyé à "+to+"....");
                }
                
           
                
            } catch (Exception e) {
                System.out.println("Erreur : "+e.getMessage());
            }
        
    }//GEN-LAST:event_sendNewsletterActionPerformed

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
            java.util.logging.Logger.getLogger(GestionNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionNewsletter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionNewsletter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAB_Content;
    private javax.swing.JRadioButton allClient;
    private javax.swing.JLabel autres;
    private javax.swing.JTextArea contentNewsletter;
    private javax.swing.JMenu experienceManage;
    private javax.swing.JMenu guideManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu newsletterManage;
    private javax.swing.JTextField objetNewsletter;
    private javax.swing.JTextField otherNewsletter;
    private javax.swing.JToggleButton resetNewsletter;
    private javax.swing.JMenu rssManage;
    private javax.swing.JButton sendNewsletter;
    private javax.swing.JLabel sendTo;
    private javax.swing.JMenu statManage;
    private javax.swing.JLabel subject;
    private javax.swing.JMenu userManage;
    // End of variables declaration//GEN-END:variables
}
