package com.example.category_product_app.repository;

import com.example.category_product_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Marks this interface as a Spring Data Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
