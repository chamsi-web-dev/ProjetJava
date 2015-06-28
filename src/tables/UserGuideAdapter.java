/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Guide;
import daoLayer.GuideDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UserGuideAdapter extends AbstractTableModel {
    
    String[] headers     = {"Titre", "Description", "Note", "Pays"};
    List<Guide> guides = new ArrayList<>();
    GuideDao gDao;
    
    public List<Guide> getGuides() {
        return guides;
    }

    public void setGuides(List<Guide> guides) {
        this.guides = guides;
    }

    public UserGuideAdapter() {
        gDao = GuideDao.getInstance();
        guides = gDao.displayAllEnableEntity();
    }
    
    public UserGuideAdapter(int id) {
        gDao = GuideDao.getInstance();
        guides = gDao.displayAllGuideByCountry(id);
    }

    @Override
    public int getRowCount() {
        return guides.size();        
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }
    
    @Override
    public String getColumnName(int i) {
        return headers[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return guides.get(rowIndex).getName_guide();
            case 1:
                return guides.get(rowIndex).getDescription_guide();
            case 2:
                return guides.get(rowIndex).getNote_guide();
            case 3:
                return gDao.getCountryById(guides.get(rowIndex).getId_country());
            default:
            return null;
        }        
    }
    
}
