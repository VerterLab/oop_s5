package view;

import java.util.List;
import java.util.Scanner;

import controller.StudentController;
import controller.TeacherController;
import model.db.database;
import model.impl.Student;
import model.impl.Teacher;

public class View {
    private StudentController controller = new StudentController();
    private TeacherController teacherController = new TeacherController();

    public void start() {
        database.fillDb();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1- Create student");
            System.out.println("2- Find student ID");
            System.out.println("3 - Print All student");
            System.out.println("4- Create teacher");
            System.out.println("5- Find teacher ID");
            System.out.println("6 - break");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudent();
                case 4 -> createTeacher();
                case 5 -> getTeacher();
                case 6 -> System.exit(0);
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
        System.out.println(controller.getById(studId));
        return controller.getById(studId);

    };

    private List<Student> getAllStudent() {
        System.out.println(controller.getAllStudent());
        return controller.getAllStudent();
    };

    public Teacher getTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id group:");
        int groupId = scanner.nextInt();
        return teacherController.getTeacher(groupId);
    }

    private Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your lastName: ");
        String lastName = scanner.next();
        Teacher teacher = teacherController.createTeacher(name, lastName);
        return teacher;
    }
}
