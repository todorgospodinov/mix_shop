package softuni.mix_shop.model.entity;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class CategoryEntity extends BaseEntity{
    private CategoryEnum categoryEnum;
    private String description;

    public CategoryEntity() {
    }
    @Enumerated(EnumType.STRING)
    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public CategoryEntity setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
        return this;
    }
    @Column(name="description",columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
