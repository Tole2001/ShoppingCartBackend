package com.shopingCartBackend.Shoping.cart.backend.Repos;

import com.shopingCartBackend.Shoping.cart.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
