package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationController {
    private final IReservationService reservationService;

    @PostMapping
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getall() {
        return reservationService.consulterReservations();

    }
    @GetMapping("/getById/{idReservation}")
    public Reservation getByIdReservation(@PathVariable Long idReservation) {
        return reservationService.consulterReservationById(idReservation);

    }
    @DeleteMapping("/delete/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation) {
        reservationService.supprimerReservationById(idReservation);
    }



}
