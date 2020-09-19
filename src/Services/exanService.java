package Services;

import java.util.List;

public interface exanService {

    public void insertExam (Exam  Exam );
    public List<Exam > getAllExam ();
    public boolean update(Exam  Exam );
    public boolean delete(Exam  Exam );

}
