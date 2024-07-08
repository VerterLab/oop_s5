package service;

import java.util.List;

import model.db.database;
import model.impl.Student;

public class StudentService {

    public Student createStudent(int groupId, String name, String lastName) {
        int id;
        if (database.studentDb.isEmpty()) {
            id = 1;
        } else {
            id = database.studentDb.size() + 1;
        }
        Student student = new Student(id, groupId, name, lastName);
        database.studentDb.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = database.studentDb.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null) {
            throw new Exception("new Exception(Student not find");
        }
        return student;
    }

    public List<Student> getAllStudent() {

        return database.studentDb;
    }
}
