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
public class Text {
  private int id_text;
 private String description_experience;

    public Text(int id_text, String description_experience) {
        this.id_text = id_text;
        this.description_experience = description_experience;
    }

    public int getId_text() {
        return id_text;
    }

    public void setId_text(int id_text) {
        this.id_text = id_text;
    }

    public String getDescription_experience() {
        return description_experience;
    }

    public void setDescription_experience(String description_experience) {
        this.description_experience = description_experience;
    }

    @Override
    public String toString() {
        return "Text{" + "id_text=" + id_text + ", description_experience=" + description_experience + '}';
    }
 
}
