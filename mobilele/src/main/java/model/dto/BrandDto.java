package model.dto;

import java.util.List;

public record BrandDto(String name, List<ModelDto> models) {
}
