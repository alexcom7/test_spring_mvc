/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.example.spring.userspringmvc.model;

import java.io.Serializable;

/**
 *
 * @author Alexcom
 */
public class User implements Serializable{
    
    private String name;
    private String password;

    public User() {
    }

    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User: "+name+
                " passw"+password; //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
