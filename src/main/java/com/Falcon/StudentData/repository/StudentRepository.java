package com.Falcon.StudentData.repository;

import com.Falcon.StudentData.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByRollNoAndSchoolId(int rollNo, int schoolId);

    Student findBySchoolId(int schoolId);

    List<Student> findAllBySchoolId(int schoolId);

}
