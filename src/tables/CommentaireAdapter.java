/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Commentaire;
import daoLayer.CommentaireDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.UserListeExperience;

public class CommentaireAdapter extends AbstractTableModel {
    
    String[] headers     = {"Commentaire", "Rating", "Status"};
    List<Commentaire> commentaires = new ArrayList<>();
    CommentaireDao commentaireDao;
    
    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public CommentaireAdapter() {
        commentaireDao = CommentaireDao.getInstance();
        commentaires = commentaireDao.displayByExperience(UserListeExperience.experiencStatic.getId_experience());
    }

    @Override
    public int getRowCount() {
        return commentaires.size();        
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
                if(commentaires.get(rowIndex).getContentCommentaire() != null)
                    return commentaires.get(rowIndex).getContentCommentaire();
            case 1:
                if(commentaires.get(rowIndex).getRatingCommentaire() != 0)
                    return commentaires.get(rowIndex).getRatingCommentaire()+"/10";
            case 2:
                if(commentaires.get(rowIndex).getStatusCommentaire() == 1)
                    return "Activé";
                else
                    return "Désactivé";
            default:
                return null;
        }        
    }
    
}
