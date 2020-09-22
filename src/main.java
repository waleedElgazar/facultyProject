import Controller.studentController;
import Models.Student;

public class main {
    public static void main(String[] args) {
       studentController studentController=new studentController();
       studentController.update(1,new Student(2,"ahmed",15,"dasfdas","sdf",
               "fdf","sf","sf",1));
    }
}
