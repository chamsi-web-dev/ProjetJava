/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Image;
import com.esprit.entites.Image;
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
public class ImageDao {
    
    private static ImageDao instance;
    private Statement imageStatement;
    private ResultSet resultImage;
    public static int lastInsertedIdImage;

    private ImageDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            imageStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ImageDao getInstance()
    {
        if (instance==null) {
            instance = new ImageDao();
        }
        return instance;
    }

    public boolean insertEntity(Image v) {
        String req = "INSERT INTO `image` (`id_image`, `path_url_image`) \n" +
                     "VALUES (NULL, '"+v.getPath_url_image()+"');";
        System.out.println(req);
        try {
            imageStatement.executeUpdate(req);
            ResultSet rs = imageStatement.getGeneratedKeys();
            if (rs.next()){
                lastInsertedIdImage =rs.getInt(1);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public Image displayEntityById(int id) {
        String req = "SELECT * FROM image WHERE id_image="+id;
        Image image = new Image();

        try {
            resultImage = imageStatement.executeQuery(req);
            resultImage.next();
            
            image.setPath_url_image(resultImage.getString("path_url_image"));
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return image;
    }

    
    

}
