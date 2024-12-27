package com.example.ksml2.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RestaurantCategoryId implements Serializable {

    private Long r_id;
    private Long c_id;

    public RestaurantCategoryId() {}

    public RestaurantCategoryId(Long r_id, Long c_id) {
        this.r_id = r_id;
        this.c_id = c_id;
    }
}
