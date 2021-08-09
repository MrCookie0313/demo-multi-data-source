package com.example.demo.controller;

import com.example.demo.mapper.mysql.SysConfigMapper;
import com.example.demo.mapper.postgresql.EvaluationConfigMapper;
import com.example.demo.model.EvaluationConfig;
import com.example.demo.model.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：sunBing
 * @date ：2021/6/15 14:07
 * @description：测试
 * @modified By：
 * @version: 1.0
 */
@RestController
public class TestController {
    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Autowired
    private EvaluationConfigMapper evaluationConfigMapper;

    @GetMapping("/test/mysql")
    public String test1(){

        SysConfig sysConfig = sysConfigMapper.selectByPrimaryKey(1);
        String s = sysConfig.toString();
        return s;

    }

    @GetMapping("/test/postgresql")
    public String test2(){
        EvaluationConfig evaluationConfig = evaluationConfigMapper.selectByPrimaryKey(1);
        String s = evaluationConfig.toString();
        return s;
    }
}
