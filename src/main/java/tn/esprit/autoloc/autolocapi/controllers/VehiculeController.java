package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("vehicule")
public class VehiculeController {
    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> getall() {
        return vehiculeService.consulterVehicules();

    }
    @GetMapping("/getById/{idVehicule}")
    public Vehicule getByIdVehicule(@PathVariable Long idVehicule) {
        return vehiculeService.consulterVehiculeById(idVehicule);

    }
    @DeleteMapping("/delete/{idVehicule}")
    public void supprimerVehicule(@PathVariable Long idVehicule) {
        vehiculeService.supprimerVehiculeById(idVehicule);
    }



}
