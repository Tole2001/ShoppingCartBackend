package com.shopingCartBackend.Shoping.cart.backend.Repos;

import com.shopingCartBackend.Shoping.cart.backend.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
