package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, long studentId, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }


    public long getStudentId() {
        return studentId;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


    public void addCourse(Course curs){
        enrolledCourses.add(curs);
    }



    public int totalCreditsOfaStudent(){
        int totalCredits = 0;
        for (Course courses:
            enrolledCourses) {
            totalCredits += courses.getCredits();

        }
        return totalCredits;
    }
}
