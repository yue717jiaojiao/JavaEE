package com.java.code.model;

import java.util.Date;

/**
 * StudentHomework
 *
 * @author wangkm
 * @date 2020-03-05
 * @since 0.0.1
 */
public class StudentHomework {


    private Long studentId;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private String studentAnswer;

    private Date createTime;

    private Date updateTime;



    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getHomeworkTitle() {
        return homeworkTitle;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homeworkTitle = homeworkTitle;
    }

    public String getHomeworkContent() {
        return homeworkContent;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homeworkContent = homeworkContent;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setstudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
