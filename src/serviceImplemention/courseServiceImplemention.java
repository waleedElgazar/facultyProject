package serviceImplemention;

import Dao.courseDao;
import Models.Courses;
import Services.courseService;

import java.util.List;

public class courseServiceImplemention implements courseService {
    courseDao dao=new courseDao();
    @Override
    public void insertCourses(Courses Course) {
        dao.addCourse(Course);
    }

    @Override
    public List<Courses> getAllCourses() {
        return dao.getAllCourses();
    }

    @Override
    public void update(int id, Courses Courses1) {
        dao.update(id,Courses1);
    }

    @Override
    public void delete(int id) {
       dao.delete(id);
    }

    @Override
    public int getNumberLessthan50(int id) {
        return dao.getless50(id);
    }

    @Override
    public int getNumberOfDepartment(int id) {
        return dao.getNumberOfDepartment(id);
    }

    @Override
    public int getNumberOfDoctors(int id) {
        return dao.getnumberofdoctor(id);
    }

    @Override
    public List<Courses> getAllCoursesForDoctor(int id) {
        return dao.getcourses(id);
    }

    @Override
    public List<String> getRateForCourses(int id) {
        return dao.getRate(id);
    }

    @Override
    public Courses getTopCoursesRate() {
        return null;
    }

    @Override
    public Courses getTopCoursesTaken() {
        return null;
    }
}
