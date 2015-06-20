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
public class Companie extends Recommander {
    private int id_companie;
    private String nom_companie;
    private String type_companie;
    private int score_companie;

    public Companie(int id_companie, String nom_companie, String type_companie, int score_companie, int id_recommander, String type_recommander) {
        super(id_recommander, type_recommander);
        this.id_companie = id_companie;
        this.nom_companie = nom_companie;
        this.type_companie = type_companie;
        this.score_companie = score_companie;
    }

    public int getId_companie() {
        return id_companie;
    }

    public void setId_companie(int id_companie) {
        this.id_companie = id_companie;
    }

    public String getNom_companie() {
        return nom_companie;
    }

    public void setNom_companie(String nom_companie) {
        this.nom_companie = nom_companie;
    }

    public String getType_companie() {
        return type_companie;
    }

    public void setType_companie(String type_companie) {
        this.type_companie = type_companie;
    }

    public int getScore_companie() {
        return score_companie;
    }

    public void setScore_companie(int score_companie) {
        this.score_companie = score_companie;
    }

    @Override
    public String toString() {
        return super.toString()+ "Companie{" + "id_companie=" + id_companie + ", nom_companie=" + nom_companie + ", type_companie=" + type_companie + ", score_companie=" + score_companie + '}';
    }
    
    
}
