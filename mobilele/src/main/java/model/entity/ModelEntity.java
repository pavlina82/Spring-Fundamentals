package model.entity;

import jakarta.persistence.*;
import model.enums.ModelCategoryEnums;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnums category;

    private String imageUrl;

    private int startYear;

    private int endYear;

    private LocalDateTime created;

    private LocalDateTime modified;

    @ManyToMany
    private BrandEntity brand;

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ModelCategoryEnums getCategory() {
        return category;
    }

    public ModelEntity setCategory(ModelCategoryEnums category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ModelEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getStartYear() {
        return startYear;
    }

    public ModelEntity setStartYear(int startYear) {
        this.startYear = startYear;
        return this;
    }

    public int getEndYear() {
        return endYear;
    }

    public ModelEntity setEndYear(int endYear) {
        this.endYear = endYear;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public ModelEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public ModelEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

}
