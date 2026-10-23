package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Paiement;
import tn.esprit.autoloc.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("paiement")
public class PaiementController {
    private final IPaiementService paiementService;

    @PostMapping
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @PutMapping
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @GetMapping
    public List<Paiement> getall() {
        return paiementService.consulterPaiements();

    }
    @GetMapping("/getById/{idPaiement}")
    public Paiement getByIdPaiement(@PathVariable Long idPaiement) {
        return paiementService.consulterPaiementById(idPaiement);

    }
    @DeleteMapping("/delete/{idPaiement}")
    public void supprimerPaiement(@PathVariable Long idPaiement) {
        paiementService.supprimerPaiementById(idPaiement);
    }



}
