package controller;

import java.util.List;

import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {

    private TeacherService serviceTeach = new TeacherService();

    public Teacher createTeacher(int idGroup, String name, String lastName) {
        return serviceTeach.createTeacher(idGroup, name, lastName);
    }

    public Teacher getTeacher(int groupId) {
        Teacher teacher = null;
        try {
            teacher = serviceTeach.getTeacher(groupId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }
    public boolean getIdTeacher(int groupId){

        return serviceTeach.getIdTeacher(groupId);

    }

    public List<Teacher> getAllTeacher(){
        return serviceTeach.getAllTeacher();
    }

}
