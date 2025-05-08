package com.springboot.schoolattendance.repository;

import com.springboot.schoolattendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
