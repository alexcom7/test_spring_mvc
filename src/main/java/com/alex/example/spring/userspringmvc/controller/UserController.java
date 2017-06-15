/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.example.spring.userspringmvc.controller;

import com.alex.example.spring.userspringmvc.model.User;
import com.alex.example.spring.userspringmvc.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alexcom
 */
@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
        
    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        System.out.println("GG");
        return userService.getAllUser();
    }
    
    @RequestMapping(value = "/validate", method=RequestMethod.GET)
    public ModelAndView validateUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        System.out.println("GG");
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }
    
    @RequestMapping(value = "/check", method=RequestMethod.POST)
    public @ResponseBody String checkUser(@ModelAttribute("userFromServer") User user){
        
        if("admin".equals(user.getName()) && "admin".equals(user.getPassword())){
            return "valid";
        }
        return "invalid";
    }
}
