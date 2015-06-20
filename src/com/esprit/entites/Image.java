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
public class Image {
 private int   id_image;
  private String path_url_image;

    public Image(int id_image, String path_url_image) {
        this.id_image = id_image;
        this.path_url_image = path_url_image;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getPath_url_image() {
        return path_url_image;
    }

    public void setPath_url_image(String path_url_image) {
        this.path_url_image = path_url_image;
    }

    @Override
    public String toString() {
        return "Image{" + "id_image=" + id_image + ", path_url_image=" + path_url_image + '}';
    }
  
          
}
