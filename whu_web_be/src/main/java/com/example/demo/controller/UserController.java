package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username")String username, @RequestParam("password") String password, HttpSession session){
        Result<User> userResult=new Result<>();
        User user=userService.login(username,password);
        userResult.setData(user);
        if (user!=null){
            userResult.setMessage("登录成功");
            userResult.setResultCode(200);
            session.setAttribute("loginUser", user.getUserName());
            session.setAttribute("loginUserId", user.getUserId());
        }else {
            userResult.setMessage("登录失败");
            userResult.setResultCode(500);
        }
        return userResult;
    }

    @PostMapping("/register")
    @ResponseBody
    public Result register(@RequestParam("username")String username, @RequestParam("password") String password, HttpSession session){
        Result<String> userResult=new Result<>();
        Integer affectedRows=0;
        try {
            affectedRows=userService.register(username,password);
        }catch (Exception e){
            userResult.setMessage("注册失败");
            userResult.setResultCode(500);
        }
        if (affectedRows!=0){
            userResult.setMessage("注册成功" );
            userResult.setResultCode(200);
        }else {
            userResult.setMessage("注册失败");
            userResult.setResultCode(500);
        }
            return userResult;
        }
}
