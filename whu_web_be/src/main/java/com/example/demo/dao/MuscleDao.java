package com.example.demo.dao;

import com.example.demo.domain.Muscle;

public interface MuscleDao {
    /**
     *
     * @param name
     * @return
     */
    Integer getIdByName(String name);
    /**
     *
     * @param name
     * @return
     */
    Muscle getMuscleByName(String name);

    /**
     *
     * @param id
     * @return
     */
    String getNameById(Integer id);

//    /**
//     *
//     * @param id
//     * @return
//     */
//    Muscle getMuscleById(Integer id);

}
