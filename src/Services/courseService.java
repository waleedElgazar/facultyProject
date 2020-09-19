package Services;

import java.util.ArrayList;
import java.util.List;
import Modles.Course;

public interface courseService {
    public void insertCourse (Course Course );
    public ArrayList<Course> getAllCourse ();
    public boolean update(Course Course, Course  Course1  );
    public boolean delete(Course  Course );
    public int getNumberLessthan50(Course course);
    public int getNumberOfDepartment(Course course);
    public int getNumberOfDoctors(Course course);
    public List<Course> getAllCourseForDoctor(TeachStuff teachStuff);
    public double getRateForCourse(TeachStuff  teachStuff);
    public Course getTopCourseRate();
    public Course getTopCourseTaken();

}
