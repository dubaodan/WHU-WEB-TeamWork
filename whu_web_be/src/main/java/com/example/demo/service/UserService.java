package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

@CacheConfig(cacheNames = "users")
public interface UserService {
    /**
     *
     * @param id
     * @return
     */
    @Cacheable
    User getUserById(Integer id);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Cacheable
    User login(String username,String password);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Transactional
    Integer register(String username,String password);
}
