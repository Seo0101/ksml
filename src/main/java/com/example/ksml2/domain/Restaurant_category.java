package com.example.ksml2.domain;

import jakarta.persistence.*;

@Entity
public class Restaurant_category {

    //Restaurant_category r_c = new Restaurant_category();
    //r_c.getId()
    //r_c.getRid()
    //r_c.getCid()
    //실제 테이블에선 id 필드가 생성되지 않음
    @EmbeddedId
    private RestaurantCategoryId id;

    @OneToOne
    @MapsId("r_id")
    @JoinColumn(name = "r_id")
    private Restaurant restaurant;

    @OneToOne
    @MapsId("c_id")
    @JoinColumn(name = "c_id")
    private Category category;
}
