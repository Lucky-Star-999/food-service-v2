package com.example.foodservicev2.mapper;

import com.example.foodservicev2.dto.FoodDto;
import com.example.foodservicev2.entity.Food;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FoodMapper {
    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);

    // Convert entity to dto
    FoodDto entityToDto(Food food);

    // Convert dto to entity
    Food dtoToEntity(FoodDto foodDto);

    // Convert list of entity into list of dto
    List<FoodDto> entityListtoDtoList(List<Food> foodList);
}
