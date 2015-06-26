/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Commentaire;
import interfaces.ICrud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class CommentaireDao implements ICrud<Commentaire>{
    
    private static CommentaireDao instance;
    private Statement commentaireStatement;
    private ResultSet resultSet;
    
    private CommentaireDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        try {
            commentaireStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static CommentaireDao getInstance()
    {
        if (instance==null) {
            instance = new CommentaireDao();
        }
        return instance;
    }

    @Override
    public boolean insertEntity(Commentaire commentaire) {
        String req = "INSERT INTO `commentaire` (`id_commentaire`, `content_commentaire`, `rating_commentaire`, `id_experience`) \n" +
                     "VALUES ( NULL, '"+commentaire.getContentCommentaire()+"', "+commentaire.getRatingCommentaire()+", "+commentaire.getIdExperience()+");";
        System.out.println(req);
        try {
            commentaireStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean UpdateEntity(Commentaire commentaire) {
        String req = "Update commentaire "
                    + "SET content_commentaire = "+commentaire.getContentCommentaire()
                    + "AND rating_commentaire ="+commentaire.getRatingCommentaire()
                    + "AND status_commentaire ="+commentaire.getRatingCommentaire()
                    + "WHERE id_commentaire="+commentaire.getIdCommentaire();
   
        try {
            commentaireStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteEntity(Commentaire commentaire) {
        String req = "DELETE FROM commentaire WHERE id_commentaire = "+commentaire.getIdCommentaire();

        try {
            commentaireStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Commentaire displayEntityById(int id) {
        String req = "SELECT * FROM commentaire WHERE id_commentaire = "+id;
        Commentaire commentaire = new Commentaire();
        try {
            resultSet = commentaireStatement.executeQuery(req);
            resultSet.next();
            commentaire.setIdExperience(resultSet.getInt("id_experience"));
            commentaire.setContentCommentaire(resultSet.getString("content_commentaire"));
            commentaire.setRatingCommentaire(resultSet.getInt("rating_commentaire"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return commentaire;
    }

    
    public List<Commentaire> allCommentsByExperience(int id) {
        String req = "SELECT * FROM commentaire WHERE id_experience = "+id;
        List<Commentaire> listCommentaire = new ArrayList<>();
         try {
            resultSet = commentaireStatement.executeQuery(req);
            
            while (resultSet.next()) {
                Commentaire addCommentaire = new Commentaire();

                addCommentaire.setIdCommentaire(resultSet.getInt("id_commentaire"));
                addCommentaire.setContentCommentaire(resultSet.getString("content_commentaire"));
                addCommentaire.setRatingCommentaire(resultSet.getInt("rating_commentaire"));
                addCommentaire.setStatusCommentaire(resultSet.getInt("status_commentaire"));
                
                listCommentaire.add(addCommentaire);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listCommentaire;
    }
    
    @Override
    public List<Commentaire> displayAllEntity() {
        List<Commentaire> listCommentaire = new ArrayList<>();
        String req          = "SELECT * FROM `commentaire` ORDER BY id_commentaire";
        System.out.println(req);
        try {
            resultSet = commentaireStatement.executeQuery(req);
            
            while (resultSet.next()) {
                Commentaire addCommentaire = new Commentaire();

                addCommentaire.setIdCommentaire(resultSet.getInt("id_commentaire"));
                addCommentaire.setContentCommentaire(resultSet.getString("content_commentaire"));
                addCommentaire.setRatingCommentaire(resultSet.getInt("rating_commentaire"));
                
                listCommentaire.add(addCommentaire);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listCommentaire;
    }
    
    public void disableCommentaire(int id,boolean active) {
        String operation;
        if(active)
            operation = "Activé";
        else
            operation = "Désactivé";
        
        String req = "  Update `commentaire` "
                    + " SET    `status_commentaire`= "+active
                    + " WHERE `id_commentaire` = "+id;
        System.out.println(req);
        JOptionPane jop = new JOptionPane();

        try {
            commentaireStatement.executeUpdate(req);
            jop.showMessageDialog(null, "Mise à jour de commenntaire avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);        
        } catch (SQLException ex) {
            jop.showMessageDialog(null, "erreur lors de mise à jour de commentaire !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
