package com.springboot.schoolattendance.repository;

import com.springboot.schoolattendance.entity.Classname;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Classname,Long> {
}
