package service;

import model.dto.CreateOfferDTO;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDTO createOfferDTO);
}
