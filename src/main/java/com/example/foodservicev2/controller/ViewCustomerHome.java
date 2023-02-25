package com.example.foodservicev2.controller;

import com.example.foodservicev2.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("")
public class ViewCustomerHome {

    @Autowired
    private FoodService foodService;
    
    @GetMapping(value="")
    public String home(Model model) {
        model.addAttribute("foods", foodService.findAll());
        return "customer/home";
    }
    
}
