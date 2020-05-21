package com.example.demo.ServiceImpl;

import com.example.demo.dao.IllnessDao;
import com.example.demo.domain.Illness;
import com.example.demo.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.websocket.OnClose;
import java.util.List;

@Service
public class IllnessServiceImpl implements IllnessService {
    @Resource
    IllnessDao illnessDao;

    @Override
    public List<Illness> getIllList(){
      return illnessDao.getIllList();
    };

    @Override
    public  List<Illness> getIllnessDetailByName(String name){
        return illnessDao.getIllnessDetailByName(name);
    }

}
