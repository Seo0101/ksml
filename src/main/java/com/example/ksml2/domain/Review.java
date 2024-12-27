package com.example.ksml2.domain;

import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue
    @Column(name = "rv_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "r_id")
    private Restaurant restaurant;

    private String rv_comment;

    private int rv_star;
}
