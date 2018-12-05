package com.sf.ssm.mapper;

import com.sf.ssm.po.Student;
import com.sf.ssm.po.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     *
     * @mbggenerated 2018-12-05
     */
    int countByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int deleteByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int insert(Student record);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int insertSelective(Student record);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    List<Student> selectByExample(StudentExample example);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    Student selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     *
     * @mbggenerated 2018-12-05
     */
    int updateByPrimaryKey(Student record);
}