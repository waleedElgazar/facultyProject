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



}
