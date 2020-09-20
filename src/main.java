import Controller.studentController;
import Models.Student;

public class main {
    public static void main(String[] args) {
        studentController implemention=new studentController();

        implemention.update(12,new Student(25,"ahmed",22,"birka"
                ,"010","male","dfds","Sdf",1));
    }
}
