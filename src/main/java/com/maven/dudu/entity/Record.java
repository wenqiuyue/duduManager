package com.maven.dudu.entity;

public class Record {
    private String userid;
    private String bookid;
    private int bookorder;
    private String bookatocic;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public int getBookorder() {
        return bookorder;
    }

    public void setBookorder(int bookorder) {
        this.bookorder = bookorder;
    }

    public String getBookatocic() {
        return bookatocic;
    }

    public void setBookatocic(String bookatocic) {
        this.bookatocic = bookatocic;
    }
}
