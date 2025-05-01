package com.Falcon.StudentData.controller;
import com.Falcon.StudentData.dto.StudentWithSchoolDTO;
import com.Falcon.StudentData.entity.Student;
import com.Falcon.StudentData.repository.StudentRepository;
import com.Falcon.StudentData.service.impl.StudentService;
import com.Falcon.StudentData.service.impl.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;
    private StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudents() {return studentRepository.findAll();}

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @GetMapping("/student/{rollNo}/{schoolId}")
    public ResponseEntity<StudentWithSchoolDTO> getStudent(@PathVariable int rollNo, @PathVariable int schoolId) {
        StudentWithSchoolDTO student = studentService.getStudentWithSchool(rollNo, schoolId);
        return ResponseEntity.ok(student);
    }
//    // Add Service
//    @PostMapping("/student/{id}")
//    public Student updateStudent(@PathVariable int rollNo, @RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//    @DeleteMapping("/student/{id}")
//    public void deleteStudent(@PathVariable int rollNo) {
//        studentRepository.deleteById(rollNo);
//    }
}
