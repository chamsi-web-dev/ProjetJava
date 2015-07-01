/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Video;
import com.esprit.entites.Video;
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
public class VideoDao {
    
    private static VideoDao instance;
    private Statement videoStatement;
    private ResultSet resultVideo;
    public static int lastInsertedIdVideo;

    private VideoDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        
        try {
            videoStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static VideoDao getInstance()
    {
        if (instance==null) {
            instance = new VideoDao();
        }
        return instance;
    }

    public boolean insertEntity(Video v) {
        String req = "INSERT INTO `video` (`id_video`, `path_video`) \n" +
                     "VALUES (NULL, '"+v.getPath_video()+"');";
        System.out.println(req);
        try {
            videoStatement.executeUpdate(req);
            ResultSet rs = videoStatement.getGeneratedKeys();
            if (rs.next()){
                lastInsertedIdVideo =rs.getInt(1);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public Video displayEntityById(int id) {
        String req = "SELECT * FROM video WHERE id_video="+id;
        Video video = new Video();

        try {
            resultVideo = videoStatement.executeQuery(req);
            resultVideo.next();
            
            video.setPath_video(resultVideo.getString("path_video"));
            
        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return video;
    }

}
