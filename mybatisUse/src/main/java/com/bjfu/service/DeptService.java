package com.bjfu.service;

import com.bjfu.entity.Dept;

public interface DeptService {
    Dept selectByPrimaryKey(Integer deptno);
}
