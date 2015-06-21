/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Compte;
import daoLayer.CompteDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UtilisateurAdapter extends AbstractTableModel {
    
    String[] headers     = {"Nom", "Prénom", "Date Naissance", "Pays", "Login", "Type de compte", "Status"};
    List<Compte> comptes = new ArrayList<>();
    CompteDao cDao;
    
    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public UtilisateurAdapter() {
        cDao = CompteDao.getInstance();
        comptes = cDao.displayAllEntity();
    }

    @Override
    public int getRowCount() {
        return comptes.size();        
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
                return comptes.get(rowIndex).getNom_compte();
            case 1:
                return comptes.get(rowIndex).getPrenom_compte();
            case 2:
                return comptes.get(rowIndex).getDob_compte();
            case 3:
                if(comptes.get(rowIndex).getCountry_compte() == 2){
                    return "France";
                }else if(comptes.get(rowIndex).getCountry_compte() == 0){
                    return "Tunisie";
                } 
            case 4:
                return comptes.get(rowIndex).getLogin_compte();
            case 5:
                return comptes.get(rowIndex).getType_compte();
            case 6:
                if(comptes.get(rowIndex).getStatus_compte() == 1){
                    return "Activé";
                }else if(comptes.get(rowIndex).getStatus_compte() == 0){
                    return "Désactivé";
                }                       
            default:
            return null;
        }        
    }
    
}
