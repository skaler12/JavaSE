package pl.poznanski.transport_company.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Vehicle {

    private int vehicleId;

    private String vehicleName;

    private double fuelLevel;

    private float maxWeight;

    private boolean occupied;

    public Vehicle(String vehicleName, double fuelLevel, float maxWeight, boolean occupied) {
        this.vehicleName = vehicleName;
        this.fuelLevel = fuelLevel;
        this.maxWeight=maxWeight;
        this.occupied = occupied;
    }
}
