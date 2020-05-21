package com.example.demo.domain;

public class UserComment {
    private Integer muscleId;
    private Integer userId;
    private Integer commentId;
    private String  comment;

    public Integer getMuscleId() {
        return muscleId;
    }

    public void setMuscleId(Integer muscleId) {
        this.muscleId = muscleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
