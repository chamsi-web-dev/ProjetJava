/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

import java.util.Objects;

/**
 *
 * @author mcb
 */
public class Commentaire {
    private int IdCommentaire;
    private String contentCommentaire;
    private int ratingCommentaire;
    private int idExperience;
    private int statusCommentaire;

    public Commentaire(int IdCommentaire, String contentCommentaire, int ratingCommentaire, int idExperience, int statusCommentaire) {
        this.IdCommentaire = IdCommentaire;
        this.contentCommentaire = contentCommentaire;
        this.ratingCommentaire = ratingCommentaire;
        this.idExperience = idExperience;
        this.statusCommentaire = statusCommentaire;
    }
    
    public Commentaire() {
    }

    public String getContentCommentaire() {
        return contentCommentaire;
    }

    public void setContentCommentaire(String contentCommentaire) {
        this.contentCommentaire = contentCommentaire;
    }

    public int getRatingCommentaire() {
        return ratingCommentaire;
    }

    public void setRatingCommentaire(int ratingCommentaire) {
        this.ratingCommentaire = ratingCommentaire;
    }

    public int getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(int idExperience) {
        this.idExperience = idExperience;
    }

    public int getIdCommentaire() {
        return IdCommentaire;
    }

    public void setIdCommentaire(int IdCommentaire) {
        this.IdCommentaire = IdCommentaire;
    }

    public int getStatusCommentaire() {
        return statusCommentaire;
    }

    public void setStatusCommentaire(int statusCommentaire) {
        this.statusCommentaire = statusCommentaire;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commentaire other = (Commentaire) obj;
        if (this.IdCommentaire != other.IdCommentaire) {
            return false;
        }
        if (!Objects.equals(this.contentCommentaire, other.contentCommentaire)) {
            return false;
        }
        if (this.ratingCommentaire != other.ratingCommentaire) {
            return false;
        }
        if (this.idExperience != other.idExperience) {
            return false;
        }
        if (this.statusCommentaire != other.statusCommentaire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "IdCommentaire=" + IdCommentaire + ", contentCommentaire=" + contentCommentaire + ", ratingCommentaire=" + ratingCommentaire + ", idExperience=" + idExperience + ", statusCommentaire=" + statusCommentaire + '}';
    }
    
}
