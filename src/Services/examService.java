package Services;

import Models.Exam;

import java.util.List;

public interface examService {

    public void insertExam (Exam Exam );
    public List<Exam > getAllExam ();
    public boolean update(Exam  Exam );
    public boolean delete(Exam  Exam );

}