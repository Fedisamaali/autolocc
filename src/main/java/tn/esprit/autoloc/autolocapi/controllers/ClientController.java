package tn.esprit.autoloc.autolocapi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientController {
    private final IClientService clientService;

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping
    public List<Client> getall() {
        return clientService.consulterClients();

    }
    @GetMapping("/getById/{idClient}")
    public Client getByIdClient(@PathVariable Long idClient) {
        return clientService.consulterClientById(idClient);

    }
    @DeleteMapping("/delete/{idClient}")
    public void supprimerClient(@PathVariable Long idClient) {
        clientService.supprimerClientById(idClient);
    }



}
