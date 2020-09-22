package src.Controller;

import DAo.StudentDao;
import Models.Student;
import ServiceImpli.StudentServiceImpli;
import service.StudentService;


import java.util.List;

public class StudentController {

    StudentService studentService;

    public static void main(String[] args) {
        Student s = new Student(3, "mohamed", 22, "tanta", "010", "male", "mmmm", "2012", 1);
        StudentDao S1 = new StudentDao();
        //S1.insertStudent(s);
          //S1.displayAllStudent();

    }
}
