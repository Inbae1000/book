package com.example.book.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Table(name="review")
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4000)
    private String title;

    @Column(length = 4000)
    private String review;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_writer")
    private Member writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Book id;

}
