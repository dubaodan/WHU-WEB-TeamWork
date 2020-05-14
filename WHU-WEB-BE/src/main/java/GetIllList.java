import SqlTools.SqlHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import sun.util.resources.cldr.rw.CurrencyNames_rw;

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

@WebServlet(name = "GetIllList")
public class GetIllList extends HttpServlet {
    private final int itemsEachPage=8;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //todo
            //int pageNum=Integer.parseInt(request.getParameter("pageNum"));
            int pageNum=1;      //页码数，默认为1
            List<Map<String,Object>>list =getResult(pageNum);
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

    protected List<Map<String,Object>> getResult(int pageNum) throws SQLException {
        int startrow=(pageNum-1)*itemsEachPage;
        List<Map<String,Object>> listTotal= new ArrayList<>();
        List<Map<String,Object>> list=new ArrayList<>();
        SqlHelper sqlHelper=new SqlHelper();
        try {
            sqlHelper.ConnectData();
            //todo
            String sqlCommand="select * from illness limit "+startrow+" , "+itemsEachPage;
            ResultSet resultSet=sqlHelper.GetResultSet(sqlCommand);
            //user doesnt exist
            if (resultSet.next()){
                do {
                    //todo
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("name",""+resultSet.getString("name"));
                    map.put("brief",resultSet.getString("brief"));
                    list.add(map);
                }while (resultSet.next());
                resultSet.close();
                sqlHelper.CloseConnect();
            } else{

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Map<String,Object> outerMap=new HashMap<>();
        //todo
        outerMap.put("illness",list);
        listTotal.add(outerMap);
        return listTotal;
    }

    public static void main(String[] args) {
        try {
            List<Map<String,Object>>list=new GetIllList().getResult(1);
            String jsonString= JSON.toJSONString(list);
            System.out.println(jsonString);
        }catch (Exception e){}
    }
}
