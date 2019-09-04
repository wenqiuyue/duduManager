package com.maven.dudu.controller;

import com.maven.dudu.entity.User;
import com.maven.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //注册
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Map<String,Object> addUser(@RequestBody User user) {
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.addUser(user));
        return modelMap;
    }

    //根据id查询用户
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public Map<String,Object> getUserById(String userid){
        Map<String,Object> modelMap = new HashMap<>();
        User u=userService.getUserById(userid);
        System.out.print(userid);
        if (u!=null){
            modelMap.put("user",u);
        }else{
            modelMap.put("user","");
        }
        return modelMap;
    }

}
