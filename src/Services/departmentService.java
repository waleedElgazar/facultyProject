
package Services;

import Models.*;

import java.util.List;

public interface departmentService {

    public void insertDepartment (Department department );
    public List<Department > getAllDepartment ();
    public boolean update(int id, Department department);
    public boolean delete(int id );
    public List<Courses> getCoursesinDepartment(int id);
    public List<Student> getStudentsWithDepartment(int id);
    public Department search(String name);
    public Department search(int id);


}