/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Contribution;
import daoLayer.ContributionDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.UserListeGuide;

public class ContributionGuideAdapter extends AbstractTableModel {
    
    String[] headers     = {"Contribution", "Utilisateur"};
    List<Contribution> guides = new ArrayList<>();
    ContributionDao gDao;
    
    public List<Contribution> getContributions() {
        return guides;
    }

    public void setContributions(List<Contribution> guides) {
        this.guides = guides;
    }

    public ContributionGuideAdapter() {
        gDao   = ContributionDao.getInstance();
        guides = gDao.allCommentsByGuide(UserListeGuide.guideStatic.getId_guide());
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
                return guides.get(rowIndex).getDescriptionContribution();
            case 1:
                return gDao.getCompteByIdCompte(guides.get(rowIndex).getIdCompte());
            default:
            return null;
        }        
    }
    
}
