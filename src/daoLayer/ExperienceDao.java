/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import dbConnection.SingletonConnexion;
import entity.Experience;
import interfaces.ICrud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class ExperienceDao implements ICrud<Experience>{
    
    private static ExperienceDao instance;
    private Statement experienceStatement;
    private ResultSet resultSet;
    
    private ExperienceDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            experienceStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static ExperienceDao getinstance()
    {
        if (instance==null) {
            instance = new ExperienceDao();
        }
        return instance;
    }

    @Override
    public void insertEntity(Experience o) {
        String req = "INSERT INTO `experience` (`id_experience`, `title_experience`, `decalage_horaire_experience`, `start_experience`, `end_experience`, `season_experience`, `depense_experience`, `note_experience`, `content_experience`, `status`) \n" +
                     "VALUES (NULL, '"+o.getTitleExperience()+"', '"+o.getDecalageHoraireExperience()+"', '"+o.getStartExperience()+"', '"+o.getEndExperience()+"', '"+o.getSeasonExperience()+"', '"+o.getDepenseExperience()+"', '"+o.getNoteExperience()+"', '"+o.getContentExperience()+"', 0);";
        try {
            experienceStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateEntity(Experience o) {
        String req = "Update experience "
                    + "SET title_experience = "+o.getTitleExperience()
                    + "AND decalage_horaire_experience ="+o.getDecalageHoraireExperience()
                    + "AND start_experience="+o.getStartExperience()
                    + "AND end_experience="+o.getEndExperience()
                    + "AND season_experience="+o.getSeasonExperience()
                    + "AND depense_experience="+o.getDepenseExperience()
                    + "AND note_experience="+o.getNoteExperience()
                    + "AND content_experience="+o.getContentExperience();
        try {
            experienceStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteEntity(Experience o) {
        String req="DELETE FROM experience where id_experience="+o.getIdExperience();

        try {
            experienceStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Experience displayEntityById(int id) {
        String req = "SELECT * FROM experience WHERE id_experience="+id;
        Experience exp = new Experience();
        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();
            exp.setTitleExperience(resultSet.getString("title_experience"));
            exp.setTitleExperience(resultSet.getString("decalage_horaire_experience"));
            exp.setTitleExperience(resultSet.getString("start_experience"));
            exp.setTitleExperience(resultSet.getString("end_experience"));
            exp.setTitleExperience(resultSet.getString("season_experience"));
            exp.setTitleExperience(resultSet.getString("depense_experience"));
            exp.setTitleExperience(resultSet.getString("note_experience"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exp;
    }

    @Override
    public List<Experience> displayAllEntity() {
        List<Experience> listExperience = new ArrayList<>();
        String req = "SELECT * FROM experience";
        Experience addExp = new Experience();
        
        try {
            resultSet = experienceStatement.executeQuery(req);
            
            while (resultSet.next()) {
                addExp.setTitleExperience(resultSet.getString("title_experience"));
                addExp.setTitleExperience(resultSet.getString("decalage_horaire_experience"));
                addExp.setTitleExperience(resultSet.getString("start_experience"));
                addExp.setTitleExperience(resultSet.getString("end_experience"));
                addExp.setTitleExperience(resultSet.getString("season_experience"));
                addExp.setTitleExperience(resultSet.getString("depense_experience"));
                addExp.setTitleExperience(resultSet.getString("note_experience"));
                
                
                listExperience.add(addExp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listExperience;
        
    }

    
    
}
