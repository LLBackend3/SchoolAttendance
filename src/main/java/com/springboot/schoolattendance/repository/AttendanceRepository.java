package com.springboot.schoolattendance.repository;

import com.springboot.schoolattendance.entity.Classname;
import com.springboot.schoolattendance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
