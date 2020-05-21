package com.example.demo.controller;

import com.example.demo.domain.Food;
import com.example.demo.service.FoodService;
import com.example.demo.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Resource
    FoodService foodService;

    @GetMapping("/getFoodList")
    @ResponseBody
    public Result getFoodList(){
        Result<List<Food>> result=new Result<>();
        List<Food> foods=foodService.getFoodList();
        if (foods.size()==0){
            result.setResultCode(200);
            result.setData(foods);
            result.setMessage("食物列表为空！");
        }
        result.setResultCode(200);
        result.setData(foods);
        result.setMessage("查询成功");
        return result;
    }
}
