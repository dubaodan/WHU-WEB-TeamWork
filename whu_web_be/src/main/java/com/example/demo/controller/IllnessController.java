package com.example.demo.controller;

import com.example.demo.ServiceImpl.IllnessServiceImpl;
import com.example.demo.domain.Illness;
import com.example.demo.service.IllnessService;
import com.example.demo.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/illness")
public class IllnessController {
    @Resource
    IllnessService illnessService;

    @GetMapping ("/getIllList")
    @ResponseBody
    public Result getIllList(){
        Result<List<Illness>> result=new Result<>();
        List<Illness> illnesses=illnessService.getIllList();
        if (illnesses.size()==0){
            result.setResultCode(200);
            result.setData(illnesses);
            result.setMessage("疾病列表为空！");
        }
        result.setResultCode(200);
        result.setData(illnesses);
        result.setMessage("查询成功");
        return result;
    }

    @PostMapping ("/getIllnessDetail")
    @ResponseBody
    public Result getIllnessDetailByName(@RequestParam ("name") String name ){
        Result<List<Illness>> illnessResult=new Result<>();
        List<Illness> illnesses=illnessService.getIllnessDetailByName(name);
        illnessResult.setData(illnesses);
        if (illnesses.size()!=0){
            illnessResult.setResultCode(200);
            illnessResult.setMessage("查询成功");
        }
        else {
            illnessResult.setResultCode(500);
            illnessResult.setMessage("您查询的名称不存在");
        }
        return illnessResult;
    }


}
