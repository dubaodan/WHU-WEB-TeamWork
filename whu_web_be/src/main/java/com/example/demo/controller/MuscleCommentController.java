package com.example.demo.controller;

import com.example.demo.domain.Muscle;
import com.example.demo.domain.User;
import com.example.demo.domain.UserComment;
import com.example.demo.service.MuscleService;
import com.example.demo.service.UserCommentService;
import com.example.demo.service.UserService;
import com.example.demo.util.Result;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/muscle")
public class MuscleCommentController {
    @Resource
    MuscleService muscleService;

    @Resource
    UserCommentService userCommentService;

    @Resource
    UserService userService;

    @PostMapping("/getComment")
    @ResponseBody
    public Map<String, Object> getCommentByName(@RequestParam("muscleId") String muscleId){


        //Muscle muscle=muscleService.getMuscleByName(name);
        Integer mid=Integer.parseInt(muscleId);
        String name=muscleService.getNameById(mid);
        List<UserComment> userCommentList=userCommentService.getCommentByMuscleId(mid);
        Map<String,Object> res=new HashMap<>();
        List<Map<String,Object>> userCommentlistWithUserName=new ArrayList<>();
        for (UserComment userComment:userCommentList){
            Map<String,Object> uc=new HashMap<>();
            User user=userService.getUserById(userComment.getUserId());
            String username=user.getUserName();
            String comment=userComment.getComment();
            uc.put("username",username);
            uc.put("comment",comment);
            userCommentlistWithUserName.add(uc);
        }
        res.put("muscle",name);
        res.put("user",userCommentlistWithUserName);
        return res;

    }
}
