package codegym.model;

import java.util.Date;
import java.util.List;

public class Student {
    private String studentName;
    private String gender;
    private List<String> hobies;
    private String city;
    private Long phone;
    private Date birthday;

    public Student() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(String studentName, String gender, List<String> hobies, String city, Long phone, Date birthday) {
        this.studentName = studentName;
        this.gender = gender;
        this.hobies = hobies;
        this.city = city;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Student(String studentName, String gender, List<String> hobies, Long phone, Date birthday) {
        this.studentName = studentName;
        this.gender = gender;
        this.hobies = hobies;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobies() {
        return hobies;
    }

    public void setHobies(List<String> hobies) {
        this.hobies = hobies;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
