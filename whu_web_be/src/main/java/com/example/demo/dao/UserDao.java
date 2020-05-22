package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao {
    /**
     *
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

    /**
     *
     * @param username
     * @param password
     * @return
     */

    Integer register(String username,String password);

    User getUserByName(String username);
}
