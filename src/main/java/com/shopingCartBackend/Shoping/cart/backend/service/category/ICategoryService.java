package com.shopingCartBackend.Shoping.cart.backend.service.category;

import com.shopingCartBackend.Shoping.cart.backend.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);

}
