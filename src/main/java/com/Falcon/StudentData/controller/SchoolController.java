package com.Falcon.StudentData.controller;

import com.Falcon.StudentData.controller.SchoolController;
import com.Falcon.StudentData.entity.School;
import com.Falcon.StudentData.repository.SchoolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private SchoolRepository schoolRepository;
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
    @GetMapping("/school")
    public List<School> getSchools() {return schoolRepository.findAll();}

    @PostMapping("/school")
    public School addSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }

}
