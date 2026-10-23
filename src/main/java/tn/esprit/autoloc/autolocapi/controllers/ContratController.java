package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Contrat;
import tn.esprit.autoloc.autolocapi.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("contrat")
public class ContratController {
    private final IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @GetMapping
    public List<Contrat> getall() {
        return contratService.consulterContrats();

    }
    @GetMapping("/getById/{idContrat}")
    public Contrat getByIdContrat(@PathVariable Long idContrat) {
        return contratService.consulterContratById(idContrat);

    }
    @DeleteMapping("/delete/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat) {
        contratService.supprimerContratById(idContrat);
    }



}
