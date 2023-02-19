package com.example.foodservicev2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("")
public class ViewCustomerHome {
    
    @GetMapping(value="")
    public String home(Model model) {
        return "customer/home";
    }
    
}
