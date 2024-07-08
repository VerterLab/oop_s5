package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    HashMap<Teacher, List<Student>> studentGrop = new HashMap<>();
    List<Student> groupStudents;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        List<Student> groupStudents = new ArrayList<>();
        for (Student student : students) {
            // groupStudents = new ArrayList<>();
            if (student.groupId == teacher.getId()) {
                groupStudents.add(student);
            }
        }
        StudentGroup sGroup = new StudentGroup(teacher, groupStudents);
        return sGroup;
    }

}
