package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
