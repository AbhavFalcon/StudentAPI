package com.Falcon.StudentData.controller;

import com.Falcon.StudentData.controller.SchoolController;
import com.Falcon.StudentData.dto.SchoolWithAllStudentsDTO;
import com.Falcon.StudentData.entity.School;
import com.Falcon.StudentData.repository.SchoolRepository;
import com.Falcon.StudentData.service.impl.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    private final StudentService studentService;
    private SchoolRepository schoolRepository;
    public SchoolController(SchoolRepository schoolRepository, StudentService studentService) {
        this.schoolRepository = schoolRepository;
        this.studentService = studentService;
    }
    @GetMapping("/school")
    public List<School> getSchools() {return schoolRepository.findAll();}

    @PostMapping("/school")
    public School addSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }

    @GetMapping("/school/{id}")
    public ResponseEntity<SchoolWithAllStudentsDTO> getSchool(@PathVariable("id") int schoolId) {
        SchoolWithAllStudentsDTO schoolWithAllStudentsDTO = studentService.allStudents(schoolId);
        return ResponseEntity.ok(schoolWithAllStudentsDTO);
    }
}
