
package Services;

import java.util.ArrayList;
import java.util.List;
import Models.*;

public interface studentService {
    public void insertStudent(Student student);
    public List<Student> getAllStudent();
    public void update(int id,Student student);
    public void delete(int id);
    public boolean search(String phone);
    public List<Student> searchName(String name);
    public List<Student> search(int age);
    public List<Courses> getCourses(int degree);
    public List<Courses> getCourses(String studentName);
    public Exam getTopExam(Student student);


}