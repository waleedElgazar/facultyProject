package serviceImplemention;

import Dao.examDao;
import Models.Exam;
import Services.examService;

import java.util.List;

public class examServiceImplemention implements examService {
    examDao dao=new examDao();
    @Override
    public void insertExam(Exam Exam) {
        dao.addExam(Exam);
    }

    @Override
    public List<Exam> getAllExam() {
        return dao.getExams();
    }

    @Override
    public void update(int id, Exam Exam) {
        dao.update(id,Exam);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
