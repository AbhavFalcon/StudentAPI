package com.Falcon.StudentData.dto;

import java.util.List;

public class SchoolWithAllStudentsDTO {
    private int schoolId;
    private String schoolName;
    private String schoolCity;

    private List<StudentDTO> students;

    public int getSchoolId() {return schoolId;}
    public void setSchoolId(int schoolId) {this.schoolId = schoolId;}
    public String getSchoolName() {return schoolName;}
    public void setSchoolName(String schoolName) {this.schoolName = schoolName;}
    public String getSchoolCity() {return schoolCity;}
    public void setSchoolCity(String schoolCity) {this.schoolCity = schoolCity;}
    public List<StudentDTO> getStudents() {return students;}
    public void setStudents(List<StudentDTO> students) {this.students = students;}
}
