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
  private int statuts_guide;

    public Guide(int id_guide, String name_guide, String description_guide, int note_guide, int statuts_guide) {
        this.id_guide = id_guide;
        this.name_guide = name_guide;
        this.description_guide = description_guide;
        this.note_guide = note_guide;
        this.statuts_guide = statuts_guide;
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

    public int getStatuts_guide() {
        return statuts_guide;
    }

    public void setStatuts_guide(int statuts_guide) {
        this.statuts_guide = statuts_guide;
    }

    @Override
    public String toString() {
        return "Guide{" + "id_guide=" + id_guide + ", name_guide=" + name_guide + ", description_guide=" + description_guide + ", note_guide=" + note_guide + ", statuts_guide=" + statuts_guide + '}';
    }
    
  
  
}
