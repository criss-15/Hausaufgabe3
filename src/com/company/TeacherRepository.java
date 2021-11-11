package com.company;
import java.util.List;

public class TeacherRepository extends InMemoryRepository<Teacher> {

    public TeacherRepository(){
        super();
    }

    @Override
    /**
     * update the list of courses to a teacher
     */
    public Teacher update(Teacher obj){
        for (Teacher teacher:
             repoList) {
            if(teacher.getId() == obj.getId())
            {
                teacher.setCourses(obj.getCourses());
                return teacher;
            }

        }
        throw new IllegalArgumentException("Teacher not found!");
    }


}
