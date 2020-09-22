import Controller.studentController;
import Models.Student;

public class main {
    public static void main(String[] args) {
       studentController studentController=new studentController();
       studentController.deleteStudent(10);
    }
}
