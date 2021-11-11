package com.company;

import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {


    CourseRepository listCourses; //creating the list of courses


    /**
     *
     * @param student
     * @param curs
     * @return true, if the student can enroll to the course
     *          false, if he already goes to that course or the course has maximum number of students
     */
    public boolean register(Student student, Course curs){
        if(curs.getStudentsEnrolled().size() == curs.getMaxEnrollment())
        {
            System.out.println("Die Platze sind voll.Wahlen sie bitte ein anderes Kurs!");
            return false;
        }
        else
            if(curs.getStudentsEnrolled().contains(student))
            {
                System.out.println("Der Student besucht diesen Kurs!");
                return false;
            }
            else
                curs.getStudentsEnrolled().add(student);
                return true;
    }

    /**
     *
     * @return the list of the courses with free places
     */
    public List<Course> retrieveCoursesWithFreePlaces()
    {
        List<Course> courseFreePlaces = new ArrayList<>();
        for (Course curs:
             listCourses.getAll()) {
            if(curs.getStudentsEnrolled().size() < curs.getMaxEnrollment())
            {
                courseFreePlaces.add(curs);
            }

        }
        return courseFreePlaces;
    }

    /**
     *
     * @param a course
     * @return the list of students enrolled to this course
     */
    public List<Student> retrieveStudentsEnrolledForACourse(Course curs)
    {
        return curs.getStudentsEnrolled();
    }

    /**
     *
     * @return all courses
     */
    public List<Course> getAllCourses()
    {
        return listCourses.getAll();
    }

}
