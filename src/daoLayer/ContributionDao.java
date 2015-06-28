/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Contribution;
import interfaces.ICrud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Login;

/**
 *
 * @author mac
 */
public class ContributionDao implements ICrud<Contribution>{
    
    private static ContributionDao instance;
    private Statement contributionStatement;
    private ResultSet resultSet;
    
    private ContributionDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        try {
            contributionStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ContributionDao getInstance()
    {
        if (instance==null) {
            instance = new ContributionDao();
        }
        return instance;
    }

    @Override
    public boolean insertEntity(Contribution contribution) {
        String req = "INSERT INTO `contribution` (`id_contribution`, `description_contribution`, `status_contribution`, `id_compte`, `id_guide`) \n" +
                     "VALUES ( NULL, '"+contribution.getDescriptionContribution()+"', 0, "+Login.compteStatic.getId_compte()+", "+contribution.getIdGuide()+");";
        System.out.println(req);
        try {
            contributionStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public boolean UpdateEntity(Contribution contribution) {
        /*String req = "Update contribution "
                    + "SET content_contribution = "+contribution.getContentContribution()
                    + "AND rating_contribution ="+contribution.getRatingContribution()
                    + "AND status_contribution ="+contribution.getRatingContribution()
                    + "WHERE id_contribution="+contribution.getIdContribution();
   
        try {
            contributionStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ContributionDao.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return false;
    }

    @Override
    public boolean deleteEntity(Contribution contribution) {
        /*
            String req = "DELETE FROM contribution WHERE id_contribution = "+contribution.getIdContribution();

            try {
                contributionStatement.executeUpdate(req);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(ContributionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
        return false;
    }

    @Override
    public Contribution displayEntityById(int id) {
        String req = "SELECT * FROM contribution WHERE id_contribution = "+id;
        Contribution contribution = new Contribution();
        try {
            resultSet = contributionStatement.executeQuery(req);
            resultSet.next();
            contribution.setDescriptionContribution(resultSet.getString("description_contribution"));
            contribution.setIdContribution(resultSet.getInt("id_contribution"));
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        
        return contribution;
    }

    public List<Contribution> allCommentsByGuide(int id) {
        String req = "SELECT * FROM contribution WHERE id_guide = "+id;
        List<Contribution> listContribution = new ArrayList<>();
        try {
            resultSet = contributionStatement.executeQuery(req);
            
            while (resultSet.next()) {
                Contribution addContribution = new Contribution();

                addContribution.setDescriptionContribution(resultSet.getString("description_contribution"));
                addContribution.setIdContribution(resultSet.getInt("id_contribution"));
                addContribution.setIdCompte(resultSet.getInt("id_compte"));

                listContribution.add(addContribution);
            }
           
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        
        return listContribution;
    }
    
    @Override
    public List<Contribution> displayAllEntity() {
        List<Contribution> listContribution = new ArrayList<>();
        String req          = "SELECT * FROM `contribution` ORDER BY id_contribution";
        try {
            resultSet = contributionStatement.executeQuery(req);
            
            while (resultSet.next()) {
                Contribution addContribution = new Contribution();

                addContribution.setDescriptionContribution(resultSet.getString("description_contribution"));
                addContribution.setIdContribution(resultSet.getInt("id_contribution"));
                addContribution.setIdCompte(resultSet.getInt("id_compte"));
                
                listContribution.add(addContribution);
            }
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        
        return listContribution;
    }
    
    public void disableContribution(int id,boolean active) {
        String operation;
        if(active)
            operation = "Activé";
        else
            operation = "Désactivé";
        
        String req = "  Update `contribution` "
                    + " SET    `status_contribution`= "+active
                    + " WHERE `id_contribution` = "+id;
        JOptionPane jop = new JOptionPane();

        try {
            contributionStatement.executeUpdate(req);
            jop.showMessageDialog(null, "Mise à jour de contribution avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);        
        } catch (SQLException ex) {
            jop.showMessageDialog(null, "erreur lors de mise à jour de contribution !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getCountryById (int id){
        String req = "  SELECT * "
                    + " FROM country as p, guide as g"
                    + " WHERE p.id_country = g.id_country "
                    + " AND   g.id_guide ="+id;

        try {
            resultSet = contributionStatement.executeQuery(req);
            resultSet.next();
            
            return resultSet.getString("name_country");
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    
    public String getCompteByIdGuide(int id){
        String req = "SELECT c.nom_compte, c.prenom_compte "
                + "   FROM compte as c, guide as g "
                + "   WHERE c.id_compte = g.id_compte "
                + "   AND g.id_guide="+id;

        try {
            resultSet = contributionStatement.executeQuery(req);
            resultSet.next();
            String nomPrenom = resultSet.getString("nom_compte")+" "+resultSet.getString("prenom_compte");
            return nomPrenom;
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String getCompteByIdCompte(int id){
        String req = " SELECT nom_compte, prenom_compte"
                   + " FROM   compte"
                   + " WHERE  id_compte="+id;
        try {
            resultSet = contributionStatement.executeQuery(req);
            resultSet.next();
            String nomPrenom = resultSet.getString("nom_compte")+" "+resultSet.getString("prenom_compte");
            return nomPrenom;
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
}
