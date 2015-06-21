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
public class Experience {
    private int  id_experience;
    private String title_experience;
    private int decalage_horaire_experience;
    private String start_experience;
    private String end_experience;
    private String season_experience;
    private float depense_experience;
    private int note_experience;
    private int id_text;
    private int id_image;
    private int id_video;
    private int status_experience;
    private int id_compte;
    private int id_country;

    public Experience(int id_experience, String title_experience, int decalage_horaire_experience, String start_experience, String end_experience, String season_experience, float depense_experience, int note_experience) {
        this.id_experience = id_experience;
        this.title_experience = title_experience;
        this.decalage_horaire_experience = decalage_horaire_experience;
        this.start_experience = start_experience;
        this.end_experience = end_experience;
        this.season_experience = season_experience;
        this.depense_experience = depense_experience;
        this.note_experience = note_experience;
    }

    public Experience() {
    }
    
    public int getId_experience() {
        return id_experience;
    }

    public void setId_experience(int id_experience) {
        this.id_experience = id_experience;
    }

    public String getTitle_experience() {
        return title_experience;
    }

    public void setTitle_experience(String title_experience) {
        this.title_experience = title_experience;
    }

    public int getDecalage_horaire_experience() {
        return decalage_horaire_experience;
    }

    public void setDecalage_horaire_experience(int decalage_horaire_experience) {
        this.decalage_horaire_experience = decalage_horaire_experience;
    }

    public String getStart_experience() {
        return start_experience;
    }

    public void setStart_experience(String start_experience) {
        this.start_experience = start_experience;
    }

    public String getEnd_experience() {
        return end_experience;
    }

    public void setEnd_experience(String end_experience) {
        this.end_experience = end_experience;
    }

    public String getSeason_experience() {
        return season_experience;
    }

    public void setSeason_experience(String season_experience) {
        this.season_experience = season_experience;
    }

    public float getDepense_experience() {
        return depense_experience;
    }

    public void setDepense_experience(float depense_experience) {
        this.depense_experience = depense_experience;
    }

    public int getNote_experience() {
        return note_experience;
    }

    public void setNote_experience(int note_experience) {
        this.note_experience = note_experience;
    }

    public int getId_text() {
        return id_text;
    }

    public void setId_text(int id_text) {
        this.id_text = id_text;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public int getStatus_experience() {
        return status_experience;
    }

    public void setStatus_experience(int status_experience) {
        this.status_experience = status_experience;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    @Override
    public String toString() {
        return "Experience{" + "id_experience=" + id_experience + ", title_experience=" + title_experience + ", decalage_horaire_experience=" + decalage_horaire_experience + ", start_experience=" + start_experience + ", end_experience=" + end_experience + ", season_experience=" + season_experience + ", depense_experience=" + depense_experience + ", note_experience=" + note_experience + ", id_text=" + id_text + ", id_image=" + id_image + ", id_video=" + id_video + ", status_experience=" + status_experience + ", id_compte=" + id_compte + ", id_country=" + id_country + '}';
    }
    

}
