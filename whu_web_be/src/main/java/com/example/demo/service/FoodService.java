package com.example.demo.service;

import com.example.demo.domain.Food;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "foods")
public interface FoodService {
    /**
     * 根据类型返回食物
     * @param type
     * @return
     */
    @Cacheable
    Food getFoodByType(String type);

    /**
     *
     * @return
     */
    @Cacheable
    List<Food> getFoodList();

}
