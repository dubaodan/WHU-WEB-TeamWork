package com.example.demo.dao;

import com.example.demo.domain.Illness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IllnessDao {
    /**
     * 获取疾病列表
     * @return
     */
    List<Illness> getIllList();
    /**
     * 获取疾病信息
     * @return
     */
    List<Illness> getIllnessDetailByName(String name);
}
