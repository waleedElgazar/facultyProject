package Models;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class birth {
    public int id;
    public String name;
    public Date date;
    public String time;
    public birth(int id, String name, Date date,String time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time=time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date  getDate(){
        return (date);
    }

    public String getTime(){ return time; }
}
