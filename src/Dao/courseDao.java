package Dao;

import Models.Courses;
import Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class courseDao {
    Connection connection=DBConnection.getConnection();
    PreparedStatement pre;

    public void addCourse(Courses course){
        try {
            pre=connection.prepareStatement("insert into faculty.courses (course_id,name,hours,starttime,endtime) " +
                    "values  (?,?,?,?,?)");
            pre.setInt(1,course.getCourse_id());
            pre.setString(2,course.getName());
            pre.setInt(3,course.getHours());
            pre.setString(4,course.getStartTime());
            pre.setString(5,course.getEndTime());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Courses> getAllCourses(){
        List<Courses> courses=new ArrayList<>();
        try {
            pre=connection.prepareStatement("SELECT * FROM faculty.courses");
            ResultSet resultSet=pre.executeQuery();
            if (resultSet!=null){
                while (resultSet.next()) {
                    Courses course=new Courses(
                            resultSet.getInt("course_id"),
                            resultSet.getString("name"),
                            resultSet.getInt("hours"),
                            resultSet.getString("starttime"),
                            resultSet.getString("endtime")

                    );
                    System.out.println(course);
                    courses.add(course);
                }
            }
            else{
                System.out.println("there is no courses yet");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courses;
    }

    public void update(int id, Courses course){
        try {
            pre=connection.prepareStatement("UPDATE faculty.courses set course_id=?,name=?,hours=?,starttime=?,endtime=? " +
                    "WHERE courses.course_id="+id);
            pre.setInt(1,course.getCourse_id());
            pre.setString(2,course.getName());
            pre.setInt(3,course.getHours());
            pre.setString(4,course.getStartTime());
            pre.setString(5,course.getEndTime());
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void delete(int id){
        try {
            pre=connection.prepareStatement("DELETE FROM faculty.courses WHERE courses.course_id=?");
            pre.setInt(1,id);
            pre.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public int getless50(int id){
        int counter=0;
        try {
            ResultSet resultSet;
            pre=connection.prepareStatement("SELECT * FROM exam WHERE exam.course_id =? AND exam.toataldegree < 50");
            pre.setInt(1,id);
            resultSet=pre.executeQuery();
            while (resultSet.next()){
                counter++;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return counter;
    }

    public int getNumberOfDepartment(int id){
        int counter=0;
        try {
            ResultSet resultSet;
            pre=connection.prepareStatement("SELECT * FROM course_staff WHERE course_staff.course_id =? ");
            pre.setInt(1,id);
            resultSet=pre.executeQuery();
            while (resultSet.next()){
                counter++;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return counter;
    }

    public int getnumberofdoctor(int id){
        int counter=0;
        try {
            ResultSet resultSet;
            pre=connection.prepareStatement("SELECT * FROM course_staff WHERE course_staff.course_id =? ");
            pre.setInt(1,id);
            resultSet=pre.executeQuery();
            while (resultSet.next()){
                counter++;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return counter;
    }

    public List<Courses> getcourses(int id){

        List<Courses> courses =new ArrayList<>();
        ResultSet resultSet ;
        Set<Integer> st=new HashSet<Integer>();
        int cnt=0;
        try {
            pre=connection.prepareStatement("select * from course_staff where course_staff.staff_id = ?");
            pre.setInt(1, id);
            resultSet =pre.executeQuery();
            if (!resultSet.first()) {
                System.out.println("Not found");
            }
            else {
                do{
                    st.add(resultSet.getInt("course_id"));
                }while (resultSet.next());
                int coursesId[]=st.stream().mapToInt(Integer::intValue).toArray();
                ResultSet resultSet1;
                for (int i = 0; i < coursesId.length; i++) {
                    pre=connection.prepareStatement("select  * from courses where courses.course_id = ? ");
                    pre.setInt(1,coursesId[i]);
                    resultSet1=pre.executeQuery();
                    while (resultSet1.next()){
                        Courses courses1=new Courses(
                                resultSet1.getInt("course_id"),
                                resultSet1.getNString("name"),
                                resultSet1.getInt("hours"),
                                resultSet1.getString("starttime"),
                                resultSet1.getString("endtime")
                        );
                        courses.add(courses1);
                        System.out.println(courses1);
                    }
                }

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courses;
    }

    public List<String> getRate(int id){
        List<String>rate=new ArrayList<>();
        ResultSet resultSet;
        try {
            pre=connection.prepareStatement("SELECT * FROM course_staff where course_staff.staff_id = ?");
            pre.setInt(1,id);
            resultSet=pre.executeQuery();
            int studentId=0;
            boolean check=resultSet.first();
            int courseId=0;
            if (check){
                do{
                    courseId=(resultSet.getInt("course_id"));
                }while (resultSet.next());
            }
            pre=connection.prepareStatement("SELECT * FROM student_in_course WHERE student_in_course.course_id = ?");
            pre.setInt(1,courseId);
            resultSet=pre.executeQuery();
            check=resultSet.first();
            if (check){
                do{
                    studentId=(resultSet.getInt("student_id"));
                }while (resultSet.next());
            }
            pre=connection.prepareStatement("SELECT * FROM student_degree WHERE student_degree.student_id = ?");
            pre.setInt(1,studentId);
            resultSet=pre.executeQuery();
            check=resultSet.first();
            if (check){
                do{
                    rate.add(resultSet.getString("course_rate"));
                }while (resultSet.next());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return rate;
    }
}
