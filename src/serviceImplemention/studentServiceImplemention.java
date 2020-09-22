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
    public ArrayList<Student> getAllStudent() {
        return null;
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
    public boolean search(int age) {
        return false;
    }

    @Override
    public List<Courses> getCourses(int degree) {
        return null;
    }

    @Override
    public List<Courses> getCourses(Student student) {
        return null;
    }

    @Override
    public Exam getTopExam(Student student) {
        return null;
    }

}
