/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.entites;

/**
 *
 * @author L E N O V O
 */
public class Ville extends Recommander{
  private int   id_ville;
         private String   nom_ville;
        private int score_ville;

    public Ville(int id_ville, String nom_ville, int score_ville, int id_recommander, String type_recommander) {
        super(id_recommander, type_recommander);
        this.id_ville = id_ville;
        this.nom_ville = nom_ville;
        this.score_ville = score_ville;
    }

    public int getId_ville() {
        return id_ville;
    }

    public void setId_ville(int id_ville) {
        this.id_ville = id_ville;
    }

    public String getNom_ville() {
        return nom_ville;
    }

    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }

    public int getScore_ville() {
        return score_ville;
    }

    public void setScore_ville(int score_ville) {
        this.score_ville = score_ville;
    }

    @Override
    public String toString() {
        return super.toString()+"Ville{" + "id_ville=" + id_ville + ", nom_ville=" + nom_ville + ", score_ville=" + score_ville + '}';
    } 

    
        
    
}
