package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController    //@controller接收前台发送来请求，对后端数据库做相应操作；@Responsebody将内容作为http正文内容返回
public class Controller {
    @RequestMapping(value="/hello", method = RequestMethod.GET)     //springboot需要一个路由url，告诉他是怎么访问到这个方法的
    public String hello(){
        return "Hello SpringBoot！";
    }
}
