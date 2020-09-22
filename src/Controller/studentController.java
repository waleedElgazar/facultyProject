package Controller;

import Models.*;
import Services.*;
import serviceImplemention.studentServiceImplemention;

import java.sql.SQLException;
import java.util.List;

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

    public List<Student> searchwithName(String name) {
        return studentService.searchName(name);
    }

}
