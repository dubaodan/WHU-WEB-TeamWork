import SqlTools.SqlHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.xdevapi.JsonString;
import com.sun.security.auth.UnixNumericUserPrincipal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "GetMuscleAndComment")
public class GetMuscleAndComment extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=String.valueOf(request.getParameter("id"));
        try {
            JSONObject jsonObject =getResult(id);
            String jsonString= JSON.toJSONString(jsonObject);
            System.out.println(jsonString);
            response.setContentType("text/html");
            response.setCharacterEncoding("GB18030");// 注意設置為utf-8否則前端接收到的中文為亂碼
            PrintWriter out = response.getWriter();
            out.print(jsonString);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected JSONObject getResult(String name) throws SQLException {
        JSONObject ret=new JSONObject();
        JSONObject muscle=new JSONObject();
        List<Map<String,Object>> listUser=new ArrayList<>();
        SqlHelper sqlHelper=new SqlHelper();
        try {
            sqlHelper.ConnectData();
            //todo nameM=>idM
            String idM=null;
            String sqlCommandOuter="select * from mucle where name = '"+name+"'";
            ResultSet resultSetOuter=sqlHelper.GetResultSet(sqlCommandOuter);
            if (resultSetOuter.next()){
                idM=resultSetOuter.getString("mucle_id");
            }else {

            }
            String sqlCommand="select * from usercomment where mucle_id = '"+idM+"'";
            ResultSet resultSet=sqlHelper.GetResultSet(sqlCommand);
            if (resultSet.next()){
                do {
                    Map<String,Object> map = new HashMap<String,Object>();
                    String idU=resultSet.getString("user_ID");
                    String nameU="null";
                    //todo idU=>nameU
                    String sqlCommandInner="select * from user where user_Id = '"+idU+"'";
                    ResultSet resultSetInner=sqlHelper.GetResultSet(sqlCommandInner);
                    if (resultSetInner.next()){
                        nameU=resultSetInner.getString("username");
                    }else {

                    }
                    map.put("name",nameU);
                    map.put("comment",""+resultSet.getString("comment"));
                    listUser.add(map);
                }while (resultSet.next());
                resultSet.close();
                sqlHelper.CloseConnect();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            sqlHelper.ConnectData();
            //todo
            String sqlCommand="select * from mucle where name = '"+name+"'";
            ResultSet resultSet=sqlHelper.GetResultSet(sqlCommand);
            if (resultSet.next()){
                do {
                    muscle.put("video",resultSet.getString("video"));
                    muscle.put("name",resultSet.getString("name"));
                    muscle.put("description",resultSet.getString("description"));
                    muscle.put("method",resultSet.getString("method"));
                }while (resultSet.next());
                resultSet.close();
                sqlHelper.CloseConnect();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        ret.put("muscle",muscle);
        ret.put("user",listUser);
        return ret;
    }

    public static void main(String[] args) {
        try {
            JSONObject jsonObject=new GetMuscleAndComment().getResult("胸大肌");
            String jsonString= JSON.toJSONString(jsonObject);
            System.out.println(jsonString);
        }catch (Exception e){}
    }


}
