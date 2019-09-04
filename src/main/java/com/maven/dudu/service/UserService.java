package com.maven.dudu.service;

import com.maven.dudu.entity.Comment;
import com.maven.dudu.entity.Release;
import com.maven.dudu.entity.User;

import java.util.List;

public interface UserService {
    //用户是否添加成功
    boolean addUser(User user);
    //根据用户id查询用户
    User getUserById(String uid);
    //用户是否发布成功
    boolean addRelease(Release R);
    //查询所有发布
    List<Release> getAllRelease();
    //添加评论是否成功
    boolean addComment(Comment comment);
    //查询所有评论
    List<Comment> getAllComment();
}
