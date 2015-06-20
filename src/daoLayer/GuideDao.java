/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import dbConnection.SingletonConnexion;
import entity.Compte;
import entity.Guide;
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
public class GuideDao implements ICrud<Guide>{
    
    private static GuideDao instance;
    private Statement guideStatement;
    private ResultSet resultGuide;
    
    private GuideDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            guideStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static GuideDao getinstance()
    {
        if (instance==null) {
            instance = new GuideDao();
        }
        return instance;
    }

    @Override
    public void insertEntity(Guide o) {
        String req = "INSERT INTO `guide` (`id_guide`, `name_guide`, `description_guide`, `note_guide`, `id_country`) \n" +
                     "VALUES (NULL, '"+o.getNameGuide()+"', '"+o.getDescriptionGuide()+"', '"+o.getNoteGuide()+"', '"+o.getIdCountry()+"');";
        try {
            guideStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(GuideDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateEntity(Guide o) {
        String req = "Update account "
                    + "SET name_guide = "+o.getNameGuide()
                    + "AND description_guide ="+o.getDescriptionGuide()
                    + "AND note_guide="+o.getNoteGuide()
                    + "AND id_country="+o.getIdCountry();
        try {
            guideStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(GuideDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteEntity(Guide o) {
        String req="DELETE FROM account where id_account="+o.getIdCountry();

        try {
            guideStatement.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(GuideDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Guide displayEntityById(int id) {
        String req = "SELECT * FROM account WHERE id_account="+id;
        Guide guide = new Guide();

        try {
            resultGuide = guideStatement.executeQuery(req);
            resultGuide.next();
            
            guide.setNameGuide(resultGuide.getString("name_guide"));
            guide.setDescriptionGuide(resultGuide.getString("description_guide"));
            guide.setNoteGuide(resultGuide.getInt("note_guide"));
            guide.setIdCountry(resultGuide.getInt("id_country"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return guide;
    }

    @Override
    public List<Guide> displayAllEntity() {
        List<Guide> listGuide = new ArrayList<>();
        String req = "SELECT * FROM guide";
        Guide addGuide = new Guide();
        
        try {
            resultGuide = guideStatement.executeQuery(req);
            
            while (resultGuide.next()) {
                addGuide.setNameGuide(resultGuide.getString("name_guide"));
                addGuide.setDescriptionGuide(resultGuide.getString("description_guide"));
                addGuide.setNoteGuide(resultGuide.getInt("note_guide"));
                addGuide.setIdCountry(resultGuide.getInt("id_country"));
                
                listGuide.add(addGuide);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listGuide;
        
    }

}
