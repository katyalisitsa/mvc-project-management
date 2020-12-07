package com.myApp.controller;

import com.myApp.dto.RoleDTO;
import com.myApp.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleDTO roleDTO;

    @GetMapping("/create")
    public String insertUser(Model model){


        model.addAttribute("user", new UserDTO());
        return "/user/create";
    }
}
