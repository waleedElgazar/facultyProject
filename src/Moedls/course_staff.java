package Moedls;

public class course_staff {
    private int id;
    private int staff_id;
    private int course_id;

    public course_staff(int id, int staff_id, int course_id) {
        this.id = id;
        this.staff_id = staff_id;
        this.course_id = course_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "course_staff{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", course_id=" + course_id +
                '}';
    }
}
