/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.User;

/**
 *
 * @author user
 */
public class UserDao implements IDao <User> {

    private final String SQL_SELECT_ALL="select * from user";
    private final String SQL_SELECT_ONE="select * from user where id=?";
    private final String SQL_INSERT="INSERT INTO `user` (`nom`, `prenom`, `email`, `telephone`, `login`, `password`, `etat`, `profil_id_profil`) VALUES (?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE="UPDATE `user` SET `nom` = ?, `prenom` = ?, `email` = ?, `telephone` = ?, `password` = ?, `etat` = ?, `profil_id_profil` = ? WHERE `user`.`id` = ?";
   
    @Override
    public int create(User objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(User objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
