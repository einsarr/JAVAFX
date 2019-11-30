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
public class Compte {
    private int id;
    private String numero;
    private double solde;
    private Date dateCtreation;
    
    //ManyToOne
    private Partenaire partenaire;

    public Compte() {
    }

    public Compte(int id, String numero, double solde, Date dateCtreation, Partenaire partenaire) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.dateCtreation = dateCtreation;
        this.partenaire = partenaire;
    }

    public Compte(String numero, double solde, Date dateCtreation, Partenaire partenaire) {
        this.numero = numero;
        this.solde = solde;
        this.dateCtreation = dateCtreation;
        this.partenaire = partenaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCtreation() {
        return dateCtreation;
    }

    public void setDateCtreation(Date dateCtreation) {
        this.dateCtreation = dateCtreation;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }
    
    
    
    
}
