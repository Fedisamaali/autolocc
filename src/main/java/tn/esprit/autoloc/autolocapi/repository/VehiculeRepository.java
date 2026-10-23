package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
