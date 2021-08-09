package com.example.demo.mapper.postgresql;

import com.example.demo.model.EvaluationConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EvaluationConfig record);

    int insertSelective(EvaluationConfig record);

    EvaluationConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EvaluationConfig record);

    int updateByPrimaryKey(EvaluationConfig record);
}