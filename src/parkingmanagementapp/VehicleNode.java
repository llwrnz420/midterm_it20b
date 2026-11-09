package parkingmanagementapp;

/**
 * Custom Data Structure Node (No java.util used)
 */
public class VehicleNode {
    String plateNumber;
    String vehicleType;
    String ownerName;
    long entryTimeMillis;
    VehicleNode next;

    public VehicleNode(String plateNumber, String vehicleType, String ownerName, long entryTimeMillis) {
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.entryTimeMillis = entryTimeMillis;
        this.next = null;
    }
}