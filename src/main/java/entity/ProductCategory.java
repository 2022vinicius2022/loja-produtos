package entity;

import javax.persistence.*;

@Entity
@Table(name = "productCategory")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private ProductEntity productEntity;

    public ProductCategory() {
    }

    public ProductCategory(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
