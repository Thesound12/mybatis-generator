package com.bjfu.service.impl;

import com.bjfu.dao.DeptMapper;
import com.bjfu.entity.Dept;
import com.bjfu.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;


    @Override
    public Dept selectByPrimaryKey(Integer deptno) {
        return deptMapper.selectByPrimaryKey(deptno);
    }
}
