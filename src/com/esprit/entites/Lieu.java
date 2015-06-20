/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.entites;

import java.util.logging.Logger;

/**
 *
 * @author L E N O V O
 */
public class Lieu extends Recommander{
    private int id_lieu;
    private String nom_lieu;
    private String score_lieu;

    public Lieu(int id_lieu, String nom_lieu, String score_lieu, int id_recommander, String type_recommander) {
        super(id_recommander, type_recommander);
        this.id_lieu = id_lieu;
        this.nom_lieu = nom_lieu;
        this.score_lieu = score_lieu;
    }

    public int getId_lieu() {
        return id_lieu;
    }

    public void setId_lieu(int id_lieu) {
        this.id_lieu = id_lieu;
    }

    public String getNom_lieu() {
        return nom_lieu;
    }

    public void setNom_lieu(String nom_lieu) {
        this.nom_lieu = nom_lieu;
    }

    public String getScore_lieu() {
        return score_lieu;
    }

    public void setScore_lieu(String score_lieu) {
        this.score_lieu = score_lieu;
    }

    @Override
    public String toString() {
        return super.toString()+ "Lieu{" + "id_lieu=" + id_lieu + ", nom_lieu=" + nom_lieu + ", score_lieu=" + score_lieu + '}';
    }
    

    
    
}
