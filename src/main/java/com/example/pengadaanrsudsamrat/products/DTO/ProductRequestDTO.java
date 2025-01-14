package com.example.pengadaanrsudsamrat.products.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Product request dto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String vendorUuid;
    private String imageUrl;
}
