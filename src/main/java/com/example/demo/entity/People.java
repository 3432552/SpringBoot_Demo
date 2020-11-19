package com.example.demo.entity;
/**
 * @Author: wzh
 * @ClassName: People
 * @Description:
 * @Date: 2020/2/28 9:41
 */
public class People {
    private String hooby;

    public String getHooby() {
        return hooby;
    }

    public void setHooby(String hooby) {
        this.hooby = hooby;
    }

    @Override
    public String toString() {
        return "People{" +
                "hooby='" + hooby + '\'' +
                '}';
    }
}
