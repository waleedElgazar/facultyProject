package ServiceImpli;

import DAo.StudentDao;
import Models.Student;
import service.StudentService;


import java.util.List;


public class StudentServiceImpli implements StudentService {
StudentDao studentDao;



    @Override
    public List<Student> SearchByPhone(String phone )
    {
        List<Student>std=studentDao.SearchByPhone(phone);
        return std;
    }

}
