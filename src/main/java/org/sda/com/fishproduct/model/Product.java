package org.sda.com.fishproduct.model;

import org.sda.com.fishproduct.model.enums.ProductCategory;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "country_of_origin")
    private String countryOfOrigin;
    @Column(name = "promo_price")
    private Double promoPrice;
    @Column(name = "main_image_url")
    private String mainImageUrl;


    public Product() {
    }

    public Product(String name, ProductCategory category, String description, Double price, String countryOfOrigin, Double promoPrice, String mainImageUrl) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.promoPrice = promoPrice;
        this.mainImageUrl = mainImageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
