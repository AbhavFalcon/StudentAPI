package com.Falcon.StudentData.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    private int rollNo;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int studentId;
    private String studentName;
    private String studentEmail;
    private int studentAge;


    @JoinColumn(name = "school_id",referencedColumnName = "schoolId", nullable = false)
    private int schoolId;

    public Student() {}

    public int getRollNo() {return rollNo;}
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}
    public String getStudentName() {return studentName;}
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public String getStudentEmail() {return studentEmail;}
    public void setStudentEmail(String studentEmail) {this.studentEmail = studentEmail;}
    public int getStudentAge() {return studentAge;}
    public void setStudentAge(int studentAge) {this.studentAge = studentAge;}
    public int getSchoolId() {return schoolId;}
    public void setSchoolId(int schoolId) {this.schoolId = schoolId;}

}
