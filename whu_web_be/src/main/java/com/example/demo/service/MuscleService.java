package com.example.demo.service;

import com.example.demo.domain.Muscle;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "muscles")
public interface MuscleService {
    /**
     *
     * @param name
     * @return
     */
    @Cacheable
    public Integer getIdByName(String name);

    /**
     *
     * @param name
     * @return
     */
    @Cacheable
    Muscle getMuscleByName(String name);

    /**
     *
     * @param id
     * @return
     */
    String getNameById(Integer id);
}
