package entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String midia;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoryEnum")
    private StatusEnum statusEnum;

    private String tags;
    private double price;
    private double comparationPrice;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "productEntity")
    private ProductCategory productCategory;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String title, String description, String midia, StatusEnum statusEnum, String tags, double price, double comparationPrice, ProductCategory productCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.midia = midia;
        this.statusEnum = statusEnum;
        this.tags = tags;
        this.price = price;
        this.comparationPrice = comparationPrice;
        this.productCategory = productCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
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

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}


