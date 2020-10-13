package Controller;

import Models.Courses;
import Services.courseService;
import serviceImplemention.courseServiceImplemention;

import java.util.List;

public class courseController {
    courseService courseService=new courseServiceImplemention();
    public void addCourse(Courses course){
        courseService.insertCourses(course);
    }

    public List<Courses> getAllCourses(){
       return courseService.getAllCourses();
    }

    public void updateCourse(int id, Courses course){
        courseService.update(id,course);
    }

    public void deleteCourse(int id){
        courseService.delete(id);
    }

    public int getNumberLess50Percent(int courseId){
        return courseService.getNumberLessthan50(courseId);
    }

    public int getNumberOfDepartment(int id){
        return courseService.getNumberOfDepartment(id);
    }

    public int getNumberOfDoctorsForCourse(int courseID){
        return courseService.getNumberOfDoctors(courseID);
    }

    public List<Courses> getAllCoursesForStaff(int id){ return courseService.getAllCoursesForDoctor(id); }

    public List<String> getCourseRate(int staffID){
        return courseService.getRateForCourses(staffID);
    }
}
