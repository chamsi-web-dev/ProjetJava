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
public class Experience {
  private int  id_experience;
  private String title_experience;
 private int decalage_horaire_experience;
  private Date start_experience;
  private Date end_experience;
  private String season_experience;
  private float depense_experience;
  private int note_experience;
  private List<Text>text=new ArrayList<Text>();
  private List<Image>image=new ArrayList<Image>();
  private List<Video>video=new ArrayList<Video>();

    public Experience(int id_experience, String title_experience, int decalage_horaire_experience, Date start_experience, Date end_experience, String season_experience, float depense_experience, int note_experience) {
        this.id_experience = id_experience;
        this.title_experience = title_experience;
        this.decalage_horaire_experience = decalage_horaire_experience;
        this.start_experience = start_experience;
        this.end_experience = end_experience;
        this.season_experience = season_experience;
        this.depense_experience = depense_experience;
        this.note_experience = note_experience;
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

    public Date getStart_experience() {
        return start_experience;
    }

    public void setStart_experience(Date start_experience) {
        this.start_experience = start_experience;
    }

    public Date getEnd_experience() {
        return end_experience;
    }

    public void setEnd_experience(Date end_experience) {
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

    public List<Text> getText() {
        return text;
    }

    public void setText(List<Text> text) {
        this.text = text;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public List<Video> getVideo() {
        return video;
    }

    public void setVideo(List<Video> video) {
        this.video = video;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_experience;
        hash = 97 * hash + Objects.hashCode(this.title_experience);
        hash = 97 * hash + this.decalage_horaire_experience;
        hash = 97 * hash + Objects.hashCode(this.start_experience);
        hash = 97 * hash + Objects.hashCode(this.end_experience);
        hash = 97 * hash + Objects.hashCode(this.season_experience);
        hash = 97 * hash + Float.floatToIntBits(this.depense_experience);
        hash = 97 * hash + this.note_experience;
        hash = 97 * hash + Objects.hashCode(this.text);
        hash = 97 * hash + Objects.hashCode(this.image);
        hash = 97 * hash + Objects.hashCode(this.video);
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
        final Experience other = (Experience) obj;
        if (this.id_experience != other.id_experience) {
            return false;
        }
        if (!Objects.equals(this.title_experience, other.title_experience)) {
            return false;
        }
        if (this.decalage_horaire_experience != other.decalage_horaire_experience) {
            return false;
        }
        if (!Objects.equals(this.start_experience, other.start_experience)) {
            return false;
        }
        if (!Objects.equals(this.end_experience, other.end_experience)) {
            return false;
        }
        if (!Objects.equals(this.season_experience, other.season_experience)) {
            return false;
        }
        if (Float.floatToIntBits(this.depense_experience) != Float.floatToIntBits(other.depense_experience)) {
            return false;
        }
        if (this.note_experience != other.note_experience) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.video, other.video)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Experience{" + "id_experience=" + id_experience + ", title_experience=" + title_experience + ", decalage_horaire_experience=" + decalage_horaire_experience + ", start_experience=" + start_experience + ", end_experience=" + end_experience + ", season_experience=" + season_experience + ", depense_experience=" + depense_experience + ", note_experience=" + note_experience + ", text=" + text + ", image=" + image + ", video=" + video + '}';
    }
  
  
}
