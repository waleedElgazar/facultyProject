package Controller;

import Models.Student;
import Services.studentService;
import serviceImplemention.studentServiceImplemention;

public class studentController {
   studentService studentService=new studentServiceImplemention();;

    public void addStudent(Student student){
        studentService.insertStudent(student);
    }

    public void deleteStudent(int id){
        studentService.delete(id);
    }

}
