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
public class Guide {
    private int   id_guide;
    private String name_guide;
    private String description_guide;
    private int note_guide;
    private int status_guide;
    private int id_country;
    private int id_compte;

    public Guide(int id_guide, String name_guide, String description_guide, int note_guide, int statuts_guide) {
        this.id_guide = id_guide;
        this.name_guide = name_guide;
        this.description_guide = description_guide;
        this.note_guide = note_guide;
        this.status_guide = statuts_guide;
    }

    public Guide() {
    }

    public int getId_guide() {
        return id_guide;
    }

    public void setId_guide(int id_guide) {
        this.id_guide = id_guide;
    }

    public String getName_guide() {
        return name_guide;
    }

    public void setName_guide(String name_guide) {
        this.name_guide = name_guide;
    }

    public String getDescription_guide() {
        return description_guide;
    }

    public void setDescription_guide(String description_guide) {
        this.description_guide = description_guide;
    }

    public int getNote_guide() {
        return note_guide;
    }

    public void setNote_guide(int note_guide) {
        this.note_guide = note_guide;
    }

    public int getStatus_guide() {
        return status_guide;
    }

    public void setStatus_guide(int statuts_guide) {
        this.status_guide = statuts_guide;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    @Override
    public String toString() {
        return "Guide{" + "id_guide=" + id_guide + ", name_guide=" + name_guide + ", description_guide=" + description_guide + ", note_guide=" + note_guide + ", status_guide=" + status_guide + ", id_country=" + id_country + ", id_compte=" + id_compte + '}';
    }
  
}
