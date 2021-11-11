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
            System.out.println("The seats are full, please choose another course!");
            return false;
        }
        else
            if(curs.getStudentsEnrolled().contains(student))
            {
                System.out.println("The student is attending this course!");
                return false;
            }
        else
            if(student.totalCreditsOfaStudent() == 30 || student.totalCreditsOfaStudent() > 30)
            {
                System.out.println("You can't register for the course! Number of credits is already 30.");
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
     * @param Course course
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


    /**
     *
     * @param course
     * @param teacher
     * @return when a course is deleted by a teacher, all the students that were enrolled in the course, are removed from the list
     */
    public void deleteCourseByTeacher(Course course, Teacher teacher){
        if(teacher.getCourses().contains(course))
        {
            for (Student student:
                 course.getStudentsEnrolled()) {

                course.deleteStudent(student);
            }
        }
        else
            System.out.println("The teacher don't teach this course");
    }
}
