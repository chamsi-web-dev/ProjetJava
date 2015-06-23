/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.entites;

/**
 *
 * @author mcb
 */
public class Flux {
    private int     idFlux;
    private String  lienFlux;
    private int     statusFlux;

    public Flux(int idFlux, String lienFlux, int statusFlux) {
        this.idFlux = idFlux;
        this.lienFlux = lienFlux;
        this.statusFlux = statusFlux;
    }

    public Flux() {
    }

    public int getIdFlux() {
        return idFlux;
    }

    public void setIdFlux(int idFlux) {
        this.idFlux = idFlux;
    }

    public String getLienFlux() {
        return lienFlux;
    }

    public void setLienFlux(String lienFlux) {
        this.lienFlux = lienFlux;
    }

    public int getStatusFlux() {
        return statusFlux;
    }

    public void setStatusFlux(int statusFlux) {
        this.statusFlux = statusFlux;
    }

    @Override
    public String toString() {
        return "Flux{" + "idFlux=" + idFlux + ", lienFlux=" + lienFlux + ", statusFlux=" + statusFlux + '}';
    }

}
