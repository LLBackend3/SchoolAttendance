package com.springboot.schoolattendance.repository;

import com.springboot.schoolattendance.entity.Attendance;
import com.springboot.schoolattendance.entity.Classname;
import com.springboot.schoolattendance.entity.Student;
import com.springboot.schoolattendance.repository.AttendanceRepository;
import com.springboot.schoolattendance.repository.ClassnameRepository;
import com.springboot.schoolattendance.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class AttendanceRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassnameRepository classnameRepository;

    @Autowired
    AttendanceRepository attendanceRepository;

    @Test
    void relationshipTest() {

        Classname classname = new Classname();
        classname.setTitle("웹 프로그래밍");
        classnameRepository.save(classname);

        Student student = new Student();
        student.setName("이진용");
        student.setClassname(classname);
        studentRepository.save(student);

        Attendance attendance = new Attendance();
        attendance.setDate(LocalDate.of(2025, 5, 7));
        attendance.setPresent(true);
        attendance.setStudent(student);
        attendanceRepository.save(attendance);

        Attendance savedAttendance = attendanceRepository.findById(attendance.getId())
                .orElseThrow(() -> new RuntimeException("Attendance not found"));
        Student savedStudent = savedAttendance.getStudent();
        Classname savedClassname = savedStudent.getClassname();

        System.out.println("Attendance: " + savedAttendance.getDate());
        System.out.println("Student: " + savedStudent.getName());
        System.out.println("Class: " + savedClassname.getTitle());
    }