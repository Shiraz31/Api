package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.Entity.Subject;

@Repository
public interface subjectRepository extends JpaRepository<Subject, Long>
{

}
