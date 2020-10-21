import Dao.DBConnection;
import Models.birth;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class threadTask {
    Connection connection= DBConnection.getConnection();
    PreparedStatement pre;

    public void inserttasks(birth birth){
        try {
            pre=connection.prepareStatement("INSERT INTO birth VALUES(?,?,?,?)");
            pre.setInt(1,birth.getId());
            pre.setString(2,birth.getName());
            pre.setDate(3, birth.getDate());
            pre.setString(4,birth.getTime());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<birth> getAll(){
        List<birth> list=new ArrayList<>();
        ResultSet resultSet;
        try {
            pre=connection.prepareStatement("SELECT * FROM birth");
            resultSet=pre.executeQuery();
            while (resultSet.next()){
               birth birth=new birth(
                       resultSet.getInt("id"),
                       resultSet.getString("name"),
                       resultSet.getDate("date"),
                       resultSet.getString("time")
               );
               // System.out.println(resultSet.getInt("id")+ ": "+resultSet.getString("name")+" : "+resultSet.getString("time"));
                list.add(birth);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return list;
    }

}
