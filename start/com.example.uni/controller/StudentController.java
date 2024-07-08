package controller;

import java.util.List;

import model.impl.Student;
import service.StudentService;

public class StudentController {

    private StudentService serviceStud = new StudentService();

    public Student createStudent(int id, String name, String lastName) {
        return serviceStud.createStudent(id, name, lastName);

    }

    public Student getById(int id) {
        Student student = null;
        try {
            student = serviceStud.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudent() {
        return serviceStud.getAllStudent();
    }
}
