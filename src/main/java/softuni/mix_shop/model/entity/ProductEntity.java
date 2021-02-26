package softuni.mix_shop.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "products")
public class ProductEntity extends  BaseEntity {
    private String name;
    private BigDecimal price;
    private LocalDateTime neededBefore;
    private String pictureUrl;
    private String description;
    private CategoryEntity category;

    public ProductEntity() {
    }
    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }
    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public ProductEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    @Column(name="needed_before")
    @FutureOrPresent
    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public ProductEntity setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public ProductEntity setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    @Column(name="description",columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public ProductEntity setDescription(String description) {
        this.description = description;
        return this;
    }
@ManyToOne
    public CategoryEntity getCategory() {
        return category;
    }

    public ProductEntity setCategory(CategoryEntity category) {
        this.category = category;
        return this;
    }
}
