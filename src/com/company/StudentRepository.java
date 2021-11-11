package com.company;

public class StudentRepository extends InMemoryRepository<Student>{

    @Override
    /**
     * update the list of EnrolledCourses to a student
     */
    public Student update(Student obj) {
        for (Student student:
             repoList) {
            if(student.getStudentId() == obj.getStudentId())
            {
                student.setEnrolledCourses(obj.getEnrolledCourses());
                return student;
            }

        }
        throw new IllegalArgumentException("Student not found!");
    }
}
