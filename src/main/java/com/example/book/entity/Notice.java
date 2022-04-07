package com.example.book.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@Getter
@Table(name="notice")
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4000)
    private String title;

    @Column(length = 4000)
    private String content;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDate created;

    @Column(name = "view_count")
    private int viewCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "")
    private Member member;
}
