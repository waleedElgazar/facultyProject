package DAo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Moedls.Student;


public class StudentDao {
public Student insertStudent (Student student) throws SQLException {;
    PreparedStatement insertNewStudent;
    Connection connection = DbConnection.getConnection();
    insertNewStudent = connection.prepareStatement("insert into student(student_Id,name,age,address,phone,gender,email,first_year,dep_id) values(?,?,?,?,?,?,?,?,?)");
        try {
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

    } catch (
    SQLException sqlException) {
        sqlException.printStackTrace();

    }


    return student;
}
}
