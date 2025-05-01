package com.Falcon.StudentData.dto;

public class StudentWithSchoolDTO {
    private String studentName;
    private int rollNo;
    private SchoolDTO school;


    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public SchoolDTO getSchool() {
        return school;
    }
    public SchoolDTO setSchool(SchoolDTO school) {
        this.school = school;
        return school;
    }

}
