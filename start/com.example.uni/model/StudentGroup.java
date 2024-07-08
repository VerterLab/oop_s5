package model;

import java.util.List;

import model.impl.Student;

public class StudentGroup {
    int teachId;
    List<Student> students;

    StudentGroup(int teachId, List<Student> students) {
        this.teachId = teachId;
        this.students = students;
    }

    @Override
    public String toString() {
        return ("id =%s,"  + teachId);
    }

}
