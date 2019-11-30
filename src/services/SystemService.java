/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.Compte;
import models.Depot;
import models.Partenaire;
import models.User;

/**
 *
 * @author user
 */
public class SystemService {
    
    public boolean faireDepot(Depot depot){
        return true;
    }
    public boolean  creerCompte(Compte compte){
        return true;
    }
    
    public boolean  bloquerPartenaire(Partenaire partenaire){
        return true;
    }
     public List<Partenaire> showPartenaire(){
         return null;
     }
     
     public boolean  bloquerUser(User user){
        return true;
    }
     
     public List<User> showCaissier(){
         return null;
     }
     public boolean creerUser(User user){
         return true ;
     }
     
    
}
