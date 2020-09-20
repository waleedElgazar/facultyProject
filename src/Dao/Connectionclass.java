package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 public class Connectionclass {

    public static synchronized void getConnection(){
        Connection connection;
        PreparedStatement pre;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty", "root", "root");
            pre=connection.prepareStatement("insert into courses (course_id,name,hours,starttime,endtime) values  (?,?,?,?,?)");
            pre.setInt(1,10);
            pre.setString(2,"fdfd");
            pre.setInt(3,12);
            pre.setString(4,"12");
            pre.setString(5,"20");
            pre.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
