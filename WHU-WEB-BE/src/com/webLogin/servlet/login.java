package com.webLogin.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应内容类型
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //获取ajax传递的参数，和获取表单数据的方式一样
        String id=request.getParameter("username");
        String pwd=request.getParameter("password");

        System.out.println(id+","+pwd);

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");// 注意設置為utf-8否則前端接收到的中文為亂碼
        if(id.equals("hsy") && pwd.equals("123")){
            response.getWriter().print("Success");
        }
        else {
            response.getWriter().print("False");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
