package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class DemoController {
    @RequestMapping("/index")
    public String index(HttpSession session, HttpServletResponse response){
        String id=session.getId();
        System.out.println("8080:"+id);
        Cookie cookie = new Cookie("JSESSIONID",id);
        cookie.setDomain("localhost");
        response.addCookie(cookie);
        session.setAttribute("entiy","丁言奎");
        System.out.println(session.getAttribute("entiy"));
        return "Hello World!";
    }
}
