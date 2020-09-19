package Services;

import java.util.List;

public interface studentService {
    public void insertStudent(Student student);
    public List <Student> getAllStudent();
    public boolean update(Student student);
    public boolean delete(Student student);
    public boolean search(String phone);
    public boolean search(int age);
    public List<Course> getCourses(int degree);
    public List<Course> getCourses(Student student);
    public Exam getTopExam(Student student);




}
