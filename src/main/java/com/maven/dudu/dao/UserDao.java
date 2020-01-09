package com.maven.dudu.dao;

import com.maven.dudu.entity.*;

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
    //修改评论数量
    int updateCommentNum(Integer releaseid);
    //修改喜欢数量
    int updateLikeNum(Integer releaseid);
    //关注
    int addFollow(Follow follow);
    //查询是否关注
    int isFollow(Follow follow);
    //我的关注数量
    int getFocueCount(Follow follow);
    //我的粉丝数量
    int getFansCount(Follow follow);
    //我的作品数量
    int getReleaseCount(Release release);
    //我的关注
    List<Follow> getFocue(Follow follow);
    //取消关注
    int delFocus(Follow follow);
    //我的粉丝
    List<Follow> getFans(Follow follow);
    //查询我的作品
    List<Release> getMyRelease(String ruid);
    //插入用户的读书记录
    int addBookRecord(Record record);
    //获取用户的读书记录
    Record getBookRecordById(String uid);
    //修改用户读书记录
    int updateBookRecord(Record record);
    //加入书架
    int addBookShelves(BookShelves bookShelves);
    //查看书籍是否在书架里
    int isBookShelves(BookShelves bookShelves);
    //查看用户书架的数量
    int getBookShelvesCount(BookShelves bookShelves);
    // 查询用户书架
    List<BookShelves> getBookShelvesById(String uid);
    // 删除评论
    int delComment(int comId);
    //更改评论数量
    int reduceCommentNum(int releaseid);
    //删除发布的内容
    int delRelease(int releaseid);
    //删除所有被删除的发布的所有评论
    int delCommentByRId(int releaseid);
    //删除书籍
    int delBookShelves(BookShelves bookShelves);
}
