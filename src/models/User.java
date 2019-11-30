/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String pasword;
    private String telephone; 
    private String etat; 
     
    //Propriete de navigation
    private Profil profil;
     

    public User() {
    }

    public User(int id, String nom, String prenom, String email, String login, String pasword, String telephone, String etat, Profil profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.pasword = pasword;
        this.telephone = telephone;
        this.etat = etat;
        this.profil = profil;
    }

    public User(String nom, String prenom, String email, String login, String pasword, String telephone, String etat, Profil profil) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.pasword = pasword;
        this.telephone = telephone;
        this.etat = etat;
        this.profil = profil;
    }

   

    public User(String login, String pasword) {
        this.login = login;
        this.pasword = pasword;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
     
    
    
    @Override
    public String toString() {
        return  nom + " " + prenom  ;
    }
     
     
}
