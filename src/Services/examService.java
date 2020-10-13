package Services;

import Models.Exam;

import java.util.List;

public interface examService {

    public void insertExam (Exam Exam );
    public List<Exam > getAllExam ();
    public void update(int id, Exam  Exam );
    public void delete(int id);

}
