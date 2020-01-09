package com.maven.dudu.controller;

import com.maven.dudu.entity.Comment;
import com.maven.dudu.entity.Follow;
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

//    @RequestMapping(value = "/test",method = RequestMethod.GET)
//    public String addRelease(){
//        return "index";
//    }

    //获取发布
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

    //修改评论数量
    @RequestMapping(value = "/updateCommentNum",method = RequestMethod.GET)
    public boolean updateCommentNum(Integer releaseid){
        System.out.print(releaseid);
        return userService.updateCommentNum(releaseid);
    }

    //修改喜欢数量
    @RequestMapping(value = "/updateLikeNum",method = RequestMethod.GET)
    public boolean updateLikeNum(Integer releaseid){
        System.out.print(releaseid);
        return userService.updateLikeNum(releaseid);
    }

    //关注
    @RequestMapping(value = "/addFollow",method = RequestMethod.POST)
    public boolean addFollow(@RequestBody Follow follow){
        return userService.addFollow(follow);
    }

    //查询是否关注
    @RequestMapping(value = "/isFollow",method = RequestMethod.POST)
    public boolean isFollow(@RequestBody Follow follow){
        return userService.isFollow(follow);
    }

    //我的关注数量
    @RequestMapping(value = "/getFocueCount",method = RequestMethod.POST)
    public int getFocueCount(@RequestBody Follow follow){
        return userService.getFocueCount(follow);
    }
    //我的粉丝数量
    @RequestMapping(value = "/getFansCount",method = RequestMethod.POST)
    public int getFansCount(@RequestBody Follow follow){
        return userService.getFansCount(follow);
    }

    //我的作品数量
    @RequestMapping(value = "/getReleaseCount",method = RequestMethod.POST)
    public int getReleaseCount(@RequestBody Release release){
        return userService.getReleaseCount(release);
    }

    //我的关注
    @RequestMapping(value = "/getFocue",method = RequestMethod.POST)
    public Map<String,Object> getFocue(@RequestBody Follow follow){
        List<Follow> follows= userService.getFocue(follow);
        Map<String,Object> modelMap = new HashMap<>();
        if(follows!=null){
            modelMap.put("follows",follows);
        }else {
            modelMap.put("follows","");
        }
        return modelMap;
    }

    //取消关注
    @RequestMapping(value = "/delFocus",method = RequestMethod.POST)
    public boolean delFocus(@RequestBody Follow follow){
        return userService.delFocus(follow);
    }

    //我的粉丝
    @RequestMapping(value = "/getFans",method = RequestMethod.POST)
    public Map<String,Object> getFans(@RequestBody Follow follow){
        List<Follow> fans= userService.getFans(follow);
        Map<String,Object> modelMap = new HashMap<>();
        if(fans!=null){
            modelMap.put("fans",fans);
        }else {
            modelMap.put("fans","");
        }
        return modelMap;
    }

    //查询我的作品
    @RequestMapping(value = "/getMyRelease",method = RequestMethod.GET)
    public Map<String,Object> getMyRelease(String ruserid){
        List<Release> rel= userService.getMyRelease(ruserid);
        Map<String,Object> modelMap = new HashMap<>();
        if(rel!=null){
            modelMap.put("rel",rel);
        }else {
            modelMap.put("rel","");
        }
        return modelMap;
    }

    //删除评论
    @RequestMapping(value = "/delComment",method = RequestMethod.GET)
    public boolean delComment(Integer commentid){
        return userService.delComment(commentid);
    }

    //减少评论数量
    @RequestMapping(value = "/reduceCommentNum",method = RequestMethod.GET)
    public boolean reduceCommentNum(Integer releaseid){
        return userService.reduceCommentNum(releaseid);
    }

    //删除发布的文章
    @RequestMapping(value = "/delRelease",method = RequestMethod.GET)
    public boolean delRelease(Integer releaseid){
        return userService.delRelease(releaseid);
    }

    //删除所有被删除的发布的所有评论
    @RequestMapping(value = "/delCommentByRId",method = RequestMethod.GET)
    public boolean delCommentByRId(Integer releaseid){
        return userService.delCommentByRId(releaseid);
    }

}
