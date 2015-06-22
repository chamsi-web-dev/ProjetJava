/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entites;

import java.sql.Date;

/**
 *
 * @author hassine
 */
public class Statistique {
    
    private int nbr;
    private float note;
    private Date date;
    private int status;
    private String NameCounrty;

    public Statistique(int nbr, Date date, int status) {
        this.nbr = nbr;
        this.date = date;
        this.status = status;
    }

    public Statistique() {
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
    
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNameCounrty() {
        return NameCounrty;
    }

    public void setNameCounrty(String NameCounrty) {
        this.NameCounrty = NameCounrty;
    }

    @Override
    public String toString() {
        return "Statistique{" + "nbr=" + nbr + ", note=" + note + ", date=" + date + ", status=" + status + ", NameCounrty=" + NameCounrty + '}';
    }

    
}
