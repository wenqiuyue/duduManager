package com.maven.dudu.entity;

public class Release {
    private Integer releaseid;
    private String rtext;
    private String ruserid;
    private String rtitle;
    private Integer rlikes;
    private Integer commentnum;
    private User user;
    public Integer getReleaseid() {
        return releaseid;
    }

    public void setReleaseid(Integer releaseid) {
        this.releaseid = releaseid;
    }

    public String getRtext() {
        return rtext;
    }

    public void setRtext(String rtext) {
        this.rtext = rtext;
    }

    public String getRuserid() {
        return ruserid;
    }

    public void setRuserid(String ruserid) {
        this.ruserid = ruserid;
    }

    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle;
    }

    public Integer getRlikes() {
        return rlikes;
    }

    public void setRlikes(Integer rlike) {
        this.rlikes = rlike;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
