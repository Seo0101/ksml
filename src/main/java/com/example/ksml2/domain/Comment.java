package com.example.ksml2.domain;

import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    @Column(name = "cm_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "rv_id")
    private Review review;

    private String cm_coment;
}
