package ServiceImpli;

import DAo.StudentDao;
import Models.Student;
import service.StudentService;


import java.util.List;


public class StudentServiceImpli implements StudentService {
StudentDao studentDao;

    @Override
    public void CreateNewStudent(Student student)  {
      Student std =  studentDao.insertStudent(student);
    }

    @Override
    public List<Student> DisplayAllStudent() {
        List<Student> std =  studentDao.displayAllStudent();

        return std;
    }



}
