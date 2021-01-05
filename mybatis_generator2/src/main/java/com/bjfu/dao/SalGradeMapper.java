package com.bjfu.dao;

import com.bjfu.entity.SalGrade;
import com.bjfu.entity.SalGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    long countByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    int deleteByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    int insert(SalGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    int insertSelective(SalGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    List<SalGrade> selectByExample(SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    int updateByExampleSelective(@Param("record") SalGrade record, @Param("example") SalGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salgrade
     *
     * @mbg.generated Tue Jan 05 11:23:47 CST 2021
     */
    int updateByExample(@Param("record") SalGrade record, @Param("example") SalGradeExample example);
}