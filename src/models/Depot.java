/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author user
 */
public class Depot {
    private int id;
    private Date dateDepot;
    private double montant;
    
    //ManyToOne
    private User caissier;
    private Compte compte;

    public Depot() {
    }

    public Depot(int id, Date dateDepot, double montant, User caissier, Compte compte) {
        this.id = id;
        this.dateDepot = dateDepot;
        this.montant = montant;
        this.caissier = caissier;
        this.compte = compte;
    }

    public Depot(Date dateDepot, double montant, User caissier, Compte compte) {
        this.dateDepot = dateDepot;
        this.montant = montant;
        this.caissier = caissier;
        this.compte = compte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public User getCaissier() {
        return caissier;
    }

    public void setCaissier(User caissier) {
        this.caissier = caissier;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    
    
}

