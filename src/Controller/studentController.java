package Controller;

import Models.Courses;
import Models.Student;
import Services.studentService;
import serviceImplemention.studentServiceImplemention;


import java.util.List;

public class studentController {

    studentService studentService = new studentServiceImplemention();


    public void addStudent(Student student) {
        studentService.insertStudent(student);
    }

    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    public void deleteStudent(int id) {
        studentService.delete(id);
    }

    public void update(int id, Student student) {
        studentService.update(id, student);
    }

    public List<Student> searchwithName(String name) {
        return studentService.searchName(name);
    }

    public List<Student> searchwithAge(int age) {
        return studentService.search(age);
    }

    public List<Courses> getCoursesWithDegree(int degree) {
        return studentService.getCourses(degree);
    }

    public List<Courses> getCoursesWithStudentName(String name) {
        return studentService.getCourses(name);

    }
}