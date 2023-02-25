package com.example.foodservicev2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    private String id;
    private String restaurantUsername;
	private String name;
	private double price;
	private String imageLink;
}
