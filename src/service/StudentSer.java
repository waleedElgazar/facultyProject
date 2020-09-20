package service;
import Moedls.Student;

import java.sql.SQLException;

public interface StudentSer {

    void CreateNewStudent (Student student) throws SQLException;
}
