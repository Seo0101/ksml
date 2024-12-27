package com.example.ksml2.repository;

import com.example.ksml2.domain.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(Category category) {
        em.persist(category);
        return category.getId();
    }

    public Category findById(Long id) {
        return em.find(Category.class, id);
    }
}
