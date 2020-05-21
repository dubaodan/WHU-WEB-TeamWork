package com.example.demo.ServiceImpl;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public User getUserById(Integer id){
        return userDao.getUserById(id);

    }

    @Override
    public User login(String username,String password){
        String md5Password= MD5Util.MD5Encode(password,"UTF-8");
        return userDao.login(username,md5Password);
    }

    @Override
    public Integer register(String username,String password){
        String md5Password= MD5Util.MD5Encode(password,"UTF-8");
        Integer affectedrows = userDao.register(username,md5Password);
        return affectedrows;
    }
}
