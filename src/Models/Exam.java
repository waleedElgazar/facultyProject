package Moedls;

public class Exam {
    private int exam_id;
    private String content;
    private int hours;
    private int totalDegree;
    private int mini;
    private int course_Id;

    public Exam(int exam_id, String content, int hours, int totalDegree, int mini, int course_Id) {
        this.exam_id = exam_id;
        this.content = content;
        this.hours = hours;
        this.totalDegree = totalDegree;
        this.mini = mini;
        this.course_Id = course_Id;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getTotalDegree() {
        return totalDegree;
    }

    public void setTotalDegree(int totalDegree) {
        this.totalDegree = totalDegree;
    }

    public int getMini() {
        return mini;
    }

    public void setMini(int mini) {
        this.mini = mini;
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }

    @Override
    public String toString() {
        return "Moedls.Exam{" +
                "exam_id=" + exam_id +
                ", content='" + content + '\'' +
                ", hours=" + hours +
                ", totalDegree=" + totalDegree +
                ", mini=" + mini +
                ", course_Id=" + course_Id +
                '}';
    }
}