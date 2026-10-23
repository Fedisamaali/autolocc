package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import tn.esprit.autoloc.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("maintenance")
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;

    @PostMapping
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @GetMapping
    public List<Maintenance> getall() {
        return maintenanceService.consulterMaintenances();

    }
    @GetMapping("/getById/{idMaintenance}")
    public Maintenance getByIdMaintenance(@PathVariable Long idMaintenance) {
        return maintenanceService.consulterMaintenanceById(idMaintenance);

    }
    @DeleteMapping("/delete/{idMaintenance}")
    public void supprimerMaintenance(@PathVariable Long idMaintenance) {
        maintenanceService.supprimerMaintenanceById(idMaintenance);
    }



}
