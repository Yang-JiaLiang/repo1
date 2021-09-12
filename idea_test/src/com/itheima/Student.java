package com.itheima;

public class Student<string> {
    private string name,id;
    private double score;

    public Student (string name,string id,double score){
        this.name=name;
        this.id=id;
        this.score=score;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
