import SqlTools.SqlHelper;
import com.alibaba.fastjson.JSON;

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

@WebServlet(name = "GetIllnessDetail")
public class GetIllnessDetail extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=String.valueOf(request.getParameter("name"));
        try {
            List<Map<String,Object>>list =getResult(name);
            String jsonString= JSON.toJSONString(list);
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

    protected List<Map<String,Object>> getResult(String name) throws SQLException {
        List<Map<String,Object>> list=new ArrayList<>();
        SqlHelper sqlHelper=new SqlHelper();
        try {
            sqlHelper.ConnectData();
            //todo
            String sqlCommand="select * from illness where name = '"+name+"'";
            ResultSet resultSet=sqlHelper.GetResultSet(sqlCommand);
            //user doesnt exist
            if (resultSet.next()){
                do {
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("reason",""+resultSet.getString("reason"));
                    map.put("behave",""+resultSet.getString("behave"));
                    map.put("cure",resultSet.getString("cure"));
                    map.put("prevend",resultSet.getString("prevend"));
                    list.add(map);
                }while (resultSet.next());
                resultSet.close();
                sqlHelper.CloseConnect();
            } else{

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        try {
            List<Map<String,Object>>list=new GetIllnessDetail().getResult("肌肉拉伤");
            String jsonString= JSON.toJSONString(list);
            System.out.println(jsonString);
        }catch (Exception e){}
    }
}
