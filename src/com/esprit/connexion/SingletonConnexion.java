/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.connexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class SingletonConnexion {
    private String url  = "jdbc:mysql://localhost:3306/besttrip_chamsi";
    private String user = "root";
    private String pwd  = "root";
    
    private Connection connectDB;
    private static SingletonConnexion instance;

    public Connection getConnectDB() {
        return connectDB;
    }
    
    private SingletonConnexion()
    {
        try {
            connectDB = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static SingletonConnexion getInstance()
    {
        if(instance == null)
            instance = new SingletonConnexion();
        
        return instance;
    }
}
