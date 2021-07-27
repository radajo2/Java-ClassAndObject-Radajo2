package model;

public class Student {
    public String studentName;
    public int studentAge;
    public String studentGender;
    public int studentIdNo;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(int studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public Student(String studentName, int studentAge, String studentGender, int studentIdNo) {
        this.studentName= studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdNo = studentIdNo;
    }
}
