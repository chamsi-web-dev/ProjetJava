/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

//import edu.successMembers.DAO.Interfaces.IStatistiqueDAO;
//import edu.successMembers.entities.Gerant;
//import edu.successMembers.entities.Stat;
//import edu.successMembers.util.MyConnection;
import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Statistique;
import java.util.Date;
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
 * @author mcb
 */
public class StatistiqueDao {

    
    private static StatistiqueDao instance;
    private Statement statistiqueStatement;
    private ResultSet resultSet;

    private StatistiqueDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        try {
            statistiqueStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static StatistiqueDao getInstance()
    {
        if (instance==null) {
            instance = new StatistiqueDao();
        }
        return instance;
    }

    public List<Statistique> getAllExperienceByStatus(int idStatus) {
        List<Statistique> list = new ArrayList<>();
        String req = "SELECT COUNT( * ) AS  'nbr',  `status_experience` \n"
            + "FROM     `experience` \n"
            + "WHERE    `status_experience` = "+idStatus+" \n";
        
        try {
            resultSet= statistiqueStatement.executeQuery(req);
            System.out.println(resultSet.toString());
            while (resultSet.next()) {
                Statistique stat = new Statistique();
                stat.setNbr(resultSet.getInt("nbr"));
                stat.setStatus(resultSet.getInt("status_experience"));
                list.add(stat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur lors de la récuperation des données " + ex.getMessage());
        }
        return list;
    }
    
    public List<Statistique> getAllGuideByCountry(int idCountry) {
        List<Statistique> list = new ArrayList<>();
        String req = "SELECT COUNT( * ) AS  'nbr',g.`id_country`, c.`name_country` \n"
            + "FROM    `guide` g, country c\n"
            + "WHERE   g.`id_country` = "+idCountry+" \n"
            + "AND    c.`id_country` = g.`id_country` \n";
        System.out.println(req);
        try {
            resultSet = statistiqueStatement.executeQuery(req);
            System.out.println(resultSet.toString());
            while (resultSet.next()) {
                Statistique stat = new Statistique();
                stat.setNbr(resultSet.getInt("nbr"));
                stat.setNameCounrty(resultSet.getString("name_country"));
                list.add(stat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur lors de la récuperation des données " + ex.getMessage());
        }
        return list;
    }
    
    public List<Statistique> getAllCompteByStatus(int idStatusCompte) {
        List<Statistique> list = new ArrayList<>();
        String req = "SELECT COUNT( * ) AS  'nbr',  `status_compte` \n"
            + "FROM     `compte` \n"
            + "WHERE    `status_compte` = "+idStatusCompte+" \n";
        
        try {
            resultSet= statistiqueStatement.executeQuery(req);
            System.out.println(resultSet.toString());
            while (resultSet.next()) {
                Statistique stat = new Statistique();
                stat.setNbr(resultSet.getInt("nbr"));
                stat.setStatus(resultSet.getInt("status_compte"));
                list.add(stat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur lors de la récuperation des données " + ex.getMessage());
        }
        return list;
    }

}
