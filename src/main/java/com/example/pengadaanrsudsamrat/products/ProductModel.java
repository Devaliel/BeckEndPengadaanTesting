package com.example.pengadaanrsudsamrat.products;

import com.example.pengadaanrsudsamrat.shop.ShopModel;
import com.example.pengadaanrsudsamrat.vendor.VendorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id")
    private VendorModel vendor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private ShopModel shop;

    @Column(name = "image_url")
    private String imageUrl;

    public void setVendor(VendorModel vendor) {
        this.vendor = vendor;
        if (vendor != null) {
            vendor.addProduct(this);
        }
    }

    public void setShop(ShopModel shop) {
        this.shop = shop;
        if (shop != null) {
            shop.addProduct(this);
        }
    }
}
