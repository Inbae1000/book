package com.example.book.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;

@Entity
@Builder
@Getter
@Table(name="member")
@ToString(exclude = "notice")
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;

    @Column(nullable = false)
    private String pass;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDate createdDate;


}
