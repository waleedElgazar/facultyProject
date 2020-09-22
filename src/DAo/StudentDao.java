package DAo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Student;


public class StudentDao {
    public Student insertStudent(Student student) {
        PreparedStatement insertNewStudent;
        Connection connection = DbConnection.getConnection();
        try {
            insertNewStudent = connection.prepareStatement("insert into student(student_id,name,age,address,phone,gender,email,first_year,dep_id) values(?,?,?,?,?,?,?,?,?)");

            insertNewStudent.setInt(1, student.getStudent_Id());
            insertNewStudent.setString(2, student.getName());
            insertNewStudent.setInt(3, student.getAge());
            insertNewStudent.setString(4, student.getAddress());
            insertNewStudent.setString(5, student.getPhone());
            insertNewStudent.setString(6, student.getGender());
            insertNewStudent.setString(7, student.getEmail());
            insertNewStudent.setString(8, student.getFirstYear());
            insertNewStudent.setInt(9, student.getDepartmentId());
            insertNewStudent.executeUpdate();
            connection.close();

        } catch (Exception ex) {

            System.out.println(ex);
        }


        return student;
    }

    public List<Student> displayAllStudent() {
        PreparedStatement SelectAllStudent;
        Connection connection = DbConnection.getConnection();
        List<Student> results = null;
        ResultSet resultSet = null;
        try {
            SelectAllStudent = connection.prepareStatement("SELECT * FROM student");

            resultSet = SelectAllStudent.executeQuery();
            results = new ArrayList<Student>();
            while (resultSet.next()) {
                Student s=new Student(
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
               results.add(s);
                System.out.println(s);


            }
            resultSet.close();
        } catch (Exception ex) {

            System.out.println(ex);
        }

        return results;

    }}



