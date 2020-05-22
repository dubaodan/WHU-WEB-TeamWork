package com.example.demo.ServiceImpl;

import com.example.demo.dao.MuscleDao;
import com.example.demo.domain.Muscle;
import com.example.demo.service.MuscleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MuscleServiceImpl implements MuscleService {
    @Resource
    MuscleDao muscleDao;
    /**
     *
     * @param name
     * @return
     */
    @Override
    public Integer getIdByName(String name){
        return muscleDao.getIdByName(name);
    }

    @Override
    public Muscle getMuscleByName(String name){
        return muscleDao.getMuscleByName(name);
    }

    @Override
    public String getNameById(Integer id) {
        return muscleDao.getNameById(id);
    }


}
