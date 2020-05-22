package com.example.demo.ServiceImpl;

import com.example.demo.dao.UserCommentDao;
import com.example.demo.domain.UserComment;
import com.example.demo.service.UserCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserCommentServiceImpl implements UserCommentService {
    @Resource
    UserCommentDao userCommentDao;

    @Override
    public List<UserComment> getCommentByMuscleId(Integer mId){
        return userCommentDao.getCommentByMuscleId(mId);
    }

}
