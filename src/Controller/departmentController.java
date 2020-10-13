package Controller;

import Models.Courses;
import Models.Department;
import Models.Student;
import Services.departmentService;
import serviceImplemention.departmentServiceImplemention;

import java.util.List;

public class departmentController {
    departmentService departmentService=new departmentServiceImplemention();

    public void insertDepartment(Department department){
        departmentService.insertDepartment(department);
    }

    public List<Department> getAllDepartmens(){
        return departmentService.getAllDepartment();
    }

    public boolean updateDepartmen(int id, Department department){
        return departmentService.update(id,department);
    }

    public boolean deleteDepartmen(int id){
        return departmentService.delete(id);
    }

    public List<Courses> getAllCoursesInDepartmen(int departmentId){
        return departmentService.getCoursesinDepartment(departmentId);
    }
    public List<Student> getAllStudentInDepartmen(int departmentId){
        return departmentService.getStudentsWithDepartment(departmentId);
    }

    public Department searchWithName(String name){
        return departmentService.search(name);
    }

    public Department searchWithId(int id){
        return departmentService.search(id);
    }
}
