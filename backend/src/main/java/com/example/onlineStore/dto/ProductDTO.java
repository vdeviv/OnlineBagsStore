package com.example.onlineStore.dto;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String nameProduct,
        String imageUrl,
        String description,
        BigDecimal price,
        Integer stock
) {}
