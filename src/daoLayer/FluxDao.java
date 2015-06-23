/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoLayer;

import com.esprit.connexion.SingletonConnexion;
import com.esprit.entites.Flux;
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
public class FluxDao implements ICrud<Flux>{
    
    private static FluxDao instance;
    private Statement fluxStatement;
    private ResultSet resultSet;
    
    private FluxDao()
    {
        SingletonConnexion singleCnx = SingletonConnexion.getInstance();
        try {
            fluxStatement = singleCnx.getConnectDB().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static FluxDao getInstance()
    {
        if (instance==null) {
            instance = new FluxDao();
        }
        return instance;
    }

    @Override
    public boolean insertEntity(Flux flux) {
        String req = "INSERT INTO `flux` (`lien_flux`, `status_flux`) \n" +
                     "VALUES ('"+flux.getLienFlux()+"', "+flux.getStatusFlux()+");";
        System.out.println(req);
        try {
            fluxStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean UpdateEntity(Flux flux) {
        String req = "Update flux "
                    + "SET lien_flux = "+flux.getLienFlux()
                    + "AND status_flux ="+flux.getStatusFlux()
                    + "WHERE id_flux="+flux.getIdFlux();
   
        try {
            fluxStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteEntity(Flux flux) {
        String req = "DELETE FROM flux where id_flux= "+flux.getIdFlux();

        try {
            fluxStatement.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Flux displayEntityById(int id) {
        String req = "SELECT * FROM flux WHERE id_flux = "+id;
        Flux flux = new Flux();
        try {
            resultSet = fluxStatement.executeQuery(req);
            resultSet.next();
            flux.setIdFlux(resultSet.getInt("id_flux"));
            flux.setLienFlux(resultSet.getString("lien_flux"));
            flux.setStatusFlux(resultSet.getInt("status_flux"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flux;
    }

    @Override
    public List<Flux> displayAllEntity() {
        List<Flux> listFlux = new ArrayList<>();
        String req          = "SELECT * FROM `flux` ORDER BY id_flux";
        System.out.println(req);
        try {
            resultSet = fluxStatement.executeQuery(req);
            
            while (resultSet.next()) {
                Flux addFlux        = new Flux();

                addFlux.setIdFlux(resultSet.getInt("id_flux"));
                addFlux.setLienFlux(resultSet.getString("lien_flux"));
                addFlux.setStatusFlux(resultSet.getInt("status_flux"));
                
                listFlux.add(addFlux);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FluxDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listFlux;
        
    }
    
    public void disableFlux(int id,boolean active) {
        String operation;
        if(active)
            operation = "Activé";
        else
            operation = "Désactivé";
        
        String req =  " Update `flux` "
                    + " SET    `status_flux`= "+active
                    + " WHERE `id_flux` = "+id;
        
        JOptionPane jop = new JOptionPane();

        try {
            fluxStatement.executeUpdate(req);
            jop.showMessageDialog(null, "Le flux est "+operation+" avec succé", "Sucess", JOptionPane.PLAIN_MESSAGE);        
        } catch (SQLException ex) {
            jop.showMessageDialog(null, "erreur lors de la "+operation+" du le flux!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
