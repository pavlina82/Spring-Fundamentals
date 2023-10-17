package web;


import jakarta.validation.Valid;
import model.dto.CreateOfferDTO;
import model.enums.EngineEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.BrandService;
import service.OfferService;

import java.util.UUID;

@Controller
@RequestMapping("/offer")
public class OfferController {
    private final OfferService offerService;
    private final BrandService brandService;

    public OfferController(OfferService offerService, BrandService brandService) {
        this.offerService = offerService;
        this.brandService = brandService;
    }

    @ModelAttribute("engines")
    public EngineEnum[] engines() {
        return EngineEnum.values();
    }

    @GetMapping("/add")
    public String add(Model model) {
        if (!model.containsAttribute("createOfferDto")) {
            model.addAttribute("createOfferDto", CreateOfferDTO.class);
        }
        model.addAttribute("brands", brandService.getAllBrands());
        return "offer-add";
    }

    @PostMapping("/add")
    public String add(@Valid CreateOfferDTO createOfferDTO,
                      BindingResult bindingResult,
                      RedirectAttributes rAtt){
        if (bindingResult.hasErrors()){
            rAtt.addFlashAttribute("createOfferDto",createOfferDTO);
            rAtt.addFlashAttribute("org.springframework.validation.BindingResult.createOfferDTO",bindingResult);
            return "redirect:/offer/add";
        }
        UUID newOfferUUID = offerService.createOffer(createOfferDTO);

        return "redirect:/offer/" + newOfferUUID;
    }

    @GetMapping("/{uuid}")
    public String details(@PathVariable("uuid") UUID uuid){

        return "details";
    }
}
