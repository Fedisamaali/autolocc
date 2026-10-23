package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
