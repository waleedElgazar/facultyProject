package Dao;

import Models.Exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class examDao {
    PreparedStatement pre;
    Connection connection=DBConnection.getConnection();

    public void addExam(Exam exam){
        try {
            pre=connection.prepareStatement("insert into exam (exam_id, content, hour ,toataldegree, mini , course_id)values(?,?,?,?,?,?) ");
            pre.setInt(1,exam.getExam_id());
            pre.setString(2,exam.getContent());
            pre.setInt(3,exam.getHours());
            pre.setInt(4,exam.getTotalDegree());
            pre.setInt(5,exam.getMini());
            pre.setInt(6,exam.getCourse_Id());
            pre.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Exam> getExams(){
        List<Exam> exams=new ArrayList<>();
        try {
            pre=connection.prepareStatement("select * from exam");
            ResultSet resultSet;
            resultSet=pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do {
                    Exam exam=new Exam(
                      resultSet.getInt("exam_id"),
                      resultSet.getNString("content"),
                      resultSet.getInt("hour"),
                      resultSet.getInt("toataldegree"),
                      resultSet.getInt("mini"),
                      resultSet.getInt("course_id")
                    );
                    System.out.println(exam);
                    exams.add(exam);
                } while (resultSet.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return exams;
    }

    public void update(int id,Exam exam){
        try {
            pre=connection.prepareStatement("update exam set exam_id=?, content=?, hour=? ,toataldegree=?, mini=? , course_id=? where exam_id= "+id);
            pre.setInt(1,exam.getExam_id());
            pre.setString(2,exam.getContent());
            pre.setInt(3,exam.getHours());
            pre.setInt(4,exam.getTotalDegree());
            pre.setInt(5,exam.getMini());
            pre.setInt(6,exam.getCourse_Id());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            pre=connection.prepareStatement("delete  from exam where exam_id =?");
            pre.setInt(1,id);
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
