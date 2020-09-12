package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity  {


    private static final long serialVersionUID = 6303020603988824020L;
    @Column
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
