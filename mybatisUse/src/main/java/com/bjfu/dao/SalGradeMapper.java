package com.bjfu.dao;

import com.bjfu.entity.SalGrade;
import com.bjfu.entity.SalGradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    long countByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    int deleteByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    int insert(SalGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    int insertSelective(SalGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    List<SalGrade> selectByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    int updateByExampleSelective(@Param("record") SalGrade record, @Param("example") SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 16:22:30 CST 2021
     */
    int updateByExample(@Param("record") SalGrade record, @Param("example") SalGradeExample example);
}