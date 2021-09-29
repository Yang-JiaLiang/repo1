package com.itheima4;

public class AgeLT0Exception extends Exception {
    public AgeLT0Exception() {
        this("年龄小于0异常");

    }

    public AgeLT0Exception(String message) {
        super(message);
    }

}
