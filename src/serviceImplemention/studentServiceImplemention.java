package serviceImplemention;

import Models.Courses;
import Models.Exam;
import Models.Student;
import Services.studentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Dao.studentDao;

public class studentServiceImplemention implements studentService {
    studentDao dao=new studentDao();;
    @Override
    public void insertStudent(Student student) {

    }

    @Override
    public ArrayList<Student> getAllStudent() {

        return null;
    }

    @Override
    public void update(int id,Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public boolean searchName(String name) throws SQLException {
        return false;
    }

    @Override
    public boolean search(String phone) {
        return false;
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