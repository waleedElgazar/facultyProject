import Dao.DBConnection;
import Models.birth;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
      /*  insert();
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
        }*/

        Runnable task=new FileTask();
        Thread thread=new Thread(task);
        Thread thread1=new Thread(task);
        Thread thread2=new Thread(task);
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());

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

    static class FileTask implements Runnable{

        @Override
        public void run() {
            File myObj = new File("C:\\Users\\smart\\IdeaProjects\\facultyProject\\src\\test.txt");
            Scanner myReader;
            {
                try {
                    myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                       // break;
                        System.out.println(Thread.currentThread().getName());
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
