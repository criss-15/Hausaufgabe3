package com.company;


/**
 * The type Course repository.
 */
public class CourseRepository extends InMemoryRepository<Course> {

    @Override
    /**
     * input: a course
     * update the teacher of a course
     * output: a new teacher to the course
     */
    public Course update(Course obj) {
        for (Course curs:
             repoList) {
            if(curs.getId() == obj.getId())
            {
                curs.setTeacher(obj.getTeacher());
                return curs;
            }

        }
        throw new IllegalArgumentException("Course not found!");
    }
}
