package serviceImplemention;

import Models.*;

import java.util.ArrayList;
import java.util.List;
import Dao.studentDao;
import Services.studentService;

public class studentServiceImplemention implements studentService {
    studentDao dao=new studentDao();;

    @Override
    public void insertStudent(Student student) {
        dao.addStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudents();
    }

    @Override
    public void update(int id, Student student) {
        dao.update(id,student);
    }

    @Override
    public void delete(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public boolean search(String phone) {
        return false;
    }

    @Override
    public List<Student> searchName(String name)  {
        return dao.searchName(name);
    }

    @Override
    public List<Student> search(int age) {
        return dao.searchage(age);
    }

    @Override
    public List<Courses> getCourses(int degree) {
        return dao.getCourses(degree);
    }

    @Override
    public List<Courses> getCourses(String name) {
        return dao.getCourses(name);
    }

    @Override
    public Exam getTopExam(Student student) {
        return null;
    }

}
