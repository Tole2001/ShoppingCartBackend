package com.shopingCartBackend.Shoping.cart.backend.dto;

import com.shopingCartBackend.Shoping.cart.backend.model.Category;
import com.shopingCartBackend.Shoping.cart.backend.model.Image;
import com.shopingCartBackend.Shoping.cart.backend.dto.ImageDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto> images;
}