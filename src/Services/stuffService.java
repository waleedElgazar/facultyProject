
package Services;

import Models.*;

import java.util.List;

public interface stuffService {

    public void insertTeachStaff (TeachStaff TeachStaff );
    public List<TeachStaff > getAllTeachStaff ();
    public boolean update(TeachStaff  TeachStaff );
    public boolean delete(TeachStaff  TeachStaff );
    public List<Student> getTop10Student();
    public double getRateForCourse(Courses course);
    public int numberOfStudentTakenCourse(Courses course , TeachStaff  TeachStaff );
    public boolean search(String phone);
    public boolean searchByName(String name);
    public List<Courses> gtCoursesWith(TeachStaff teachStaff);


}