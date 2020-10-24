package guru.springframework.guruspring2petclinic.controllers;

import guru.springframework.guruspring2petclinic.services.map.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerMapService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notImplementedYet";
    }
}
