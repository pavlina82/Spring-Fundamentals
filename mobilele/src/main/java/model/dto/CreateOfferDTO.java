package model.dto;

import jakarta.validation.constraints.*;
import model.enums.EngineEnum;
import model.enums.TransmissionEnums;


public record CreateOfferDTO(

        @NotEmpty
        @Size(min = 5, max = 512)
        String description,

        @Positive
        @NotNull
        Long modelId,

        @NotNull
        EngineEnum engine,

        @NotNull
        TransmissionEnums transmission,

        @NotEmpty
        String imageUrl,

        @Positive
        @NotNull
        Integer mileage,

        @Positive
        @NotNull
        Integer price,

        @NotNull
        @Min(1930)
        Integer year
) {
    public static CreateOfferDTO empty() {
        return new CreateOfferDTO(null, null, null, null, null, null, null, null);
    }
}
