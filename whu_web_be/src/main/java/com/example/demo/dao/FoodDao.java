package com.example.demo.dao;

import com.example.demo.domain.Food;

import java.util.List;

public interface FoodDao {
    /**
     * 根据类型返回食物
     * @param type
     * @return
     */
    Food getFoodByType(String type);

    /**
     *
     * @return
     */
    List<Food> getFoodList();
}
