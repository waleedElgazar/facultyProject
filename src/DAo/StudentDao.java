package DAo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Student;


public class StudentDao {


    public List<Student> SearchByPhone(String phone)  {
        PreparedStatement SearchByPhone;
        Connection connection = DbConnection.getConnection();
        List<Student> results = null;
        ResultSet resultSet = null;
        try {
            SearchByPhone = connection.prepareStatement("select * from student where phone = ?");
            SearchByPhone.setString(1, phone);
            resultSet = SearchByPhone.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");

            } else {

                results = new ArrayList<Student>();
                do {
                    Student s1 = new Student(
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
                    results.add(s1);
                    System.out.println(s1);
                }while (resultSet.next());

            }
            resultSet.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

        return results;
    }}

