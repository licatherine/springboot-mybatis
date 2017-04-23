package com.rebecca.controller;

import com.rebecca.bean.Demo;
import com.rebecca.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: catherine
 * Date: 2017/4/17
 * Time: 11:04
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/show")  //3
    public String show(){
        return demoService.show();
    }

    @RequestMapping(value = "/hello")  //3
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView("index");//模板文件的名称，不需要指定后缀
        mv.addObject("key","hello freemaker");
        return mv;
    }

    @RequestMapping(value = "/modelView")  //3
    public ModelAndView valueFree(String name){
        List<Demo> listDemo = demoService.likeName(name);
        ModelAndView mv=new ModelAndView("modelView");//模板文件的名称，不需要指定后缀
        mv.addObject("listDemo",listDemo);
        return mv;
    }

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        return demoService.likeName(name);
    }


}
