package Models;

public class Student {
    private int student_Id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String gender;
    private String email;
    private String firstYear;
    private int departmentId;

    public Student(int student_Id, String name, int age, String address, String phone, String gender
            , String email, String firstYear, int departmentId) {
        this.student_Id = student_Id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.firstYear = firstYear;
        this.departmentId = departmentId;
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(String firstYear) {
        this.firstYear = firstYear;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Moedls.Student{" +
                "student_Id=" + student_Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", firstYear='" + firstYear + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}