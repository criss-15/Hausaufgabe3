package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationSystemTest {
    public RegistrationSystemTest() {
    }

    @Test
    void testRegister(){

        RegistrationSystem registrationSystem = new RegistrationSystem();
        CourseRepository RepoCourse = new CourseRepository();
        List<Student> listStudent1 = new ArrayList<>();
        List<Student> listStudent2 = new ArrayList<>();
        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();
        List<Course> courseList3 = new ArrayList<>();
        List<Course> courseList4 = new ArrayList<>();
        List<Course> courseList5 = new ArrayList<>();
        Student student1 = new Student("Daria", "Elena", 514, 24, courseList3);
        Student student3 = new Student("Medeea", "Gavriliu", 516, 22, courseList5);
        Student student2 = new Student("Carla", "Rusu", 513, 27, courseList4);
        Teacher t1 = new Teacher("Alexandra", "Samoila", courseList1, 411L);
        Teacher t2 = new Teacher("Maria", "Pop", courseList2, 412L);
        Course curs1 = new Course("Algebra", t1, 4, listStudent1, 422L, 6);
        Course curs2 = new Course("Analiza", t2, 20, listStudent2, 423L,5);


        //listele de cursuri la care predau profesorii
        courseList1.add(curs1);
        courseList2.add(curs1);
        courseList2.add(curs2);

        //listele de cursuri pe care le au studentii
        courseList3.add(curs1);
        courseList4.add(curs2);

        assertTrue(registrationSystem.register(student1, curs2));
        assertTrue(registrationSystem.register(student2, curs1));
        assertTrue(registrationSystem.register(student3, curs2));
        assertTrue(registrationSystem.register(student3, curs1));

    }

    void testRetrieveCoursesWithFreePlaces() {

        RegistrationSystem registrationSystem = new RegistrationSystem();
        CourseRepository RepoCourse = new CourseRepository();
        List<Student> listStudent1 = new ArrayList<>();
        List<Student> listStudent2 = new ArrayList<>();
        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();
        List<Course> courseList3 = new ArrayList<>();
        List<Course> courseList4 = new ArrayList<>();
        List<Course> courseList5 = new ArrayList<>();
        Student student1 = new Student("Daria", "Elena", 514, 24, courseList3);
        Student student3 = new Student("Medeea", "Gavriliu", 516, 22, courseList5);
        Student student2 = new Student("Carla", "Rusu", 513, 27, courseList4);
        Teacher t1 = new Teacher("Alexandra", "Samoila", courseList1, 411L);
        Teacher t2 = new Teacher("Maria", "Pop", courseList2, 412L);
        Course curs1 = new Course("Algebra", t1, 2, listStudent1, 422L, 6);
        Course curs2 = new Course("Analiza", t2, 20, listStudent2, 423L,5);

        //listele de cursuri la care predau profesorii
        courseList1.add(curs1);
        courseList2.add(curs1);
        courseList2.add(curs2);

        //listele de cursuri pe care le au studentii
        courseList3.add(curs1);
        courseList4.add(curs2);

        assertNotNull(registrationSystem.retrieveCoursesWithFreePlaces());

    }

    void testRetrieveStudentsEnrolledForACourse() {

        RegistrationSystem registrationSystem = new RegistrationSystem();
        CourseRepository RepoCourse = new CourseRepository();
        List<Student> listStudent1 = new ArrayList<>();
        List<Student> listStudent2 = new ArrayList<>();
        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();
        List<Course> courseList3 = new ArrayList<>();
        List<Course> courseList4 = new ArrayList<>();
        List<Course> courseList5 = new ArrayList<>();
        Student student1 = new Student("Daria", "Elena", 514, 24, courseList3);
        Student student3 = new Student("Medeea", "Gavriliu", 516, 22, courseList5);
        Student student2 = new Student("Carla", "Rusu", 513, 27, courseList4);
        Teacher t1 = new Teacher("Alexandra", "Samoila", courseList1, 411L);
        Teacher t2 = new Teacher("Maria", "Pop", courseList2, 412L);
        Course curs1 = new Course("Algebra", t1, 2, listStudent1, 422L, 6);
        Course curs2 = new Course("Analiza", t2, 20, listStudent2, 423L, 5);

        //listele de cursuri la care predau profesorii
        courseList1.add(curs1);
        courseList2.add(curs1);
        courseList2.add(curs2);

        //listele de cursuri pe care le au studentii
        courseList3.add(curs1);
        courseList3.add(curs2);

        //listele de studenti ale unui curs
        listStudent1.add(student1);
        listStudent2.add(student2);

        assertNotNull(registrationSystem.retrieveStudentsEnrolledForACourse(curs1));
    }


    void testGetALLCourses() {

        RegistrationSystem registrationSystem = new RegistrationSystem();
        CourseRepository RepoCourse = new CourseRepository();
        List<Student> listStudent1 = new ArrayList<>();
        List<Student> listStudent2 = new ArrayList<>();
        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();
        List<Course> courseList3 = new ArrayList<>();
        List<Course> courseList4 = new ArrayList<>();
        List<Course> courseList5 = new ArrayList<>();
        Student student1 = new Student("Daria", "Elena", 514, 24, courseList3);
        Student student3 = new Student("Medeea", "Gavriliu", 516, 22, courseList5);
        Student student2 = new Student("Carla", "Rusu", 513, 27, courseList4);
        Teacher t1 = new Teacher("Alexandra", "Samoila", courseList1, 411L);
        Teacher t2 = new Teacher("Maria", "Pop", courseList2, 412L);
        Course curs1 = new Course("Algebra", t1, 2, listStudent1, 422L, 6);
        Course curs2 = new Course("Analiza", t2, 20, listStudent2, 423L, 5);

        //listele de cursuri la care predau profesorii
        courseList1.add(curs1);
        courseList2.add(curs1);
        courseList2.add(curs2);

        //listele de cursuri pe care le au studentii
        courseList3.add(curs1);
        courseList3.add(curs2);

        //listele de studenti ale unui curs
        listStudent1.add(student1);
        listStudent2.add(student2);

        assertNotNull(registrationSystem.getAllCourses());
    }


}