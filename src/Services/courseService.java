package Services;

import java.util.ArrayList;
import java.util.List;
import Models.*;

public interface courseService {
    public void insertCourses (Courses Courses );
    public ArrayList<Courses> getAllCourses ();
    public boolean update(Courses Courses, Courses  Courses1  );
    public boolean delete(Courses  Courses );
    public int getNumberLessthan50(Courses Courses);
    public int getNumberOfDepartment(Courses Courses);
    public int getNumberOfDoctors(Courses Courses);
    public List<Courses> getAllCoursesForDoctor(TeachStaff teachStuff);
    public double getRateForCourses(TeachStaff  teachStuff);
    public Courses getTopCoursesRate();
    public Courses getTopCoursesTaken();

}
