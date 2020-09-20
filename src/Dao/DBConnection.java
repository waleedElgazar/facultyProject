package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

 class DBConnection {
     static Connection connection;

    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty", "root", "root");

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
