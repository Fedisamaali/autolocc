package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Equipement;
import tn.esprit.autoloc.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("equipement")
public class EquipementController {
    private final IEquipementService equipementService;

    @PostMapping
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @GetMapping
    public List<Equipement> getall() {
        return equipementService.consulterEquipements();

    }
    @GetMapping("/getById/{idEquipement}")
    public Equipement getByIdEquipement(@PathVariable Long idEquipement) {
        return equipementService.consulterEquipementById(idEquipement);

    }
    @DeleteMapping("/delete/{idEquipement}")
    public void supprimerEquipement(@PathVariable Long idEquipement) {
        equipementService.supprimerEquipementById(idEquipement);
    }



}
