package view;

import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import controller.StudentGroupController;
import controller.TeacherController;
import model.StudentGroup;
import model.db.database;
import model.impl.Student;
import model.impl.Teacher;

public class View {
    private StudentController controller = new StudentController();
    private TeacherController teacherController = new TeacherController();
    private StudentGroupController groupController = new StudentGroupController();

    public void start() {
        database.fillDb();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1- Create student");
            System.out.println("2- Find student ID");
            System.out.println("3- Print all students");
            System.out.println("4- Create teacher");
            System.out.println("5- Find teacher by idGroup");
            System.out.println("6- Print all teaches");
            System.out.println("7- Print teacher group");
            System.out.println("8- Print all group");
            System.out.println("0 - break");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudent();
                case 4 -> createTeacher();
                case 5 -> getTeacher();
                case 6 -> getAllTeacher();
                case 7 -> createStudentGroup();
                case 8 -> printAllGroup();
                case 0 -> System.exit(0);
                default -> System.out.println("Operator dont use");
            }
        }
    }

    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your lastName: ");
        String lastName = scanner.next();
        System.out.println("Enter your Group Id: ");
        int idGroup = scanner.nextInt();
        Student student = controller.createStudent(idGroup, name, lastName);
        System.out.println(student);
        return student;
    };

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Id:");
        int studId = scanner.nextInt();
        // System.out.println(controller.getById(studId));
        return controller.getById(studId);

    };

    private List<Student> getAllStudent() {
        System.out.println(controller.getAllStudent());
        return controller.getAllStudent();
    };

    // --------------------------------------------------------------------
    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your lastName: ");
        String lastName = scanner.next();
        //
        System.out.println("Enter groupId: ");
        int idGroup = scanner.nextInt();
        while (teacherController.getIdTeacher(idGroup)) {
            System.out.println("ID is buzy. Enter new GroupId: ");
            idGroup = scanner.nextInt();
        }
        // System.out.println(teacherController.getIdTeacher(idGroup));
        Teacher teacher = teacherController.createTeacher(idGroup, name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    public Teacher getTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id group:");
        int groupId = scanner.nextInt();
        System.out.println(teacherController.getTeacher(groupId));
        return teacherController.getTeacher(groupId);
    }

    private List<Teacher> getAllTeacher() {
        System.out.println(teacherController.getAllTeacher());
        return teacherController.getAllTeacher();
    };

    private void createStudentGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Group Id: ");
        int idGroup = scanner.nextInt();
        System.out.println(
                groupController.createStudentGroup(teacherController.getTeacher(idGroup), controller.getAllStudent()));
        // StudentGroup sd = new StudentGroup(getTeacher(), getAllStudent());
        // return null;
    }

    private void printAllGroup() {
        List<Teacher> tch = teacherController.getAllTeacher();
        for (Teacher teacher : tch) {
            // int idGroup = teacher.getId();
            System.out.println(
                    groupController.createStudentGroup(teacher,
                            controller.getAllStudent()));
            System.out.println();
        }
    }
}
