package entity.dto;

import entity.ProductCategory;
import entity.StatusEnum;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ProductDTO {

    private String title;
    private String description;
    private String midia;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoryEnum")
    private StatusEnum statusEnum;

    private String tags;
    private double price;
    private double comparationPrice;

    private ProductCategory productCategory;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public StatusEnum getCategoryEnum() {
        return statusEnum;
    }

    public void setCategoryEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getComparationPrice() {
        return comparationPrice;
    }

    public void setComparationPrice(double comparationPrice) {
        this.comparationPrice = comparationPrice;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
