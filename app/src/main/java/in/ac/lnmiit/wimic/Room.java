package in.ac.lnmiit.wimic;

/**
 * class Room
 *
 * Represents a server
 */
public class Room {

    /**
     * Name of the room
     */
    private String name;

    /**
     * IP Address of the room
     */
    private String ipAddress;

    /**
     *  Details of the room
     */
    private String details;

    /**
     * Constructor
     *
     * @param name Name of the room
     * @param ipAddress IP address of the room
     * @param details Details of the room
     */
    Room(String name, String ipAddress, String details) {
        this.name = name;
        this.ipAddress = ipAddress;
        this.details = details;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getDetails() { return details; }
}
