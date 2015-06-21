/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Guide;
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
    
    public static GuideDao getInstance()
    {
        if (instance==null) {
            instance = new GuideDao();
        }
        return instance;
    }

    @Override
    public boolean insertEntity(Guide g) {
        String req = "INSERT INTO `guide` (`id_guide`, `name_guide`, `description_guide`, `note_guide`, `statuts_guide`, `id_country`, `id_compte`) \n" +
                     "VALUES ('', '"+g.getName_guide()+"', '"+g.getDescription_guide()+"', '"+g.getNote_guide()+"', '"+g.getStatus_guide()+", '"+g.getId_country()+", '"+g.getId_compte()+"');";
        try {
            guideStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean UpdateEntity(Guide g) {
        String req = "Update guide "
                    + "SET name_guide = "+g.getName_guide()
                    + "AND description_guide ="+g.getDescription_guide()
                    + "AND note_guide ="+g.getNote_guide()
                    + "AND statuts_guide ="+g.getStatus_guide()
                    + "AND id_country ="+g.getId_country()
                    + "AND id_compte ="+g.getId_compte();
        try {
            guideStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean deleteEntity(Guide g) {
        String req="DELETE FROM guide where id_guide="+g.getId_guide();

        try {
            guideStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public Guide displayEntityById(int id) {
        String req = "SELECT * FROM guide WHERE id_guide="+id;
        Guide guide = new Guide();

        try {
            resultGuide = guideStatement.executeQuery(req);
            resultGuide.next();
            
            guide.setName_guide(resultGuide.getString("name_guide"));
            guide.setDescription_guide(resultGuide.getString("description_guide"));
            guide.setNote_guide(resultGuide.getInt("note_guide"));
            guide.setStatus_guide(resultGuide.getInt("status_guide"));
            guide.setId_compte(resultGuide.getInt("id_compte"));
            guide.setId_country(resultGuide.getInt("id_country"));
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return guide;
    }

    @Override
    public List<Guide> displayAllEntity() {
        List<Guide> listGuide = new ArrayList<>();
        String req = "SELECT * FROM guide";
        
        try {
            resultGuide = guideStatement.executeQuery(req);
            
            while (resultGuide.next()) {
                Guide addGuide = new Guide();
                addGuide.setId_guide(resultGuide.getInt("id_guide"));
                addGuide.setName_guide(resultGuide.getString("name_guide"));
                addGuide.setDescription_guide(resultGuide.getString("description_guide"));
                addGuide.setNote_guide(resultGuide.getInt("note_guide"));
                addGuide.setStatus_guide(resultGuide.getInt("status_guide"));
                addGuide.setId_country(resultGuide.getInt("id_compte"));
                addGuide.setId_country(resultGuide.getInt("id_country"));
                
                listGuide.add(addGuide);
            }
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return listGuide;
        
    }
    
    public boolean disableGuide(int idGuide, boolean status){
        String operation;
        if(status){
            operation = "Activé";
        }else{
            operation = "Désactivé";
        }

        String req = "  Update `guide` "
                    + " SET `status_guide`  = "+status
                    + " WHERE `id_guide`    = "+idGuide;
        System.out.println(req);
        JOptionPane jop = new JOptionPane();

        try {
            guideStatement.executeUpdate(req);
            jop.showMessageDialog(null, "Le guide est "+operation+" avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);
            return true;
        } catch (SQLException ex) {
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public String getCountryById (int id){
        String req = "SELECT * FROM country WHERE id_country="+id;
        Guide guide = new Guide();

        try {
            resultGuide = guideStatement.executeQuery(req);
            resultGuide.next();
            
            return resultGuide.getString("name_country");
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }

}
