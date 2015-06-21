/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Experience;
import daoLayer.ExperienceDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ExperienceAdapter extends AbstractTableModel {
    
    String[] headers     = {"Titre", "Décalage horaire", "Date de début", "Date de fin", "Saison", "Dépense", "Note (/10)", "Pays", "Contenu", "Status"};
    List<Experience> experiences = new ArrayList<>();
    ExperienceDao experienceDao;
    
    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public ExperienceAdapter() {
        experienceDao = ExperienceDao.getInstance();
        experiences = experienceDao.displayAllEntity();
    }

    @Override
    public int getRowCount() {
        return experiences.size();        
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }
    
    @Override
    public String getColumnName(int i) {
        return headers[i];
    }
    
    /*
       Selon id (id_text, id_image ou id_video) en fixe le conntenu
        Une fonction dédie à implémenter dans le DAO
    */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return experiences.get(rowIndex).getTitle_experience();
            case 1:
                return experiences.get(rowIndex).getDecalage_horaire_experience();
            case 2:
                return experiences.get(rowIndex).getStart_experience();
            case 3:
                return experiences.get(rowIndex).getEnd_experience();
            case 4:
                return experiences.get(rowIndex).getSeason_experience();
            case 5:
                return experiences.get(rowIndex).getDepense_experience();
            case 6:
                return experiences.get(rowIndex).getNote_experience();
            case 7:
                return experienceDao.getCountryById(experiences.get(rowIndex).getId_country());
            case 8:
                return "Non implémenter encore";
            case 9:
                return experiences.get(rowIndex).getStatus_experience();
            default:
            return null;
        }        
    }
    
}
