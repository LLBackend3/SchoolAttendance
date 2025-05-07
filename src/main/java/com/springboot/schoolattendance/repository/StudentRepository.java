package com.springboot.schoolattendance.repository;

import com.springboot.schoolattendance.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Class,Long> {
}
