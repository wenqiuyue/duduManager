package com.maven.dudu.dao;

import com.maven.dudu.entity.Comment;
import com.maven.dudu.entity.Release;
import com.maven.dudu.entity.User;

import java.util.List;

public interface UserDao {
    //添加用户
    int addUser(User user);
    //根据用户id查询用户
    User getUserById(String uid);
    //插入发布
    int addRelease(Release R);
    //查询所有发布
    List<Release> getAllRelease();
    //添加评论
    int addComment(Comment comment);
    //查询所有评论
    List<Comment> getAllComment();
}
