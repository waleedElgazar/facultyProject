
package Services;

import Models.*;

import java.util.List;

public interface departmentService {

    public void insertDepartment (Department Department );
    public List<Department > getAllDepartment ();
    public boolean update(Department  Department );
    public boolean delete(Department  Department );
    public int getCoursesWithDepartment(Department departmen);
    public int getStudentsWithDepartment(Department departmen);
    public boolean search(String phone);
    public boolean search(int id);


}