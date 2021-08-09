package com.example.demo.mapper.mysql;

import com.example.demo.model.SysConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface SysConfigMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Integer configId);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}