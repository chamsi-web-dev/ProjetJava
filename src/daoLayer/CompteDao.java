/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Compte;
import interfaces.ICrud;
import java.sql.Connection;
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
public class CompteDao  implements ICrud<Compte>{
    private static CompteDao instance;
    private Statement compteStatement;
    private ResultSet resultCompte;
    private Connection connection;

    private String username, password;
    
    private CompteDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            compteStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CompteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static CompteDao getInstance()
    {
       if(instance == null)
           instance = new CompteDao();
       
       return instance;
    }
    
    @Override
    public boolean insertEntity(Compte compte) {
        String req = "INSERT INTO `Compte` (`nom_compte`, `prenom_compte`, `dob_compte`, `country_compte`, `login_compte`, `pwd_compte`, `type_compte`, `status_compte`) \n" +
                     "VALUES ('"+compte.getNom_compte()+"', '"+compte.getPrenom_compte()+"', '"+compte.getDob_compte()+"', '"+compte.getCountry_compte()+"', '"+compte.getLogin_compte()+"', '"+compte.getPwd_compte()+"', '"+compte.getType_compte()+"', '"+compte.getStatus_compte()+"');";
        System.out.println(req);
        try {
            compteStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean UpdateEntity(Compte compte) {
        String req = "Update Compte "
                    + "SET nom_compte = "+compte.getNom_compte()
                    + "AND prenom_compte ="+compte.getPrenom_compte()
                    + "AND dob_compte="+compte.getDob_compte()
                    + "AND country_compte="+compte.getCountry_compte()
                    + "AND login_compte="+compte.getLogin_compte()
                    + "AND pwd_compte="+compte.getPwd_compte()
                    + "AND type_compte="+compte.getType_compte()
                    + "AND status_compte="+compte.getStatus_compte()
                    + "WHERE id_compte="+compte.getId_compte();
        try {
            compteStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deleteEntity(Compte compte) {
        String req="DELETE FROM Compte where id_compte="+compte.getId_compte();

        try {
            compteStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Compte displayEntityById(int id) {
        String req = "SELECT * FROM Compte WHERE id_compte="+id;
        Compte compte = new Compte();

        try {
            resultCompte = compteStatement.executeQuery(req);
            resultCompte.next();
            compte.setNom_compte(resultCompte.getString("firstname_compte"));
            compte.setPrenom_compte(resultCompte.getString("lastname_compte"));
            compte.setDob_compte(resultCompte.getString("dob_compte"));
            compte.setCountry_compte(resultCompte.getInt("country_compte"));
            compte.setLogin_compte(resultCompte.getString("login_compte"));
            compte.setPwd_compte(resultCompte.getString("pwd_compte"));
            compte.setStatus_compte(resultCompte.getInt("status_compte"));
            compte.setType_compte(resultCompte.getString("type_compte"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return compte;
    }
    
    public String verifyEntity(String username, String password) {
        String reqVerify = "SELECT * FROM compte WHERE login_compte='"+username+"' and pwd_compte = '"+password+"'";
        Compte compte = new Compte();

        try {
            resultCompte = compteStatement.executeQuery(reqVerify);
                //System.out.println(resultCompte.toString());
            if( resultCompte.next()){
                return resultCompte.getString("type_compte");
            }else{
                return "";
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }

    @Override
    public List<Compte> displayAllEntity() {
        String reqVerify = "SELECT * FROM `compte` WHERE `type_compte` = 'Utilisateur'";
        List<Compte> comptes = new ArrayList<Compte>();
        try {
            resultCompte = compteStatement.executeQuery(reqVerify);
            
            while (resultCompte.next()) {
                Compte addCompte = new Compte();
                addCompte.setId_compte(resultCompte.getInt("id_compte"));
                addCompte.setNom_compte(resultCompte.getString("nom_compte"));
                addCompte.setPrenom_compte(resultCompte.getString("prenom_compte"));
                addCompte.setDob_compte(resultCompte.getString("dob_compte"));
                addCompte.setCountry_compte(resultCompte.getInt("country_compte"));
                addCompte.setLogin_compte(resultCompte.getString("login_compte"));
                addCompte.setPwd_compte(resultCompte.getString("pwd_compte"));
                addCompte.setStatus_compte(resultCompte.getInt("status_compte"));
                addCompte.setType_compte(resultCompte.getString("type_compte"));
                comptes.add(addCompte);
            }
            
            return comptes;
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, "erreur lors du chargement !", "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }
    
    public void disableUser(int id,boolean active) {
        String req = "Update `compte` "
                    + "SET `status_compte`= "+active
                    + " WHERE `id_compte` = "+id;
        
        JOptionPane jop = new JOptionPane();

        try {
            compteStatement.executeUpdate(req);
            jop.showMessageDialog(null, "Le compte est désactivé avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);        
        } catch (SQLException ex) {
            jop.showMessageDialog(null, "erreur lors de la désactivation du compte!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        /*
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setBoolean(1, active);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Le compte est désactivé avec succé");
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, "erreur lors de la désactivation du compte!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    
}
