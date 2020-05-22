package com.example.demo.service;

import com.example.demo.domain.UserComment;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
@CacheConfig(cacheNames = "userComments")
public interface UserCommentService {
    /**
     *
     * @param mId
     * @return
     */

    @Cacheable
    List<UserComment> getCommentByMuscleId(Integer mId);
}
