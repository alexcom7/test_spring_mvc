/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.example.spring.userspringmvc.dao;

import com.alex.example.spring.userspringmvc.model.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alexcom
 */
@Repository
public class UserDao {
    
    private List<User> users = Arrays.asList(new User("name1", "password1"), new User("name2", "password2"));

    public  List<User> getAllUsers()   {
        
        return users;
    }
}
