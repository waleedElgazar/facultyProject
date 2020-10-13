package Controller;

import Models.*;
import Services.*;
import serviceImplemention.studentServiceImplemention;

import java.sql.SQLException;

public class studentController {
   studentService studentService=new studentServiceImplemention();;

    public void addStudent(Student student){
        studentService.insertStudent(student);
    }

    public void deleteStudent(int id){
        studentService.delete(id);
    }

    public void update(int id, Student student){
        studentService.update(id,student);
    }

    public boolean searchwithName(String name) throws SQLException {
        return studentService.searchName(name);
    }

}
