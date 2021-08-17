package com.yalda.WeddingAppSpringboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DrinkPackages {
    private int studentId;
    private String name;

    public DrinkPackages(@JsonProperty("id")int studentId,@JsonProperty("name") String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
