package com.example.ksml2;

import com.example.ksml2.domain.Category;
import com.example.ksml2.repository.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
class Ksml2ApplicationTests {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testCategory() {

        Category category = new Category();
        category.setC_content("불고기");
        category.setC_filter("한식");

        Long savedId = categoryRepository.save(category);

        Category findCategory = categoryRepository.findById(savedId);

        Assertions.assertEquals(findCategory.getC_content(), category.getC_content());
        Assertions.assertEquals(findCategory.getC_filter(), category.getC_filter());
        Assertions.assertEquals(category.getId(), findCategory.getId());
    }

}
