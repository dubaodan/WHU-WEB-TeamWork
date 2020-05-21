package com.example.demo.service;

import com.example.demo.domain.Illness;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "illnesses")
public interface IllnessService {
    /**
     * 获取疾病列表
     * @return
     */
    @Cacheable
    List<Illness> getIllList();
    /**
     * 获取疾病详细信息
     * @return
     */
    @Cacheable
    List<Illness> getIllnessDetailByName(String name);
}
