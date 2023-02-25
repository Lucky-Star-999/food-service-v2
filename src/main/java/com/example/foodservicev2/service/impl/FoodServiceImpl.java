package com.example.foodservicev2.service.impl;

import com.example.foodservicev2.entity.Food;
import com.example.foodservicev2.repository.FoodRepository;
import com.example.foodservicev2.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }
}
