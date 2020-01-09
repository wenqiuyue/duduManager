package com.maven.dudu.service.impl;

import com.maven.dudu.dao.UserDao;
import com.maven.dudu.entity.*;
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

    //修改评论数量
    @Override
    public boolean updateCommentNum(Integer releaseid){
        int i=userDao.updateCommentNum(releaseid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //修改喜欢数量
    @Override
    public boolean updateLikeNum(Integer releaseid){
        int i=userDao.updateLikeNum(releaseid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //关注
    @Override
    public boolean addFollow(Follow follow){
        int i=userDao.addFollow(follow);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //查询是否关注
    @Override
    public boolean isFollow(Follow follow){
        int i=userDao.isFollow(follow);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
    //我的关注数量
    @Override
    public int getFocueCount(Follow follow){
        return userDao.getFocueCount(follow);
    }
    //我的粉丝数量
    @Override
    public int getFansCount(Follow follow){
        return userDao.getFansCount(follow);
    }

    //我的作品数量
    @Override
    public int getReleaseCount(Release release){
        return userDao.getReleaseCount(release);
    }

    //我的关注
    @Override
    public List<Follow> getFocue(Follow follow){
        return userDao.getFocue(follow);
    }

    //取消关注
    @Override
    public boolean delFocus(Follow follow){
        int i=userDao.delFocus(follow);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //我的关注
    @Override
    public List<Follow> getFans(Follow follow){
        return userDao.getFans(follow);
    }

    //查询我的作品
    @Override
    public List<Release> getMyRelease(String ruid){
        return userDao.getMyRelease(ruid);
    }

    //插入用户的读书记录
    @Override
    public boolean addBookRecord(Record record){
        int i=userDao.addBookRecord(record);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //获取用户的读书记录
    @Override
    public Record getBookRecordById(String uid){
        return userDao.getBookRecordById(uid);
    }

    //修改用户读书记录
    @Override
    public boolean updateBookRecord(Record record){
        int i=userDao.updateBookRecord(record);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //加入书架
    @Override
    public boolean addBookShelves(BookShelves bookShelves){
        int i=userDao.addBookShelves(bookShelves);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //查看书籍是否在书架里
    @Override
    public boolean isBookShelves(BookShelves bookShelves){
        int i=userDao.isBookShelves(bookShelves);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //查看用户书架的数量
    @Override
    public int getBookShelvesCount(BookShelves bookShelves){
        return userDao.getBookShelvesCount(bookShelves);
    }

    // 查询用户书架
    @Override
    public List<BookShelves> getBookShelvesById(String uid){
        return userDao.getBookShelvesById(uid);
    }

    // 删除评论
    @Override
    public boolean delComment(int comId){
        int i=userDao.delComment(comId);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //更改评论数量
    @Override
    public boolean reduceCommentNum(int releaseid){
        int i=userDao.reduceCommentNum(releaseid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //删除发布的内容
    @Override
    public boolean delRelease(int releaseid){
        int i=userDao.delRelease(releaseid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //删除所有被删除的发布的所有评论
    @Override
    public boolean delCommentByRId(int releaseid){
        int i=userDao.delCommentByRId(releaseid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    //删除书架书籍
    @Override
    public boolean delBookShelves(BookShelves bookShelves){
        int i=userDao.delBookShelves(bookShelves);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

}
