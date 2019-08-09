package com.zlx.boot3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TesJdbctTem {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping(value = "jdbc")
    public Map<String,Object> testJdbc(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        return maps.get(0);
    }
}
