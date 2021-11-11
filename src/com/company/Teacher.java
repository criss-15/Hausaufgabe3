package com.company;

import java.util.ArrayList;
import java.util.List;
public class Teacher extends Person{
    private List<Course> courses;
    private Long id;

    public Teacher(String firstName, String lastName, List<Course> courses, Long id) {
        super(firstName, lastName);
        this.courses = courses;
        this.id = id;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
