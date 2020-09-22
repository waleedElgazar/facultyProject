package Dao;

import Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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

}
