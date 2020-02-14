package com.zb.sp.controller;

import com.zb.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   @RequestMapping("/buy")
    public String hello(){
        System.out.println("Welcome to SpringCould");
        return "购买了一个产品";
    }
    @RequestMapping("/buy2")
    public String hello2(){
        System.out.println("Welcome to SpringCould");
        return "购买了一个产品";
    }
    @RequestMapping("/search")
    public List<Map> search(@RequestParam Map map){


       return userService.search(map);
    }
}
