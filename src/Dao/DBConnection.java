package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 public class DBConnection {

    public static  Connection getConnection(){
        Connection connection=null;
        PreparedStatement pre;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty", "root", "root");

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
