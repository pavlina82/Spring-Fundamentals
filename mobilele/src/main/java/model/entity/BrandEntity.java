package model.entity;

import jakarta.persistence.*;
import org.hibernate.validator.internal.util.stereotypes.Lazy;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    private LocalDate created;

    private LocalDate modified;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
    private List<ModelEntity> models;

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public BrandEntity setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public LocalDate getModified() {
        return modified;
    }

    public BrandEntity setModified(LocalDate modified) {
        this.modified = modified;
        return this;
    }

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }
}
