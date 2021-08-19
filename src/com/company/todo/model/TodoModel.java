package com.company.todo.model;

import java.time.LocalDate;
import java.util.UUID;

public class TodoModel {
    private String taskName;
    private String priority;
    private String code;
    private String comment;
    private String createdBy;
    private LocalDate createdAt;
    private String assign;

    public TodoModel() {
        this.createdAt = LocalDate.now(); // obyekt yaranan kimi date de yaranacaq
        this.code = UUID.randomUUID().toString().substring(0,7);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "taskName='" + taskName + '\'' +
                ", priority='" + priority + '\'' +
                ", code='" + code + '\'' +
                ", comment='" + comment + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", assign='" + assign + '\'' +
                '}' +'\n';
    }
}
