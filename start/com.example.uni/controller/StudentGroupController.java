package controller;

import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService serviceGroup = new StudentGroupService();

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        return serviceGroup.createStudentGroup(teacher,students);
    }



}
