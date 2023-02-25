package com.example.foodservicev2.service;

import com.example.foodservicev2.entity.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {
    List<Food> findAll();
}
