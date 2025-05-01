package com.Falcon.StudentData.dto;

public class StudentDTO {
    private int rollNo;
    private String studentName;
    private String studentEmail;
    private int studentAge;
    private int schoolId;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getStudentName() {
        return studentName;

    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public int getSchoolId() {return schoolId;}
    public void setSchoolId(int schoolId) {this.schoolId = schoolId;}
}
