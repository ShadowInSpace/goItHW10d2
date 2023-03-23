package hw10;

import hw10.entities.Client;
import hw10.entities.Planet;
import hw10.Services.ClientCrudService;
import hw10.Services.PlanetCrudService;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Vasylyna");
        ClientCrudService clientCrudService = new ClientCrudService();
        clientCrudService.postClient(client);

        Client client7 = clientCrudService.getById(7);
        System.out.println("client7 = " + client7);

        clientCrudService.deleteClient(client7);

        Planet planet = new Planet();
        planet.setId("WERTA");
        planet.setName("Werta");

        PlanetCrudService planetService = new PlanetCrudService();
        planetService.postPlanet(planet);
         Planet getedPlanet= planetService.getById("WERTA");
        System.out.println("getedPlanet = " + getedPlanet);
        planetService.deletePlanet(getedPlanet);

        }
}
