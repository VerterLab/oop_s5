package model.db;

import java.util.ArrayList;
import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class database {
    public static final List<Student> studentDb = new ArrayList<>();
    public static final List<Teacher> teacherDb = new ArrayList<>();

    public static void fillDb() {
        Teacher teacher = new Teacher(1, "Ivan", "Ivanich");
        // teacher.addGroupId(1);
        teacherDb.add(teacher);
        System.out.println(teacher + " ---< teacher");
        Student s1 = new Student(1,1,"Peta","Pipeta");
        Student s2 = new  Student(2,1,"Pit","Pitonich");
        studentDb.add(s2);
        studentDb.add(s1); 
    }
}
