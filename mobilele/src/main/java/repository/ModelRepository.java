package repository;

import model.entity.ModelEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository {
    List<ModelEntity> findAllByBrandId(Long id);



}
