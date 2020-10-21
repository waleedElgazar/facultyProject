import Models.birth;

import java.sql.Timestamp;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Runnable task=new task();
        Thread thread=new Thread(task);
       // insert();
        thread.start();
    }

    public static void insert(){

        java.util.Date date=new java.util.Date();
        Date sqlDate=new Date(date.getTime());
        for (int i = 0; i < 10; i++) {
            LocalTime time=LocalTime.now().plusMinutes(3+i);
            String x=String.valueOf(time);
            threadTask  task=new threadTask();
            task.inserttasks(new birth(i,"name",  sqlDate,x));
        }
    }
    static class task implements Runnable{
        threadTask  tasks=new threadTask();
        List<birth> births=tasks.getAll();
        java.util.Date date=new java.util.Date();
        Timestamp sqlTime=new Timestamp(date.getTime());
        String current=String.valueOf(sqlTime);
        @Override
        public void run() {
            for (int i = 0; i < births.size(); i++) {
                if (current.equals(births.get(i).getTime())){
                    System.out.println(births.get(i).getName());
                }
            }
        }
    }
}
