package service;

import java.util.List;

import model.db.database;
import model.impl.Teacher;

public class TeacherService {

    public Teacher createTeacher(int groupId, String name, String lastName) {
        Teacher teacher = new Teacher(groupId, name, lastName);
        database.teacherDb.add(teacher);
        return teacher;
    }

    public Teacher getTeacher(int groupId) throws Exception{
        Teacher teacher = database.teacherDb.stream()
        .filter(s -> s.getId() == groupId)
        .findFirst()
        .orElse(null);
        if (teacher ==null){
            throw new Exception("Not find teacher");
        }
        return teacher;
    }

    public boolean getIdTeacher(int groupId){
        for (Teacher df : database.teacherDb ) {
            if (groupId==df.getId()){
                return true;
            }
        }
        return false;
    }

    public List<Teacher> getAllTeacher(){
        return database.teacherDb;
    }

}
