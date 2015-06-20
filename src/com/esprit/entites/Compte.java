/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.entites;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author L E N O V O
 */
public class Compte {
  private int  id_compte;
  private String nom_compte;
  private String prenom_compte;;
  private Date dob_compte;
  private int country_compte;
  private String login_compte;
  private String pwd_compte;
  private String type_compte;
  private int status_compte;
  private List<Experience>experience=new ArrayList<Experience>();
  private List<Guide>guide= new ArrayList<Guide>();
  private List<Recommander>recommander=new ArrayList<Recommander>();

    public Compte(int id_compte, String nom_compte, String prenom_compte, Date dob_compte, int country_compte, String login_compte, String pwd_compte, String type_compte, int status_compte) {
        this.id_compte = id_compte;
        this.nom_compte = nom_compte;
        this.prenom_compte = prenom_compte;
        this.dob_compte = dob_compte;
        this.country_compte = country_compte;
        this.login_compte = login_compte;
        this.pwd_compte = pwd_compte;
        this.type_compte = type_compte;
        this.status_compte = status_compte;
    }

    public Compte() {
    }
    

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public String getNom_compte() {
        return nom_compte;
    }

    public void setNom_compte(String nom_compte) {
        this.nom_compte = nom_compte;
    }

    public String getPrenom_compte() {
        return prenom_compte;
    }

    public void setPrenom_compte(String prenom_compte) {
        this.prenom_compte = prenom_compte;
    }

    public Date getDob_compte() {
        return dob_compte;
    }

    public void setDob_compte(Date dob_compte) {
        this.dob_compte = dob_compte;
    }

    public int getCountry_compte() {
        return country_compte;
    }

    public void setCountry_compte(int country_compte) {
        this.country_compte = country_compte;
    }

    public String getLogin_compte() {
        return login_compte;
    }

    public void setLogin_compte(String login_compte) {
        this.login_compte = login_compte;
    }

    public String getPwd_compte() {
        return pwd_compte;
    }

    public void setPwd_compte(String pwd_compte) {
        this.pwd_compte = pwd_compte;
    }

    public String getType_compte() {
        return type_compte;
    }

    public void setType_compte(String type_compte) {
        this.type_compte = type_compte;
    }

    public int getStatus_compte() {
        return status_compte;
    }

    public void setStatus_compte(int status_compte) {
        this.status_compte = status_compte;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Guide> getGuide() {
        return guide;
    }

    public void setGuide(List<Guide> guide) {
        this.guide = guide;
    }

    public List<Recommander> getRecommander() {
        return recommander;
    }

    public void setRecommander(List<Recommander> recommander) {
        this.recommander = recommander;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id_compte;
        hash = 79 * hash + Objects.hashCode(this.nom_compte);
        hash = 79 * hash + Objects.hashCode(this.prenom_compte);
        hash = 79 * hash + Objects.hashCode(this.dob_compte);
        hash = 79 * hash + this.country_compte;
        hash = 79 * hash + Objects.hashCode(this.login_compte);
        hash = 79 * hash + Objects.hashCode(this.pwd_compte);
        hash = 79 * hash + Objects.hashCode(this.type_compte);
        hash = 79 * hash + this.status_compte;
        hash = 79 * hash + Objects.hashCode(this.experience);
        hash = 79 * hash + Objects.hashCode(this.guide);
        hash = 79 * hash + Objects.hashCode(this.recommander);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compte other = (Compte) obj;
        if (this.id_compte != other.id_compte) {
            return false;
        }
        if (!Objects.equals(this.nom_compte, other.nom_compte)) {
            return false;
        }
        if (!Objects.equals(this.prenom_compte, other.prenom_compte)) {
            return false;
        }
        if (!Objects.equals(this.dob_compte, other.dob_compte)) {
            return false;
        }
        if (this.country_compte != other.country_compte) {
            return false;
        }
        if (!Objects.equals(this.login_compte, other.login_compte)) {
            return false;
        }
        if (!Objects.equals(this.pwd_compte, other.pwd_compte)) {
            return false;
        }
        if (!Objects.equals(this.type_compte, other.type_compte)) {
            return false;
        }
        if (this.status_compte != other.status_compte) {
            return false;
        }
        if (!Objects.equals(this.experience, other.experience)) {
            return false;
        }
        if (!Objects.equals(this.guide, other.guide)) {
            return false;
        }
        if (!Objects.equals(this.recommander, other.recommander)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compte{" + "id_compte=" + id_compte + ", nom_compte=" + nom_compte + ", prenom_compte=" + prenom_compte + ", dob_compte=" + dob_compte + ", country_compte=" + country_compte + ", login_compte=" + login_compte + ", pwd_compte=" + pwd_compte + ", type_compte=" + type_compte + ", status_compte=" + status_compte + ", experience=" + experience + ", guide=" + guide + ", recommander=" + recommander + '}';
    }
    
  
}
