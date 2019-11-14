package com.aaa.model;

public class ResultData {


    private String code;
    private String msg;
    private Object user;

    public ResultData() {
    }

    public ResultData(String code, String msg, Object user) {
        this.code = code;
        this.msg = msg;
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}
