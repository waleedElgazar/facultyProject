package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 public class DBConnection {

    public static synchronized void getConnection(){
        Connection connection;
        PreparedStatement pre;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty", "root", "root");

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
