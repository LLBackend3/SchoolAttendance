package com.springboot.schoolattendance.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class Classname {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String classname;

    private String title;

    @OneToOne
    private Attendance attendance;

}
