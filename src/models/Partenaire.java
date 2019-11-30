/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author user
 */
public class Partenaire extends User {
    private String nci;
    //OneToMany
    private List<Compte>comptes;

    public Partenaire() {
    }

    public Partenaire(String nci, int id, String nom, String prenom, String email, String login, String pasword, String telephone, String etat, Profil profil) {
        super(id, nom, prenom, email, login, pasword, telephone, etat, profil);
        this.nci = nci;
    }

    public Partenaire(String nci, String nom, String prenom, String email, String login, String pasword, String telephone, String etat, Profil profil) {
        super(nom, prenom, email, login, pasword, telephone, etat, profil);
        this.nci = nci;
    }

    public Partenaire(String nci, List<Compte> comptes, int id, String nom, String prenom, String email, String login, String pasword, String telephone, String etat, Profil profil) {
        super(id, nom, prenom, email, login, pasword, telephone, etat, profil);
        this.nci = nci;
        this.comptes = comptes;
    }

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

  
    
    
}
