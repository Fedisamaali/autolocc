package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
