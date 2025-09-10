package com.exam.usermode.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个测试项目是否可以构建运行的测试 无需关注
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    private String TestMethod() {
        return "Start";
    }
}
