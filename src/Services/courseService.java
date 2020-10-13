package Services;

import java.util.List;
import Models.*;

public interface courseService {
    public void insertCourses (Courses Courses );
    public List<Courses> getAllCourses ();
    public void update(int id, Courses  Courses1  );
    public void delete(int id );
    public int getNumberLessthan50(int id);
    public int getNumberOfDepartment(int id);
    public int getNumberOfDoctors(int Courses);
    public List<Courses> getAllCoursesForDoctor(int id);
    public List<String> getRateForCourses(int id);
    public Courses getTopCoursesRate();
    public Courses getTopCoursesTaken();

}
