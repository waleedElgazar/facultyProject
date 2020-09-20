package ServiceImpli;

import DAo.StudentDao;
import Moedls.Student;
import service.StudentSer;

import java.sql.SQLException;


public class StudentSerImpli implements StudentSer {
StudentDao studentDao;

    @Override
    public void CreateNewStudent(Student student) throws SQLException {
      Student std =  studentDao.insertStudent(student);
    }

}
