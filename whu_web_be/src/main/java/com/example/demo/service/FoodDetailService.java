package com.example.demo.service;

import com.example.demo.domain.FoodDetail;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "foodDetails")
public interface FoodDetailService {
    /**
     *
     * @param type
     * @return
     */
    @Cacheable
    List<FoodDetail> getFoodDetailByType(String type);
}
