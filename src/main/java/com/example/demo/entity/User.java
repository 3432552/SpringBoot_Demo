package com.example.demo.entity;

/**
 * @Author: wzh
 * @ClassName: User
 * @Description:
 * @Date: 2020/2/27 16:16
 */
public class User {
    private String name;
    private Integer age;
    private String desc;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
