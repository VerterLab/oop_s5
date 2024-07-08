package model.impl;

import model.User;

public class Student extends User {

    int groupId;

    public Student(int id, int groupId, String name, String lastName) {
        super(id, name, lastName);
        this.groupId = groupId;

    }
}
