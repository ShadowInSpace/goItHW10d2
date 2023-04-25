package hw10;

import hw10.entities.Client;
import hw10.entities.Planet;
import hw10.entities.Ticket;
import hw10.services.ClientCrudService;
import hw10.services.PlanetCrudService;
import hw10.services.TicketCrudService;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Vasylyna");
        ClientCrudService clientCrudService = new ClientCrudService();
        clientCrudService.postClient(client);

//        Client client7 = clientCrudService.getById(7);
//        System.out.println("client7 = " + client7);

//        clientCrudService.deleteClient(client7);

//        Planet planet = new Planet();
//        planet.setId("WERTA");
//        planet.setName("Werta");

        PlanetCrudService planetService = new PlanetCrudService();
//        planetService.postPlanet(planet);
//         Planet getedPlanet= planetService.getById("WERTA");
//        System.out.println("getedPlanet = " + getedPlanet);
//        planetService.deletePlanet(getedPlanet);
//
        Ticket ticket = new Ticket();
        ticket.setClient(client);
        ticket.setTo(planetService.getById("MARS"));
        ticket.setFrom(planetService.getById("JUPITER"));
        TicketCrudService ticketCrudService = new TicketCrudService();
        ticketCrudService.postTicket(ticket);
//        ticketCrudService.getById(3);
//        ticketCrudService.deleteTicket(ticket);
        System.out.println("ticketCrudService.getById(3) = " + ticketCrudService.getById(3));

    }
}
