public class Client {
    private String clientID;
    private String name;
    private String address;

    // Constructor
    public Client(String clientID, String name, String address) {
        if (clientID == null || clientID.isEmpty()) {
            throw new IllegalArgumentException("ClientID required");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name required");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address required");
        }

        this.clientID = clientID;
        this.name = name; 
        this.address = address;
    }

    // Getters
    public String getClientID() { return clientID;  }
    public String getName() { return name; }
    public String getAddress() { return address; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return clientID + " | " + name + " | " + address;
    }
}
