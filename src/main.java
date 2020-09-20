import Controller.studentController;
import Dao.Connectionclass;
import Models.Student;
import serviceImplemention.studentServiceImplemention;
public class main {
    public static void main(String[] args) {
        studentController implemention=new studentController();
        implemention.updateStudent(3, new Student(3,"ahmed",12,"dsf"
                ,"dfs","sdf","sdf","sdf",1));
    }
}
