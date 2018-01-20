package com.halen.entity;

public class Student {
    private Integer sid;

    private String sname;

    private String sage;

    private String ssex;

    private Integer sagenum;

    private Integer tid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage == null ? null : sage.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public Integer getSagenum() {
        return sagenum;
    }

    public void setSagenum(Integer sagenum) {
        this.sagenum = sagenum;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}