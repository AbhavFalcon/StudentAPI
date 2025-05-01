package com.Falcon.StudentData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School {
    @Id
    private int schoolId;
    private String schoolName;
    private String schoolCity;

    public School() {}

    public int getSchoolId() {return schoolId;}
    public void setSchoolId(int schoolId) {this.schoolId = schoolId;}
    public String getSchoolName() {return schoolName;}
    public void setSchoolName(String schoolName) {this.schoolName = schoolName;}
    public String getSchoolCity() {return schoolCity;}
    public void setSchoolCity(String schoolCity) {this.schoolCity = schoolCity;}
}
