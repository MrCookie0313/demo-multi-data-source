package com.example.demo.model;

public class EvaluationConfig {
    private Integer id;

    private String theme;

    private String evaluationtype;

    private String description;

    private Float score;

    private Integer num;

    @Override
    public String toString() {
        return "EvaluationConfig{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", evaluationtype='" + evaluationtype + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                ", num=" + num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getEvaluationtype() {
        return evaluationtype;
    }

    public void setEvaluationtype(String evaluationtype) {
        this.evaluationtype = evaluationtype == null ? null : evaluationtype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}