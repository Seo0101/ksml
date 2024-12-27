package com.example.ksml2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "c_id")
    private Long id;


    private String c_filter;



    private String c_content;


}
