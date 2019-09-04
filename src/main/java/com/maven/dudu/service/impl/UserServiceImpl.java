package com.maven.dudu.service.impl;

import com.maven.dudu.dao.UserDao;
import com.maven.dudu.entity.Comment;
import com.maven.dudu.entity.Release;
import com.maven.dudu.entity.User;
import com.maven.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //添加用户是否成功
    @Override
    public boolean addUser(User user){
        int i=userDao.addUser(user);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
    //根据id查询用户

    public User getUserById(String uid){
        System.out.print(uid);
        return userDao.getUserById(uid);
    }

    //用户是否发布成功
    @Override
    public boolean addRelease(Release R){
        int i=userDao.addRelease(R);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //查询所有发布
    @Override
    public List<Release> getAllRelease(){
        return userDao.getAllRelease();
    }

    //添加评论是否成功
    @Override
    public boolean addComment(Comment comment){
        int i=userDao.addComment(comment);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //查询所有评论
    @Override
    public List<Comment> getAllComment(){
        return userDao.getAllComment();
    }

}
