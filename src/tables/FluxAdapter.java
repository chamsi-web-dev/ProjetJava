/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tables;

import com.esprit.entites.Flux;
import daoLayer.FluxDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FluxAdapter extends AbstractTableModel {
    
    String[] headers     = {"Lien de flux", "Status"};
    List<Flux> flux = new ArrayList<>();
    FluxDao fluxDao;
    
    public List<Flux> getFluxs() {
        return flux;
    }

    public void setFluxs(List<Flux> flux) {
        this.flux = flux;
    }

    public FluxAdapter() {
        fluxDao = FluxDao.getInstance();
        flux = fluxDao.displayAllEntity();
    }

    @Override
    public int getRowCount() {
        return flux.size();        
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
                return flux.get(rowIndex).getLienFlux();
            case 1:
                if(flux.get(rowIndex).getStatusFlux() == 1)
                    return "Activé";
                else
                    return "Désactivé";
            default:
            return null;
        }        
    }
    
}
