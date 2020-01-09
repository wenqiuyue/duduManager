package com.maven.dudu.controller;

import com.maven.dudu.entity.BookShelves;
import com.maven.dudu.entity.Record;
import com.maven.dudu.entity.User;
import com.maven.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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

    //插入用户读书记录
    @RequestMapping(value = "/addUserRecord",method = RequestMethod.POST)
    public boolean addUserRecord(@RequestBody Record record){
        return userService.addBookRecord(record);
    }

    //获取用户读书记录
    @RequestMapping(value = "/getBookRecord",method = RequestMethod.GET)
    public Map<String,Object> getBookRecord(String userid){
        Map<String,Object> modelMap = new HashMap<>();
        Record rec=userService.getBookRecordById(userid);
        if (rec!=null){
            modelMap.put("record",rec);
        }else {
            modelMap.put("record","");
        }
        return modelMap;
    }

    //修改用户读书记录
    @RequestMapping(value = "/updateRecord",method = RequestMethod.POST)
    public boolean updateRecord(@RequestBody Record record){
        return userService.updateBookRecord(record);
    }

    //添加书架
    @RequestMapping(value = "/addBookShelves",method = RequestMethod.POST)
    public boolean addBookShelves(@RequestBody BookShelves bookShelves){
        return userService.addBookShelves(bookShelves);
    }

    //查看书籍是否在书架中
    @RequestMapping(value = "/isBookShelves",method = RequestMethod.POST)
    public boolean isBookShelves(@RequestBody BookShelves bookShelves){
        return userService.isBookShelves(bookShelves);
    }

    //查看用户书架的数量
    @RequestMapping(value = "/getBookShelvesCount",method = RequestMethod.POST)
    public int getBookShelvesCount(@RequestBody BookShelves bookShelves){
        return userService.getBookShelvesCount(bookShelves);
    }

    //查询用户书架
    @RequestMapping(value = "/getBookShelvesById",method = RequestMethod.GET)
    public Map<String,Object> getBookShelvesById(String userid){
        Map<String,Object> map=new HashMap<>();
        List<BookShelves> bookShelves=userService.getBookShelvesById(userid);
        if(bookShelves!=null){
            map.put("bookShelves",bookShelves);
        }else{
            map.put("bookShelves","");
        }
        return map;
    }

    //删除书架书籍
    @RequestMapping(value = "/delBookShelves",method = RequestMethod.POST)
    public boolean delBookShelves(@RequestBody BookShelves bookShelves){
        return userService.delBookShelves(bookShelves);
    }



}
