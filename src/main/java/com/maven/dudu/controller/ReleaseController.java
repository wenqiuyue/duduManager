package com.maven.dudu.controller;

import com.maven.dudu.entity.Comment;
import com.maven.dudu.entity.Release;
import com.maven.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReleaseController {
    @Autowired
    private UserService userService;

    //添加发布
    @RequestMapping(value = "/addRelease",method = RequestMethod.POST)
    public boolean addRelease(@RequestBody Release rel){
        boolean flag=userService.addRelease(rel);
        return flag;
    }

    //查询所有发布
    @RequestMapping(value = "/getRelease",method = RequestMethod.POST)
    public Map<String,Object> getRelease(){
        List<Release> rel=userService.getAllRelease();
        Map<String,Object> modelMap = new HashMap<>();
        if (rel!=null){
            modelMap.put("rel",rel);
        }else {
            modelMap.put("rel","");
        }
        return modelMap;
    }

    //添加评论
    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    public boolean addComment(@RequestBody Comment comment){
        return userService.addComment(comment);
    }

    //查询所有评论
    @RequestMapping(value = "/getAllComment",method = RequestMethod.POST)
    public Map<String,Object> getAllComment(){
       List<Comment> cli=userService.getAllComment();
        Map<String,Object> modelMap = new HashMap<>();
        if(cli!=null){
            modelMap.put("comment",cli);
        }else {
            modelMap.put("comment","");
        }
        return modelMap;
    }
}
