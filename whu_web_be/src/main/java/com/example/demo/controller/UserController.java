package com.example.demo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.Result;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@CrossOrigin(allowCredentials="true")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/login")
    @ResponseBody

    public Result login(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        HttpSession session=request.getSession();
        System.out.println(session.getId());
        System.out.println(session.getAttribute("loginUser"));
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
    public Result register(@RequestParam("username")String username, @RequestParam("password") String password, @NonNull HttpSession session){

        Result<String> userResult=new Result<>();
        Integer affectedRows=0;
        try {
            affectedRows=userService.register(username,password);
        }catch (Exception e){
            userResult.setMessage("注册失败");
            userResult.setResultCode(500);
        }
        if (affectedRows!=0){
            System.out.println(session.getId());
            userResult.setMessage("注册成功" );
            userResult.setResultCode(200);
        }else {
            userResult.setMessage("注册失败");
            userResult.setResultCode(500);
        }
            return userResult;
        }
}
