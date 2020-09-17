package Moedls;

public class student_degree {
    private int id;
    private int stuednt_id;
    private int exam_id;

    public student_degree(int id, int stuednt_id, int exam_id) {
        this.id = id;
        this.stuednt_id = stuednt_id;
        this.exam_id = exam_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuednt_id() {
        return stuednt_id;
    }

    public void setStuednt_id(int stuednt_id) {
        this.stuednt_id = stuednt_id;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    @Override
    public String toString() {
        return "student_degree{" +
                "id=" + id +
                ", stuednt_id=" + stuednt_id +
                ", exam_id=" + exam_id +
                '}';
    }
}
