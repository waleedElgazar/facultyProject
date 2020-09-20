package Controller;

import Moedls.Student;
import ServiceImpli.StudentSerImpli;
import service.StudentSer;

import java.sql.SQLException;

public class StudentController {

    StudentSer studentSer;

    public void inserStudent(Student student) throws SQLException {
        studentSer = new StudentSerImpli();
        studentSer.CreateNewStudent(student);


    }

    public static void main(String[] args) {
        Student s= new Student(1,"mohamed",22,"tanta","010","male","mmmm","2012",2);
    }
}
