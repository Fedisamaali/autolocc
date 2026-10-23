package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("employe")
public class EmployeController {
    private final IEmployeService employeService;

    @PostMapping
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @GetMapping
    public List<Employe> getall() {
        return employeService.consulterEmployes();

    }
    @GetMapping("/getById/{idEmploye}")
    public Employe getByIdEmploye(@PathVariable Long idEmploye) {
        return employeService.consulterEmployeById(idEmploye);

    }
    @DeleteMapping("/delete/{idEmploye}")
    public void supprimerEmploye(@PathVariable Long idEmploye) {
        employeService.supprimerEmployeById(idEmploye);
    }



}
