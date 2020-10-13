package Dao;
import Models.*;

import java.sql.*;
import java.util.*;

public class studentDao {
    PreparedStatement pre;
    Connection connection=DBConnection.getConnection();

    public void addStudent(Student student){
        try {
            pre=connection.prepareStatement("insert into student (student_id,name,age,address,phone,gender,email,first_year,dep_id) " +
                    "values  (?,?,?,?,?,?,?,?,?)");
            pre.setInt(1,student.getStudent_Id());
            pre.setString(2,student.getName());
            pre.setInt(3,student.getAge());
            pre.setString(4,student.getAddress());
            pre.setString(5,student.getPhone());
            pre.setString(6,student.getGender());
            pre.setString(7,student.getEmail());
            pre.setString(8,student.getFirstYear());
            pre.setInt(9,student.getDepartmentId());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Student> getAllStudents(){
        List<Student> students=new ArrayList<>();
        try {
            pre=connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet;
            resultSet=pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    Student student=new Student(
                            resultSet.getInt("student_Id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("age"),
                            resultSet.getNString("address"),
                            resultSet.getNString("phone"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("first_year"),
                            resultSet.getInt("dep_id")
                    );
                    students.add(student);
                    System.out.println(student);
                }while (resultSet.next());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return students;
    }

    public void update (int id, Student student){
        try {
            pre=connection.prepareStatement("UPDATE student set student.student_id=? ," +
                    "student.name=? ,student.age=? ," +
                    "student.address=? ,student.phone=? ," +
                    "student.gender=? ,student.email=? ," +
                    "student.first_year=? ,student.dep_id=?  WHERE student.student_id="+id);
            pre.setInt(1,student.getStudent_Id());
            pre.setString(2,student.getName());
            pre.setInt(3,student.getAge());
            pre.setString(4,student.getAddress());
            pre.setString(5,student.getPhone());
            pre.setString(6,student.getGender());
            pre.setString(7,student.getEmail());
            pre.setString(8,student.getFirstYear());
            pre.setInt(9,student.getDepartmentId());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteStudent(int id){
        int del=0;
        try {
            String sql="delete from student where student_id = " + id;
            Statement statement=connection.createStatement();
            del=statement.executeUpdate(sql);

        }catch (Exception e){
            System.out.print(e);
        }
        if (del!=0) System.out.printf("deleted");
        else System.out.println("not found");
    }

    public List<Student> searchName(String name){
        List<Student> students =new ArrayList<>();
        ResultSet resultSet ;
        try {
            pre=connection.prepareStatement("select * from student where student.name = ?");
            pre.setString(1, name);
            resultSet =pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    Student student=new Student(
                            resultSet.getInt("student_Id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("age"),
                            resultSet.getNString("address"),
                            resultSet.getNString("phone"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("first_year"),
                            resultSet.getInt("dep_id")
                    );
                    students.add(student);
                    System.out.println(student);
                }while (resultSet.next());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return students;
    }

    public List<Student> searchage(int age){
        List<Student> students =new ArrayList<>();
        ResultSet resultSet ;
        try {
            pre=connection.prepareStatement("select * from student where student.age = ?");
            pre.setInt(1, age);
            resultSet =pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    Student student=new Student(
                            resultSet.getInt("student_Id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("age"),
                            resultSet.getNString("address"),
                            resultSet.getNString("phone"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("gender"),
                            resultSet.getNString("first_year"),
                            resultSet.getInt("dep_id")
                    );
                    students.add(student);
                    System.out.println(student);
                }while (resultSet.next());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return students;
    }

    public List<Courses> getCourses(int degree){
        List<Courses> courses =new ArrayList<>();
        ResultSet resultSet ;
        try {
            pre=connection.prepareStatement("select * from courses s join exam ex " +
                    "on ex.course_id= s.course_id where ex.toataldegree = ?");
            pre.setInt(1, degree);
            resultSet =pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    Courses courses1=new Courses(
                            resultSet.getInt("course_id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("hours"),
                            resultSet.getString("starttime"),
                            resultSet.getString("endtime")
                    );
                    courses.add(courses1);
                    System.out.println(courses1);
                }while (resultSet.next());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courses;
    }

    public List<Courses> getCourses(String name){
        List<Courses> courses=new ArrayList<>();
        ResultSet resultSet;
        try {
            pre=connection.prepareStatement("select * from courses c " +
                    "join student_in_course sc on c.course_id =sc.course_id " +
                    "join student s on s.student_id =sc.student_id where s.name = ?");
            pre.setString(1,name);
            resultSet =pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    Courses courses1=new Courses(
                            resultSet.getInt("course_id"),
                            resultSet.getNString("name"),
                            resultSet.getInt("hours"),
                            resultSet.getString("starttime"),
                            resultSet.getString("endtime")
                    );
                    courses.add(courses1);
                    System.out.println(courses1);
                }while (resultSet.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courses;
    }

}
