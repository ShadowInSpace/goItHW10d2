package hw10;

import hw10.entities.Client;
import hw10.entities.Ticket;
import hw10.services.ClientCrudService;
import hw10.services.PlanetCrudService;
import hw10.services.TicketCrudService;

public class Main {
    public static void main(String[] args) {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client client4 = clientCrudService.getById(4);
        PlanetCrudService planetService = new PlanetCrudService();


        Ticket ticket = new Ticket();
        ticket.setClient(client4);
        ticket.setTo(planetService.getById("MARS"));
        ticket.setFrom(planetService.getById("JUPITER"));
        TicketCrudService ticketCrudService = new TicketCrudService();
        ticketCrudService.postTicket(ticket);
        ticketCrudService.getById(7);
        ticketCrudService.deleteTicket(ticket);
        System.out.println("ticketCrudService.getById(3) = " + ticketCrudService.getById(3));

    }
}
