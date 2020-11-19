package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wzh
 * @ClassName: TestController
 * @Description:
 * @Date: 2020/2/27 16:10
 */
@RestController
public class TestController {
    @GetMapping(value = "/mes")
    public String peoMeg(){
        return "我是谁";
    }
}
