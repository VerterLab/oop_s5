package model;

import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudentGroup {
    Teacher teacher;
    List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    // @Override
    // public String toString() {
    //     return ("id =%s,"  + teacher);
    // }

    @Override
    public String toString() {

        return (teacher.name + " " + teacher.lastName + " group N: " + teacher.id + " - " + students.toString());
    }
}
