/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Text;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class TexteDao {
    
    private static TexteDao instance;
    private Statement textStatement;
    private ResultSet resultText;
    public static int lastInsertedId;
    
    private TexteDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            textStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static TexteDao getInstance()
    {
        if (instance==null) {
            instance = new TexteDao();
        }
        return instance;
    }

    public boolean insertEntity(Text t) {
        String req = "INSERT INTO `text` (`id_text`, `description_experience`) \n" +
                     "VALUES (NULL, '"+t.getDescription_experience()+"');";
        System.out.println(req);
        try {
            textStatement.executeUpdate(req, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = textStatement.getGeneratedKeys();
            if (rs.next()){
                lastInsertedId =rs.getInt(1);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public String displayEntityById(int id) {
        String req = "SELECT * FROM text WHERE id_text="+id;
        Text text = new Text();
        
        try {
            resultText = textStatement.executeQuery(req);
            resultText.next();
            System.out.println(resultText.getString("description_experience"));
            return resultText.getString("description_experience");
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
    }

    
    

}
