/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Experience;
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
public class ExperienceDao implements ICrud<Experience> {

    private static ExperienceDao instance;
    private Statement experienceStatement;
    private ResultSet resultSet;

    private ExperienceDao() {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        try {
            experienceStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ExperienceDao getInstance() {
        if (instance == null) {
            instance = new ExperienceDao();
        }
        return instance;
    }

    @Override
    public boolean insertEntity(Experience exp) {
        String req = "INSERT INTO `experience` (`id_experience`, `title_experience`, `decalage_horaire_experience`, `start_experience`, `end_experience`, `season_experience`, `depense_experience`, `note_experience`, `id_text`, `id_video`, `id_image`, `id_compte`, `status_experience`, `id_country`) \n"
                + "VALUES (null , '" + exp.getTitle_experience() + "', " + exp.getDecalage_horaire_experience() + ", '" + exp.getStart_experience() + "', '" + exp.getEnd_experience() + "', " + exp.getSeason_experience() + ", '" + exp.getDepense_experience() + "', " + exp.getNote_experience() + ", " + exp.getId_text() + ", " + exp.getId_video() + ", " + exp.getId_image() + ", " + exp.getId_compte() + ", " + exp.getStatus_experience() + ", " + exp.getId_country()+ ");";
        System.out.println(req);
        try {
            experienceStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean UpdateEntity(Experience exp) {
        String req = "Update experience "
                + "SET title_experience = " + exp.getTitle_experience()
                + "AND decalage_horaire_experience =" + exp.getDecalage_horaire_experience()
                + "AND start_experience=" + exp.getStart_experience()
                + "AND end_experience=" + exp.getEnd_experience()
                + "AND season_experience=" + exp.getSeason_experience()
                + "AND depense_experience=" + exp.getDepense_experience()
                + "AND note_experience=" + exp.getNote_experience()
                + "AND id_text=" + exp.getId_text()
                + "AND id_video=" + exp.getId_video()
                + "AND id_image=" + exp.getId_image()
                + "AND id_compte=" + exp.getId_compte()
                + "AND id_country=" + exp.getId_country()
                + "AND status_experience=" + exp.getStatus_experience()
                + "WHERE id_experience=" + exp.getId_experience();

        try {
            experienceStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteEntity(Experience exp) {
        String req = "DELETE FROM experience where id_experience=" + exp.getId_experience();

        try {
            experienceStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Experience displayEntityById(int id) {
        String req = "SELECT * FROM experience WHERE id_experience=" + id;
        Experience experience = new Experience();
        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();
            experience.setTitle_experience(resultSet.getString("title_experience"));
            experience.setDecalage_horaire_experience(resultSet.getInt("decalage_horaire_experience"));
            experience.setStart_experience(resultSet.getString("start_experience"));
            experience.setEnd_experience(resultSet.getString("end_experience"));
            experience.setSeason_experience(Integer.parseInt(resultSet.getString("season_experience")));
            experience.setDepense_experience(resultSet.getFloat("depense_experience"));
            experience.setNote_experience(resultSet.getInt("note_experience"));
            experience.setId_text(resultSet.getInt("id_text"));
            experience.setId_image(resultSet.getInt("id_image"));
            experience.setId_video(resultSet.getInt("id_video"));
            experience.setId_compte(resultSet.getInt("id_compte"));
            experience.setId_country(resultSet.getInt("id_country"));
            experience.setStatus_experience(resultSet.getInt("status_experience"));

        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return experience;
    }

    @Override
    public List<Experience> displayAllEntity() {
        List<Experience> listExperience = new ArrayList<>();
        String req = "SELECT * FROM experience ORDER BY id_experience";

        try {
            resultSet = experienceStatement.executeQuery(req);

            while (resultSet.next()) {
                Experience addExp = new Experience();
                addExp.setId_experience(resultSet.getInt("id_experience"));
                addExp.setTitle_experience(resultSet.getString("title_experience"));
                addExp.setDecalage_horaire_experience(resultSet.getInt("decalage_horaire_experience"));
                addExp.setStart_experience(resultSet.getString("start_experience"));
                addExp.setEnd_experience(resultSet.getString("end_experience"));
                addExp.setSeason_experience(Integer.parseInt(resultSet.getString("season_experience")));
                addExp.setDepense_experience(resultSet.getFloat("depense_experience"));
                addExp.setNote_experience(resultSet.getInt("note_experience"));
                addExp.setId_text(resultSet.getInt("id_text"));
                addExp.setId_image(resultSet.getInt("id_image"));
                addExp.setId_video(resultSet.getInt("id_video"));
                addExp.setId_compte(resultSet.getInt("id_compte"));
                addExp.setId_country(resultSet.getInt("id_country"));
                addExp.setStatus_experience(resultSet.getInt("status_experience"));

                listExperience.add(addExp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ExperienceDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listExperience;

    }

    public void disableExperience(int id, boolean active) {
        String operation;
        if (active) {
            operation = "Activé";
        } else {
            operation = "Désactivé";
        }

        String req = "Update `experience` "
                + "SET    `status_experience`= " + active
                + " WHERE `id_experience` = " + id;

        JOptionPane jop = new JOptionPane();

        try {
            experienceStatement.executeUpdate(req);
            jop.showMessageDialog(null, "L'expérience est " + operation + " avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            jop.showMessageDialog(null, "erreur lors de la " + operation + " du l'expérience!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCountryById(int id) {
        String req = "SELECT * FROM country WHERE id_country=" + id;

        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();

            return resultSet.getString("name_country");

        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public String getTextById(int id) {
        String req = "SELECT description_experience FROM text WHERE id_text=" + id;

        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();

            return resultSet.getString("description_experience");

        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getVideoById(int id) {
        String req = "SELECT path_video FROM video WHERE id_video=" + id;

        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();

            return resultSet.getString("path_video");

        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getCompteById(int id) {
        String req = "SELECT nom_compte, prenom_compte FROM compte WHERE id_compte=" + id;

        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();
            String nomPrenom = resultSet.getString("nom_compte") + " " + resultSet.getString("prenom_compte");
            return nomPrenom;

        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getImageById(int id) {
        String req = "SELECT path_url_image FROM image WHERE id_image = " + id;

        try {
            resultSet = experienceStatement.executeQuery(req);
            resultSet.next();

            return resultSet.getString("path_url_image");

        } catch (SQLException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
