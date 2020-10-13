package serviceImplemention;

import Dao.departmentDao;
import Models.Courses;
import Models.Department;
import Models.Student;
import Services.departmentService;

import java.util.List;

public class departmentServiceImplemention implements departmentService {
    departmentDao dao=new departmentDao();

    @Override
    public void insertDepartment(Department department) {
        dao.insertDepartment(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return dao.getdepartments();
    }

    @Override
    public boolean update(int id, Department department) {
        return dao.update(id,department);
    }

    @Override
    public boolean delete(int id) {
        return dao.delte(id);
    }

    @Override
    public List<Courses> getCoursesinDepartment(int id) {
        return dao.getCoursesInDEpartment(id);
    }

    @Override
    public List<Student> getStudentsWithDepartment(int id) {
        return dao.getstudent(id);
    }

    @Override
    public Department search(String name) {
        return dao.search(name);
    }

    @Override
    public Department search(int id) {
        return dao.search(id);
    }
}
