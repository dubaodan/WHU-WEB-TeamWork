package com.example.demo.controller;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDetail;
import com.example.demo.service.FoodDetailService;
import com.example.demo.service.FoodService;
import com.example.demo.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Resource
    FoodService foodService;

    @Resource
    FoodDetailService foodDetailService;

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
        else {
            result.setResultCode(200);
            result.setData(foods);
            result.setMessage("查询成功");
        }
        return result;
    }

    @PostMapping("/getFoodDetail")
    @ResponseBody
    public Result getFoodDetail(@RequestParam("type")String type){
        Result<List<FoodDetail>> result=new Result<>();
        List<FoodDetail> foodDetails=foodDetailService.getFoodDetailByType(type);
        if (foodDetails.size()==0){
            result.setResultCode(200);
            result.setData(null);
            result.setMessage("当前种类食物列表为空");
        }
        else {
            result.setResultCode(200);
            result.setData(foodDetails);
            result.setMessage("查询成功");
        }
        return result;
    }
}
