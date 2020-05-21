package com.example.demo.ServiceImpl;

import com.example.demo.dao.FoodDao;
import com.example.demo.domain.Food;
import com.example.demo.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Resource
    FoodDao foodDao;

    @Override
    public Food getFoodByType(String type){
        return foodDao.getFoodByType(type);
    }

    @Override
    public List<Food> getFoodList(){
        return foodDao.getFoodList();
    }
}
