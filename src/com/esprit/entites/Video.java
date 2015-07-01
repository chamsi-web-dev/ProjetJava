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
public class Video {
  private int id_video;
  private String title_video;
  private String path_video;

    public Video() {
    }

    public Video(int id_video, String title_video, String path_video) {
        this.id_video = id_video;
        this.title_video = title_video;
        this.path_video = path_video;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public String getTitle_video() {
        return title_video;
    }

    public void setTitle_video(String title_video) {
        this.title_video = title_video;
    }

    public String getPath_video() {
        return path_video;
    }

    public void setPath_video(String path_video) {
        this.path_video = path_video;
    }

    @Override
    public String toString() {
        return "Video{" + "id_video=" + id_video + ", title_video=" + title_video + ", path_video=" + path_video + '}';
    }
  
}
