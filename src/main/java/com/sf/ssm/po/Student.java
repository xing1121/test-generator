package com.sf.ssm.po;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {
    	
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 课程
     */
    @Column(name = "course")
    private String course;

    /**
     * 分数
     */
    @Column(name = "score")
    private String score;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 课程
     * @return course 课程
     */
    public String getCourse() {
        return course;
    }

    /**
     * 课程
     * @param course 课程
     */
    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    /**
     * 分数
     * @return score 分数
     */
    public String getScore() {
        return score;
    }

    /**
     * 分数
     * @param score 分数
     */
    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}