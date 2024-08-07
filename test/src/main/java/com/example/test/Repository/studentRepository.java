package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.Entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Long>
{

}
