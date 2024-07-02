package com.EazyBytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String displayHome(){
        System.out.println(" executedddd *******************************");
        return "home.html";
    }



}
