package Controller;

import Models.Exam;
import Services.examService;
import serviceImplemention.examServiceImplemention;

import java.util.List;

public class examController {
    examService service=new examServiceImplemention();
    public void AddNewExam(Exam exam){
        service.insertExam(exam);
    }
    public void updateExam(int id,Exam exam){
        service.update(id,exam);
    }
    public List<Exam> getAllExams(){
        return service.getAllExam();
    }
    public void deleteExam(int id){
        service.delete(id);
    }
}
