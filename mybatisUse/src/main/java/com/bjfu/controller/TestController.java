package com.bjfu.controller;

import com.bjfu.entity.Dept;
import com.bjfu.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private DeptService deptService;

    @GetMapping("/dept")
    public Dept getDept() {
        Dept dept;
        dept = deptService.selectByPrimaryKey(10);
        return dept;
    }
}
