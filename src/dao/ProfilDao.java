/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Profil;

/**
 *
 * @author user
 */
public class ProfilDao implements IDao<Profil> {
     
    private final String SQL_SELECT_ALL="select * from profil";
    private final String SQL_SELECT_ONE="select * from profil where id=?";
    private final String SQL_INSERT="INSERT INTO profil (libelle ) VALUES (?)";
    private final String SQL_UPDATE="UPDATE `profil` SET `libelle` = ? WHERE `profil`.`id` = ?";
    @Override
    public int create(Profil objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Profil objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profil> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profil findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
