package pl.poznanski.transport_company.dto;

import pl.poznanski.transport_company.entity.Vehicle;

import java.io.IOException;

public interface VehicleSetup {
    public double getFuelLevel();

    public default String getVehicleData(Vehicle vehicle) {
        return vehicle.toString();
    }
    void startEngine(Vehicle vehicle) throws IOException;
    String stopEngine(Vehicle vehicle);
    boolean ifEngineRun(Vehicle vehicle);

}