package Modles;

public class Course {
    private int Course_id;
    private String name;
    private int hours;
    private String startTime;
    private String endTime;

    public Course(int course_id, String name, int hours, String startTime, String endTime) {
        Course_id = course_id;
        this.name = name;
        this.hours = hours;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(int course_id) {
        Course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Moedls.Courses{" +
                "Course_id=" + Course_id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}