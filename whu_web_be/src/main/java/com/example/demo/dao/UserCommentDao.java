package com.example.demo.dao;

import com.example.demo.domain.UserComment;

import java.util.List;

public interface UserCommentDao {

    /**
     *
     * @param mId
     * @return
     */
    List<UserComment> getCommentByMuscleId(Integer mId);
}
