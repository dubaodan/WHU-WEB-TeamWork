package com.example.demo.ServiceImpl;

import com.example.demo.dao.FoodDetailDao;
import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDetail;
import com.example.demo.service.FoodDetailService;
import com.example.demo.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodDetailServiceImpl implements FoodDetailService {

    @Resource
    FoodDetailDao foodDetailDao;

    @Override
    public List<FoodDetail> getFoodDetailByType(String type) {
        return foodDetailDao.getFoodDetailByType(type);
    }
}
