package controller;

import model.impl.Teacher;
import service.TeacherService;

public class TeacherController {

    private TeacherService serviceTeach = new TeacherService();

    public Teacher createTeacher(String name, String lastName) {
        int id = 0;

        return serviceTeach.createTeacher(id, name, lastName);
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

}
