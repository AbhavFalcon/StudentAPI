package com.Falcon.StudentData.service.impl;
import com.Falcon.StudentData.dto.SchoolDTO;
import com.Falcon.StudentData.dto.SchoolWithAllStudentsDTO;
import com.Falcon.StudentData.dto.StudentDTO;
import com.Falcon.StudentData.dto.StudentWithSchoolDTO;
import com.Falcon.StudentData.entity.School;
import com.Falcon.StudentData.entity.Student;
import com.Falcon.StudentData.repository.SchoolRepository;
import com.Falcon.StudentData.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    public Student createStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setStudentName(studentDTO.getStudentName());
        student.setRollNo(studentDTO.getRollNo());
        student.setStudentAge(studentDTO.getStudentAge());
        student.setSchoolId(studentDTO.getSchoolId());
        student.setStudentEmail(studentDTO.getStudentEmail());

        return studentRepository.save(student);
    }
    public School createSchool(SchoolDTO schoolDTO) {
        School school = new School();
        school.setSchoolName(schoolDTO.getSchoolName());
        school.setSchoolId(schoolDTO.getSchoolId());
        school.setSchoolCity(schoolDTO.getSchoolCity());
        return schoolRepository.save(school);
    }
    public StudentWithSchoolDTO getStudentWithSchool(int rollNo, int schoolId) {
        Student student = studentRepository.findByRollNoAndSchoolId(rollNo, schoolId);
        School school = schoolRepository.findById(schoolId).orElse(null);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setSchoolName(school.getSchoolName());
        schoolDTO.setSchoolId(school.getSchoolId());
        schoolDTO.setSchoolCity(school.getSchoolCity());

        StudentWithSchoolDTO studentWithSchoolDTO = new StudentWithSchoolDTO();
        studentWithSchoolDTO.setStudentName(student.getStudentName());
        studentWithSchoolDTO.setRollNo(student.getRollNo());
        studentWithSchoolDTO.setSchool(schoolDTO);

        return studentWithSchoolDTO;

    }
    public SchoolWithAllStudentsDTO allStudents(int schoolId) {
        School school = schoolRepository.findById(schoolId).orElse(null);
        List<Student> students = studentRepository.findAllBySchoolId(schoolId);

        List<StudentDTO> studentDTOs = students.stream().map(student ->{
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setRollNo(student.getRollNo());
            studentDTO.setStudentName(student.getStudentName());
            studentDTO.setStudentEmail(student.getStudentEmail());
            studentDTO.setStudentAge(student.getStudentAge());
            studentDTO.setSchoolId(student.getSchoolId());
            return studentDTO;
        }).collect(Collectors.toList());


//        StudentDTO studentDTO = new StudentDTO();
//        studentDTO.setStudentName(student.getStudentName());
//        studentDTO.setRollNo(student.getRollNo());
//        studentDTO.setStudentAge(student.getStudentAge());
//        studentDTO.setStudentEmail(student.getStudentEmail());

        SchoolWithAllStudentsDTO allStudentsDTO = new SchoolWithAllStudentsDTO();
        allStudentsDTO.setSchoolId(school.getSchoolId());
        allStudentsDTO.setSchoolName(school.getSchoolName());
        allStudentsDTO.setSchoolCity(school.getSchoolCity());
        allStudentsDTO.setStudents(studentDTOs);

        return allStudentsDTO;
    }
}
