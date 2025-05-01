package com.Falcon.StudentData.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Falcon.StudentData.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
