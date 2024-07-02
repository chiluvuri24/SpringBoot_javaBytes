package com.EazyBytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"","/","/home"})
    public String displayHome(Model model){
        model.addAttribute("username","Jhon Doe");
        System.out.println(" executedddd *******************************");
        return "home.html";
    }

}
