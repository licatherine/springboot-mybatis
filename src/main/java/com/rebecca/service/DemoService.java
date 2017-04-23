package com.rebecca.service;

import com.rebecca.bean.Demo;
import com.rebecca.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rebecca on 2017/4/17 10:58.
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public String show(){
        return "hello world, rebecca!";
    }

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }

}