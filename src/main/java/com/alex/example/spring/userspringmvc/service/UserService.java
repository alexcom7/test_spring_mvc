/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.example.spring.userspringmvc.service;

import com.alex.example.spring.userspringmvc.dao.UserDao;
import com.alex.example.spring.userspringmvc.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexcom
 */
@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    
    public List<User> getAllUser(){
        
        return userDao.getAllUsers();
    }
}
