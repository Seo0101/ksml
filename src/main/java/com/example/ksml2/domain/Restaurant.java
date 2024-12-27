package com.example.ksml2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    @Column(name = "r_id")
    private Long id;

    private String r_name;

    private String r_picture;

    private String r_intro;

    private String r_time;

    private String r_add;

    private String r_menu;

    private String r_number;

    private String r_info;

    private float rating_avg;

    private String r_review;


}
