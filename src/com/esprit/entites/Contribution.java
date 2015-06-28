/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

/**
 *
 * @author mcb
 */
public class Contribution {
    private int idContribution;
    private String descriptionContribution;
    private int statusContribution;
    private int idGuide;
    private int idCompte;

    public Contribution() {
    }

    public Contribution(int idContribution, String descriptionContribution, int statusContribution, int idGuide, int idCompte) {
        this.idContribution = idContribution;
        this.descriptionContribution = descriptionContribution;
        this.statusContribution = statusContribution;
        this.idGuide = idGuide;
        this.idCompte = idCompte;
    }

    public int getIdContribution() {
        return idContribution;
    }

    public void setIdContribution(int idContribution) {
        this.idContribution = idContribution;
    }

    public String getDescriptionContribution() {
        return descriptionContribution;
    }

    public void setDescriptionContribution(String descriptionContribution) {
        this.descriptionContribution = descriptionContribution;
    }

    public int getStatusContribution() {
        return statusContribution;
    }

    public void setStatusContribution(int statusContribution) {
        this.statusContribution = statusContribution;
    }

    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    @Override
    public String toString() {
        return "Contribution{" + "idContribution=" + idContribution + ", descriptionContribution=" + descriptionContribution + ", statusContribution=" + statusContribution + ", idGuide=" + idGuide + ", idCompte=" + idCompte + '}';
    }

}
