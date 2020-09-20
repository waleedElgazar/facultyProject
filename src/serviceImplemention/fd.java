package serviceImplemention;

public class fd {
    /*
package serviceImplemention;

import Modles.*;
import Services.courseService;

import java.util.ArrayList;
import java.util.List;
import Dao.courseDao;

public class courseServiceImpl implements courseService {

    @Override
    public void insertCourse(Course Course) {
        courseDao.courses.add(Course);
    }

    @Override
    public ArrayList<Course> getAllCourse() {
        return courseDao.courses;
    }

    @Override
    public boolean update(Course Course,Course  Course1) {
        if(courseDao.courses.contains(Course)){
            courseDao.courses.remove(Course);
            courseDao.courses.add(Course1);
            System.out.println("course had been updated");
            return true;
        }
        else{
            System.out.println("course not found");
            return false;
        }

    }

    @Override
    public boolean delete(Course Course) {
        if(courseDao.courses.contains(Course)){
            courseDao.courses.remove(Course);
            System.out.println("course had been deleted");
            return true;
        }
        else{
            System.out.println("course not found");
            return false;
        }
    }

    @Override
    public int getNumberLessthan50(Course course) {
        Exam exam;
        int counter=0;
        for (int i = 0; i < courseDao.exams.size(); i++) {
            exam=courseDao.exams.get(i);
            if(exam.getTotalDegree()<50)counter++;
        }
        return counter;
    }

    @Override
    public int getNumberOfDepartment(Course course) {
        Course course1;
        int counter=0;
        for (int i = 0; i < courseDao.departmens.size(); i++) {
            course1=courseDao.courses.get(i);
           //add attrubite to course called department
        }
        return 0;
    }

    @Override
    public int getNumberOfDoctors(Course course) {
        return 0;
    }

    @Override
    public List<Course> getAllCourseForDoctor(TeachStaff teachStuff) {
        return null;
    }

    @Override
    public double getRateForCourse(TeachStaff teachStuff) {
        return 0;
    }

    @Override
    public Course getTopCourseRate() {
        return null;
    }

    @Override
    public Course getTopCourseTaken() {
        return null;
    }
}
*/
}
