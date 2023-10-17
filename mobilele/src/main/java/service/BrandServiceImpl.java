package service;

import model.dto.BrandDto;
import model.dto.ModelDto;
import org.springframework.stereotype.Service;
import repository.BrandRepository;
import repository.ModelRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    public BrandServiceImpl(BrandRepository brandRepository, ModelRepository modelRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public List<BrandDto> getAllBrands() {
        return brandRepository.findAll().stream()
                .map(brand -> new BrandDto(brand.getBrand(),
                        brand.getModels().stream()
                                .map(model -> new ModelDto(model.getId(), model.getName()))
                                .sorted(Comparator.comparing(ModelDto::name))
                                .collect(Collectors.toList())))
                .sorted(Comparator.comparing(BrandDto::name))
                .collect(Collectors.toList());
    }


}
