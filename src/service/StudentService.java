package service;
import Models.Student;


import java.util.List;

public interface StudentService {

    void CreateNewStudent (Student student) ;
    List<Student> DisplayAllStudent();


}
