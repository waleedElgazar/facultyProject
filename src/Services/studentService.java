
package Services;

import java.util.ArrayList;
import java.util.List;
import Models.*;

public interface studentService {
    public void insertStudent(Student student);
    public ArrayList<Student> getAllStudent();
    public void update(int id,Student student);
    public void delete(int id);
    public boolean search(String phone);
    public List<Student> searchName(String name);
    public boolean search(int age);
    public List<Courses> getCourses(int degree);
    public List<Courses> getCourses(Student student);
    public Exam getTopExam(Student student);




}