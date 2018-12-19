package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class DemoController {
    @RequestMapping("/index")
    public String index(HttpSession session){
        String id=session.getId();
        Object str=session.getAttribute("entiy");
        System.out.println(str);
        System.out.println("8081:"+id);

        return "Hello Ding!";
    }
}
