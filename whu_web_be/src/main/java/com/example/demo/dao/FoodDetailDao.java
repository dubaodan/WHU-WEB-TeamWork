package com.example.demo.dao;

import com.example.demo.domain.FoodDetail;

import java.util.List;


public interface FoodDetailDao {
    /**
     *
     * @param type
     * @return
     */
    List<FoodDetail> getFoodDetailByType(String type);
}
