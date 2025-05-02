package com.Falcon.StudentData.service.impl;

import com.Falcon.StudentData.dto.SchoolDTO;
import com.Falcon.StudentData.dto.SchoolWithAllStudentsDTO;
import com.Falcon.StudentData.dto.StudentDTO;
import com.Falcon.StudentData.dto.StudentWithSchoolDTO;
import com.Falcon.StudentData.entity.School;
import com.Falcon.StudentData.entity.Student;



public interface StudentService {
    Student createStudent(StudentDTO studentDTO);
    School createSchool(SchoolDTO schoolDTO);
    StudentWithSchoolDTO getStudentWithSchool(int rollNo, int schoolId);
    SchoolWithAllStudentsDTO allStudents(int schoolId);
}
