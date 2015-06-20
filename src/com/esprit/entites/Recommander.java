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
public class Recommander {
   private int    id_recommander;
   private String  type_recommander;

    public Recommander(int id_recommander, String type_recommander) {
        this.id_recommander = id_recommander;
        this.type_recommander = type_recommander;
    }

    public int getId_recommander() {
        return id_recommander;
    }

    public void setId_recommander(int id_recommander) {
        this.id_recommander = id_recommander;
    }

    public String getType_recommander() {
        return type_recommander;
    }

    public void setType_recommander(String type_recommander) {
        this.type_recommander = type_recommander;
    }

    @Override
    public String toString() {
        return "Recommander{" + "id_recommander=" + id_recommander + ", type_recommander=" + type_recommander + '}';
    }
   
     
}
