package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import controller.StudentGroupController;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    HashMap<Teacher, List<Student>> studentGrop = new HashMap<>();
    List<Student> groupStudents = new ArrayList<>();

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        for (Student student : students) {
            if (student.getId() == teacher.getId()) {
                groupStudents.add(student);
            }
        }
        // studentGrop.put(teacher, groupStudents);
        StudentGroup sGroup = new StudentGroup(teacher, groupStudents);
        // System.out.println(sGroup.toString());
        return sGroup;
    }

    // public StudentGroupController getGroupController() {
    //     return groupController;
    // }
}
