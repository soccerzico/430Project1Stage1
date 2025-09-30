import java.io.*;
import java.util.*;

public class ClientList {
    private List<Client> clients;

    public ClientList() { clients = new LinkedList<>(); }

    public void addClient(Client c) { clients.add(c); }

    public Client findClientByID(String clientID) {
        for (Client c : clients) {
            if (c.getClientID().equals(clientID)) {
                return c;
            }
        }
        return null;
    }
    public List<Client> getAllClients(){ return clients; }

    public void displayAllClients() {
        for (Client c : clients) {
            System.out.println(c);
        }
    }

    //File formating : clientID|name|address
    public void loadFromFile(String filename) throws IOException {
        try (Scanner sc = new Scanner(new File(filename))) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty() || line.startsWith("#")) continue; // Skip empty lines and comments
            
            String[] parts = line.split("\\|");
            if (parts.length != 3) {
                 System.err.println("Invalid line format: " + line);
                 continue; // Skip invalid lines
            
            }

            String id = parts[0].trim();
            String name = parts[1].trim();
            String address = parts[2].trim();
            addClient(new Client(id, name, address));

            }
        sc.close();
        }
    }
}
