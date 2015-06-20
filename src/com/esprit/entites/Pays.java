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
public class Pays {
   private int id_country;
 private String name_country;

    public Pays(int id_country, String name_country) {
        this.id_country = id_country;
        this.name_country = name_country;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public String getName_country() {
        return name_country;
    }

    public void setName_country(String name_country) {
        this.name_country = name_country;
    }

    @Override
    public String toString() {
        return "Pays{" + "id_country=" + id_country + ", name_country=" + name_country + '}';
    }
 
}
