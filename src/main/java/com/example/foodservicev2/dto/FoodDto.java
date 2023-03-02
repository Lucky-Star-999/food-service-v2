package com.example.foodservicev2.dto;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodDto {
    private String restaurantUsername;
    private String name;
    private double price;
    private String imageLink;
}
