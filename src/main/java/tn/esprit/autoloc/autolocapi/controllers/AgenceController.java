package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("agence")
public class AgenceController {
    private final IAgenceService agenceService;

    @PostMapping
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping
    public List<Agence> getall() {
        return agenceService.consulterAgences();

    }
    @GetMapping("/getById/{idAgence}")
    public Agence getByIdAgence(@PathVariable Long idAgence) {
        return agenceService.consulterAgenceById(idAgence);

    }
    @DeleteMapping("/delete/{idAgence}")
    public void supprimerAgence(@PathVariable Long idAgence) {
        agenceService.supprimerAgenceById(idAgence);
    }



}
