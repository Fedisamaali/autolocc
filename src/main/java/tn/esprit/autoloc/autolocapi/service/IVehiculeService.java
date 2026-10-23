package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    List<Vehicule> consulterVehicules();
    Vehicule consulterVehiculeById(Long idVehicule);
    void supprimerVehiculeById(Long idVehicule);
}
