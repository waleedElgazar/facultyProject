import Dao.DBConnection;
import Models.birth;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        //insert();
        LocalTime time=LocalTime.now().plusMinutes(11);
        String x=String.valueOf(formatter.format(time));
        System.out.println(x);
        Runnable task=new task("13:59");
        Thread thread=new Thread(task);
        thread.start();
    }

    public static void insert(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        java.util.Date date=new java.util.Date();
        Date sqlDate=new Date(date.getTime());
        for (int i = 10; i < 20; i++) {
            LocalTime time=LocalTime.now().plusMinutes(3+i);
            String x=String.valueOf(formatter.format(time));
            threadTask  task=new threadTask();
            task.inserttasks(new birth(i,"name",  sqlDate,x));
        }
    }
    static class task implements Runnable{
        Connection connection= DBConnection.getConnection();
        PreparedStatement pre;
        String birthday;

        public task(String birthday){
            this.birthday=birthday;
        }
        @Override
        public void run() {
            try {
                pre=connection.prepareStatement("SELECT * FROM birth WHERE birth.time = ?");
                pre.setString(1,birthday);
                ResultSet resultSet;
                resultSet=pre.executeQuery();
                while (resultSet.next()){
                    System.out.println(resultSet.getDate("date"));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
