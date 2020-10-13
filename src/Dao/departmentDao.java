package Dao;

import Models.Courses;
import Models.Department;
import Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class departmentDao {
    Connection connection = DBConnection.getConnection();
    PreparedStatement pre;

    public void insertDepartment(Department department) {
        try {
            pre = connection.prepareStatement("INSERT INTO department (department.dep_id,department.name) VALUES (?,?)");
            pre.setInt(1, department.getDepartment_id());
            pre.setString(2, department.getName());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Department> getdepartments() {
        List<Department> departments = new ArrayList<>();
        ResultSet resultSet;
        try {
            pre = connection.prepareStatement("SELECT * FROM department");
            resultSet = pre.executeQuery();
            if (resultSet.first()) {
                do {
                    Department department = new Department(
                            resultSet.getInt("dep_id"),
                            resultSet.getNString("name")
                    );
                    departments.add(department);
                } while (resultSet.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return departments;
    }

    public boolean update(int id, Department department) {
        int check = 0;
        try {
            pre = connection.prepareStatement("UPDATE department SET department.dep_id = ?,department.name = ? WHERE department.dep_id =" + id);
            pre.setInt(1, department.getDepartment_id());
            pre.setString(2, department.getName());
            check = pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check != 0;
    }

    public boolean delte(int id) {
        int check = 0;
        try {
            pre = connection.prepareStatement("DELETE FROM department WHERE department.dep_id = ?");
            pre.setInt(1, id);
            check = pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check != 0;
    }

    public List<Courses> getCoursesInDEpartment(int id) {
        List<Courses> courses = new ArrayList<>();
        ResultSet resultSet;
        try {
           pre=connection.prepareStatement("select * from courses c join course_department cd " +
                   "on c.course_id=cd.course_id where cd.department_id = ?");
           pre.setInt(1,id);
           resultSet= pre.executeQuery();
          if (!resultSet.first()) {
              System.out.println("Not found");
          }
          else{
              do {
                  Courses course = new Courses(
                          resultSet.getInt("course_id"),
                          resultSet.getNString("name"),
                          resultSet.getInt("hours"),
                          resultSet.getString("starttime"),
                          resultSet.getString("endtime")
                  );
                  courses.add(course);
                  System.out.println(course);
              }while (resultSet.next());
          }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courses;
    }

    public List<Student> getstudent(int id) {
        List<Student> students = new ArrayList<>();
        ResultSet resultSet;
        try {
            pre = connection.prepareStatement(
                    "SELECT * FROM student s " +
                            " join student_in_course sc on (s.student_id = sc.student_id) " +
                            " join course_department cd on sc.course_id =cd.course_id " +
                            " join department d on d.dep_id = cd.department_id where d.dep_id = ?"
            );
            pre.setInt(1, id);
            resultSet = pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            } else {
                do {
                    Student student=new Student(
                            resultSet.getInt("student_id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("age"),
                            resultSet.getNString("address"),
                            resultSet.getNString("phone"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("first_year"),
                            resultSet.getInt("dep_id")
                    );
                    System.out.println(student);
                    students.add(student);
                } while (resultSet.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return students;
    }

    public Department search(String name){
        ResultSet resultSet;
        Department department = null;
        try {
            pre=connection.prepareStatement("select * from department where department.name = ?");
            pre.setString(1,name);
            resultSet=pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                department=new Department(resultSet.getInt("dep_id"),resultSet.getString("name"));
                System.out.println(department);

            }
                } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return department;
    }
    public Department search(int id){
        ResultSet resultSet;
        Department department = null;
        try {
            pre=connection.prepareStatement("select * from department where department.dep_id = ?");
            pre.setInt(1,id);
            resultSet=pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                department=new Department(resultSet.getInt("dep_id"),resultSet.getString("name"));
                System.out.println(department);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return department;
    }
}