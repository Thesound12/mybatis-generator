package com.bjfu;

import com.bjfu.dao.DeptMapper;
import com.bjfu.entity.Dept;
import com.bjfu.entity.DeptExample;
import com.bjfu.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainMybatisUse.class)
public class MybatisUseTest {
    @Autowired
    private DeptMapper deptMapper;
    @Resource
    private DeptService deptService;


    @Test
    public void testMybatis3() {
        List<Dept> depts = deptMapper.selectByExample(null);
        for (Dept dept :
                depts) {
            System.out.println(dept);
        }
    }

    @Test
    public void testMybatis3_01() {
        DeptExample deptExample = new DeptExample();

        //Criteria就是拼装查询条件的
        DeptExample.Criteria criteria = deptExample.createCriteria();
        criteria.andDeptnoBetween(20, 30);


        DeptExample.Criteria criteria1 = deptExample.createCriteria();
        criteria1.andDnameLike("%A%");
        deptExample.or(criteria1);

        List<Dept> depts = deptMapper.selectByExample(deptExample);
        for (Dept dept :
                depts) {
            System.out.println(dept);

        }
    }

    @Test
    public void test03() {
        List<Dept> depts = deptMapper.selectByExample(null);
        for (Dept dept :
                depts) {
            System.out.println(dept);
        }
    }
}
