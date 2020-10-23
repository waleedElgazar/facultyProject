import Dao.DBConnection;
import Models.birth;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class main {

    public static void main(String[] args) {
        insert();
       while (true){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime time=LocalTime.now().plusMinutes(1);
            String x=String.valueOf(formatter.format(time));
            //System.out.println(x);
            Runnable task=new task(x);
            Thread thread=new Thread(task);
            thread.start();
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insert(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        java.util.Date date=new java.util.Date();
        Date sqlDate=new Date(date.getTime());
        for (int i = 0; i < 20; i++) {
            LocalTime time=LocalTime.now().plusMinutes(1+i);
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
                    System.out.println(resultSet.getInt("id")+" "+resultSet.getDate("date")+" "+resultSet.getString("time"));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
